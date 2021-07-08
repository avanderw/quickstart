package ${package};

import org.tinylog.Logger;
import picocli.CommandLine;

/**
 * Version provider for picocli which calculates the version from build files.
 * <p>
 * The aim is to have one class that can be copied between projects.
 * The reason is that I hate dependency management on my own classes.
 * I have no problem with duplication, it makes code more modular.
 *
 * @version 2021-07-08: Removed test code
 * 2020-10-07: Added javadoc
 */
public class MainVersion implements CommandLine.IVersionProvider {
    /**
     * Return as soon as a version is found. The order of the lookup is:
     * - manifest       : When built as a jar
     * - pom.properties : When target directory exists
     *
     * @return The version specified in the pom
     */
    @Override
    public String[] getVersion() {
        if (getClass().getPackage().getImplementationVersion() == null) {
            Logger.warn("Implementation version not found in META-INF. You can add this to your pom:\n" +
                    "<plugin>\n" +
                    "    <groupId>org.apache.maven.plugins</groupId>\n" +
                    "    <artifactId>maven-jar-plugin</artifactId>\n" +
                    "    <version>3.2.0</version>\n" +
                    "    <configuration>\n" +
                    "        <archive>\n" +
                    "            <manifest>\n" +
                    "                <addDefaultImplementationEntries>true</addDefaultImplementationEntries>\n" +
                    "                <addDefaultSpecificationEntries>true</addDefaultSpecificationEntries>\n" +
                    "            </manifest>\n" +
                    "        </archive>\n" +
                    "    </configuration>\n" +
                    "</plugin>");
            return new String[]{"Unknown"};
        } else {
            Logger.debug("Getting version from META-INF");
            return new String[]{getClass().getPackage().getImplementationVersion()};
        }
    }
}
