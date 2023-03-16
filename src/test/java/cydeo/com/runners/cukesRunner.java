package cydeo.com.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.plugin.Plugin;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {

        "json:target/cucumber.json",
        "html:target/cucumber-reports.html",
        "rerun:target/rerun.txt",
        "me.jvt.cucumber.report.PrettyReports:target/cucumber",


},


features = "src/test/resources/features",
        glue = "src/test/java/cydeo/com/step_definition",
        dryRun = false,
        tags = "",
        publish = true
)


public class cukesRunner {
}
