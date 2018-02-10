package poc.cucumber.extent.runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

import java.io.File;

/**
 * Please notice that cucumber.examples.java.testNG.stepDefinitions.BeforeAfterHooks class
 * is in the same package as the steps definitions.
 * It has two methods that are executed before or after scenario.
 * I'm using it to delete cookies and take a screenshot if scenario fails.
 */
@CucumberOptions(
        features = "target/test-classes/features",
        glue = {"poc.cucumber.extent.runners.stepDefinitions"},
        format = {"pretty",
                "json:target/cucumber-report/firefox/cucumber.json",
                "com.cucumber.listener.ExtentCucumberFormatter:"})
public class RunCukesTestInFirefox extends AbstractTestNGCucumberTests {

//    @AfterClass
//    public static void afterClass(){
//        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
//        Reporter.setSystemInfo("user", System.getProperty("user.name"));
//        Reporter.setSystemInfo("os", "Mac OSX2");
//        Reporter.setTestRunnerOutput("Sample test runner output message");
//    }
}