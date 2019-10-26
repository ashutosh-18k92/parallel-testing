package StepDefs;

import global.services.GlobalDAOv2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

/**
 * Created by ashutosh on 9/27/2019.
 */
public class staticStepDefv2 {
    GlobalDAOv2 globalDAOv2 = new GlobalDAOv2();
    
    @Given("I initialize GlobalDAOv2 with {int}")
    public void i_initialize_GlobalDAOv2_with(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        globalDAOv2.setCount(int1);

    }

    @When("I increment the GlobalDAOv2 by {int}")
    public void i_increment_the_GlobalDAOv2_by(Integer int1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        globalDAOv2.setCount(globalDAOv2.getCount()+1);
        Thread.sleep(3000);

    }

    @Then("I should get it as {int}")
    public void i_should_get(Integer result) {
        // Write code here that turns the phrase above into concrete actions
        Integer actual = globalDAOv2.getCount();
        Assert.assertEquals(actual,result);

    }
}
