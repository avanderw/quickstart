package ${package};

import org.tinylog.Logger;
import picocli.CommandLine;

import java.util.HashMap;
import java.util.Map;

public class DaggerFactory implements CommandLine.IFactory {
    private final CommandLine.IFactory fallbackFactory = CommandLine.defaultFactory();
    private final MainComponent mainComponent;
    private final Map<String, Object> cache = new HashMap<>();

    public DaggerFactory(final MainComponent mainComponent) {
        this.mainComponent = mainComponent;
    }

    @Override
    public <K> K create(final Class<K> aClass) throws Exception {
        if (cache.isEmpty()) {
            createCache();
        }
        if (cache.containsKey(aClass.getCanonicalName())) {
            return (K) cache.get(aClass.getCanonicalName());
        } else {
            Logger.debug("Falling back to picocli injector for {}", aClass);
            return fallbackFactory.create(aClass);
        }
    }

    private void createCache() {
        cache.put(MainCli.class.getCanonicalName(), mainComponent.mainCli());
    }
}
