package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/allFeatureFiles",
		glue="stepDefinition",
		dryRun=true
		)
public class RunnerStep extends AbstractTestNGCucumberTests{

	
	
}
