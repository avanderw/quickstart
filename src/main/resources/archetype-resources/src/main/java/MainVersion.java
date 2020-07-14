package ${package};

import picocli.CommandLine;

public class MainVersion implements CommandLine.IVersionProvider {
    @Override
    public String[] getVersion() throws Exception {
        return new String[]{getClass().getPackage().getImplementationVersion()};
    }
}
