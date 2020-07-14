package $

import com.google.inject.name.Names;
import net.avdw.property.AbstractPropertyModule;

import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

{package};

class MainModule extends AbstractPropertyModule {
    @Override
    protected void configure() {
        Properties properties = configureProperties();
        Names.bindProperties(binder(), properties);
        bind(List.class).to(LinkedList.class);
    }

    @Override
    protected Properties defaultProperties() {
        Properties properties = new Properties();
        return properties;
    }
}
