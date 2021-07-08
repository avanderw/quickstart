package ${package};

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MainCliTest {
    private static CliTester cliTester;

    @BeforeClass
    public static void beforeClass() {
        cliTester = new CliTester();
    }

    public void testHelp() {
        cliTester.execute("--help").success();
    }

    @Test(timeout = TestConstant.PERFORMANCE_TIMEOUT)
    public void testVersion() {
        cliTester.execute("--version").success()
                .contains("Unknown");
    }

    @Test(timeout = TestConstant.PERFORMANCE_TIMEOUT)
    public void testMain() {
        cliTester.execute().success()
                .contains("Usage");
    }
}