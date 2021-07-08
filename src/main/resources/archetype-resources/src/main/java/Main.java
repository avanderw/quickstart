package ${package};

import picocli.CommandLine;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public final class Main {
    private Main() {
    }

    public static void main(final String[] args) {
        CommandLine commandLine = new CommandLine(MainCli.class, new DaggerFactory(DaggerMainComponent.create()));
        commandLine.setCaseInsensitiveEnumValuesAllowed(true);
        commandLine.setOut(new PrintWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8), true));
        commandLine.setErr(new PrintWriter(new OutputStreamWriter(System.err, StandardCharsets.UTF_8), true));
        commandLine.execute(args);
    }
}
