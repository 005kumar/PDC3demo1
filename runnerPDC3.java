package seleniumbasic.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\PDC3B-Training.PDC3B\\eclipse-workspace\\cucumber\\myfeatures\\sefrd.feature", glue= {"seleniumbasic.cucumber"},

tags= {"@Regression"})
public class runnerPDC3 {
	


}
