package ${package};

import org.tinylog.Logger;
import picocli.CommandLine.Command;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Spec;

@Command(name = "${artifactId}", description = "${tagline}",
        versionProvider = MainVersion.class, mixinStandardHelpOptions = true,
        subcommands = {})
public class MainCli implements Runnable {
    @Spec
    private CommandSpec spec;

    /**
     * Entry point for picocli.
     */
    @Override
    public void run() {
        Logger.debug("MainCli.java entry point. Start coding here");
        spec.commandLine().usage(spec.commandLine().getOut());
    }
}
