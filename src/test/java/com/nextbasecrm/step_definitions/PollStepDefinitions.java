package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.pages.PollPage;
import com.nextbasecrm.utils.BrowserUtils;
import com.nextbasecrm.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.implementation.bytecode.Throw;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PollStepDefinitions  {


    PollPage pollPage = new PollPage();


    @Given("user is on poll module")
    public void user_is_on_poll_module() {
        pollPage.getPollTab();


    }


    @When("user enter message into message box {string}")
    public void user_enter_message_into_message_box(String Message) {
    Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        pollPage.getMessageBox(Message);
        Driver.getDriver().switchTo().defaultContent();

    }
    @When("user enter question {string}")
    public void user_enter_question(String Question) {
    pollPage.getQuestion(Question);
    }
    @When("user enter {string} and {string}")
    public void user_enter_and(String Answer1, String Answer2) throws InterruptedException {
    pollPage.getAnswers1(Answer1);
    pollPage.getAnswers2(Answer2);

    }
    @When("user clicks on send  button in Poll tab")
    public void user_clicks_on_send_button_in_poll_tab() throws InterruptedException {

        pollPage.getSenButton();

    }
    @Then("user should see saved poll")
    public void user_should_see_saved_poll() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.invisibilityOf(pollPage.getfirstPost()));
        Assert.assertTrue(pollPage.getfirstPost().isDisplayed());

    }


}
