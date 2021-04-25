package system.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/system/features",
        monochrome = false,
        tags = "@E2E",
        glue = "system/stepDefinitions",
        dryRun = false,
        plugin = "pretty",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true
)

public class Runner {
}
