package test;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources",
        stepNotifications = true,
        plugin = "pretty",
        glue = {"test.automation"})
public class CucumberTestSuite {

}
