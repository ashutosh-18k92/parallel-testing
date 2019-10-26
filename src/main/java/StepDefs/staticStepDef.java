package StepDefs;

import global.services.GlobalDAO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

/**
 * Created by ashutosh on 9/27/2019.
 */
public class staticStepDef {
    @Given("I initialize GlobalDAO with {int}")
    public void i_initialize_GlobalDAO_with(Integer int1) {
        GlobalDAO.setCount(int1);
    }

    @When("I increment the GlobalDao by {int}")
    public void i_increment_the_GlobalDao_by(Integer int1) throws InterruptedException {
        GlobalDAO.setCount(GlobalDAO.getCount()+1);
        Thread.sleep(1000);

    }

    @Then("I should get {int}")
    public void i_should_get(Integer result) {
        Integer actual = GlobalDAO.getCount();
        Assert.assertEquals(actual,result);

    }
}
