package ${package};

import org.tinylog.Logger;
import picocli.CommandLine;

@CommandLine.Command(name = "${artifactId}", description = "Some fancy description", version = "${version}",
        versionProvider = MainVersion.class, mixinStandardHelpOptions = true,
        subcommands = {})
public class MainCli implements Runnable {

    /**
     * Entry point for picocli.
     */
    @Override
    public void run() {
        Logger.debug("MainCli.java entry point. Start coding here");
    }
}
