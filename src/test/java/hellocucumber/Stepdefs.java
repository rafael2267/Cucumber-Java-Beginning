package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static hellocucumber.Resources.isItFriday;
import static org.junit.Assert.*;

public class Stepdefs {
  private String today;
  private String actualAnswer;

  @Given("^today is \"([^\"]*)\"$")
  public void today_is(String today) {
    this.today = today;
  }

  @When("^I ask whether it's Friday yet$")
  public void i_ask_whether_it_s_Friday_yet() {
      this.actualAnswer = isItFriday(today);
  }

  @Then("^I should be told \"([^\"]*)\"$")
  public void i_should_be_told(String expectedAnswer) {
      assertEquals(expectedAnswer, actualAnswer);
  }
}