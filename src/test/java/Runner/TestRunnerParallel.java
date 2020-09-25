package Runner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src\\test\\java\\Features", 
		glue = "StepDefinitions", 
		plugin = "pretty", 
		strict = true
)

@Test
public class TestRunnerParallel extends AbstractTestNGCucumberTests 
{
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
