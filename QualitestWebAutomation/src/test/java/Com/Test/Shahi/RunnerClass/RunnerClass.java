package Com.Test.Shahi.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features" }, glue = { "Com.Test.Shahi.StepDefinitions",
		"Com.Test.Shahi.QualitestWebAutomation" }, tags = "@test or @test1", plugin = { "pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/" })

public class RunnerClass {
}
