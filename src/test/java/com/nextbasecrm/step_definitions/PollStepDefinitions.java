package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.pages.PollPage;
import com.nextbasecrm.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class PollStepDefinitions {


    PollPage pollPage = new PollPage();


    @Given("user is on poll module")
    public void user_is_on_poll_module() {
        pollPage.getPollTab();
    }


    @When("user enter message into message box {string}")
    public void user_enter_message_into_message_box(String string) {

    }
    @When("user enter question {string}")
    public void user_enter_question(String string) {

    }
    @When("user enter {string} and {string}")
    public void user_enter_and(String string, String string2) {

    }
    @When("user clicks on send  button in Poll tab")
    public void user_clicks_on_send_button_in_poll_tab() {

    }
    @Then("user should see saved poll")
    public void user_should_see_saved_poll() {

    }


}
