package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utils.ConfigurationReader;
import com.nextbasecrm.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinitions {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        driver.get(ConfigurationReader.getProperty("url"));
    }

    @When("user logs in as {string}")
    public void user_logs_in_as(String role) {
        loginPage.login(role);
    }

    @Then("user should see Activity Stream")
    public void user_should_see_activity_stream() {
        String expectedTitle = "Activity Stream";
        String actualTitle = loginPage.getPageTitleText();
        Assert.assertEquals("Titles are not matching!",expectedTitle,actualTitle);
        Driver.closeDriver();
    }
}
