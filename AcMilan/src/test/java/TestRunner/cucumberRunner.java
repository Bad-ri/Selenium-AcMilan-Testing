package TestRunner;

import Base.browserBase;
import io.cucumber.java.AfterAll;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterTest;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\resources\\Feature",
        glue = "stepDefination",
        tags = "@Smoke" ,
        plugin = { "pretty", "html:test-output/cucumber-reports.HTML" },
        monochrome = true
)
public class cucumberRunner {

}

