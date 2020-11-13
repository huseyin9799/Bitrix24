package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.EventPage;
import com.nextbasecrm.utils.BrowserUtils;
import com.nextbasecrm.utils.ConfigurationReader;
import com.nextbasecrm.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class EventStepDefinitions {
    EventPage eventPage = new EventPage();


    @Given("user is on event module")
    public void user_is_on_event_module() {
      eventPage.getEventModule();
    }

    @When("user provides event name and event description")
    public void user_provides_event_name_and_event_description() {
        BrowserUtils.enterText(eventPage.getEventName(), "Christmas Party");
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("(//iframe[@class='bx-editor-iframe'])[2]")));
        BrowserUtils.enterText(eventPage.getEventDescription(), "All Group 17 members are welcome");
        Driver.getDriver().switchTo().defaultContent();
    }
    @When("user clicks on send button")
    public void user_clicks_on_send_button() {
      eventPage.clickOnSendButton();
    }
    {

    }
    @Then("user should see saved event")
    public void user_should_see_saved_event() {
       // in progress

    }

}
