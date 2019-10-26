package StepDefs;

import global.services.GlobalDAO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.Assertion;

/**
 * Created by ashutosh on 9/28/2019.
 */
public class oneMoreStepDef {
    @Given("I have {int}")
    public void i_have(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        GlobalDAO.setCount(int1);

    }

    @When("I add {int}")
    public void i_add(Integer int1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        GlobalDAO.setCount(GlobalDAO.getCount()+int1);
        Thread.sleep(2000);

    }

    @Then("I get {int}")
    public void i_get(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        Integer actual = GlobalDAO.getCount();
        Assert.assertEquals(actual,int1);
    }
}
