package RunnerPackage;

import org.junit.*;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\HP\\eclipse-workspace\\NewWork\\DemoCucumber\\src\\test\\resources\\Demofeature.feature", // feature file location
		glue = "StepsPackage", // Steps Package location
		dryRun = false, //true -- snippets(java codes for feature file scenarios), false --- execution
		monochrome = true, //true -- beautify the console and //false --- normal console 
		plugin = {"pretty","html:target/htmlreport.html",
							"json:target/jsonreport.json",
							"json:C:\\Users\\HP\\eclipse-workspace\\NewWork\\DemoCucumber\\Report\\jvmreport.json"},//reporting
		tags = "@smoke"
		)

public class RunnerClass {
	
	@AfterClass
	public static void afterclass() {
		JVMReporting.generatejvmreport("C:\\Users\\HP\\eclipse-workspace\\NewWork\\DemoCucumber\\Report\\jvmreport.json");
	}
}
