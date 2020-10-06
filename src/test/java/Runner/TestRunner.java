package Runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions( features = "src\\test\\java\\Features",
				  glue = "StepDefinitions",
				  plugin = "pretty",
				  strict = true,
				  tags = "@Present or @Display")

@Test
public class TestRunner extends AbstractTestNGCucumberTests {	

}
