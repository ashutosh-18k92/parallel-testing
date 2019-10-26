package StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;

/**
 * Created by ashutosh on 9/29/2019.
 */
public class MultiThreadTest {
    private Integer response;
    private static ThreadLocal<Integer> response2 = new ThreadLocal<Integer>();
    @Given("I have a response variable")
    public void i_have_a_response_variable() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("I create a Runnable to set {int}")
    public void i_create_a_Runnable_to_set(Integer int1) {
        Integer altResponse = int1;
        Runnable r = ()->{
                given().
                        when().
                        get("http://ergast.com/api/f1/2017/circuits.json").
                        then().
                        assertThat().
                        body("MRData.CircuitTable.Circuits.circuitId", hasSize(20));
                response = int1;
        };
        Thread t = new Thread(r,"Response_Getter");
        t.start();
        response2.set(int1);
        try {
            System.out.printf("Waiting for %s \n",t.getName());
            t.join();
            System.out.println(response2.get());
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Then("I should get same {int}")
    public void i_should_get_same(Integer int1) {

            Assert.assertEquals(response, int1, "Response failed.");
            Assert.assertEquals(response2.get(),int1,"Response2 failed");

    }
}
