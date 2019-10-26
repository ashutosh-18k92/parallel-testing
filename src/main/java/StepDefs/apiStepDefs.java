package StepDefs;

import global.services.GlobalDAO;
import global.services.GlobalDAOv2;
import global.services.ProductDAO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.internal.common.assertion.Assertion;
import org.joda.time.LocalDate;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashutosh on 9/27/2019.
 */
public class apiStepDefs {
    String name;
    Integer count;
    @Given("I have a set of global variables {string}")
    public void i_have_a_set_of_global_variables(String name) throws InterruptedException {
        System.out.printf("Initialize with %s\n",name   );
        setNameviaProductDAO(name);
//        Thread.sleep(2000);
    }

    @And("I initialize them with some value {int}")
    public void i_initialize_them_with_some_value(Integer count) throws InterruptedException {
        System.out.printf("Initialize with %d\n",count);
        GlobalDAO.setCount(count);

    }

    public void setNameviaProductDAO(String name) throws InterruptedException {
        ProductDAO.processGlobalDAO(name);
    }

    @When("I use their value")
    public void i_use_their_value() throws InterruptedException {
        name = GlobalDAO.getName();
        count = GlobalDAO.getCount();
        Thread.sleep(2000);
    }

    @Then("The values should be consistent")
    public void the_values_should_be_consistent() {
        Integer expec = GlobalDAO.getCount();
        Assert.assertEquals(Integer.toString(expec),Integer.toString(count));
        Assert.assertEquals(name,GlobalDAO.getName());
    }
}
