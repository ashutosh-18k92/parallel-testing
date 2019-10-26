package TestRunners;

import io.cucumber.testng.CucumberFeatureWrapper;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.PickleEventWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 * Created by ashutosh on 9/27/2019.
 */
@CucumberOptions(
        features = "classpath:Features/oneMore.feature",
        glue = {"StepDefs"},
        tags = {"@parallelTest"}
)
public class oneMoreTestRunner {
    TestNGCucumberRunner tcr;

    @BeforeClass(alwaysRun = true)
    public void setUpclass() {
        tcr = new TestNGCucumberRunner(this.getClass());

    }

    @Test(dataProvider = "scenarios")
    public void runScenario(PickleEventWrapper pickleEventWrapper, CucumberFeatureWrapper cfr) throws Throwable {
        tcr.runScenario(pickleEventWrapper.getPickleEvent());

    }

    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return tcr.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        tcr.finish();
    }
}
