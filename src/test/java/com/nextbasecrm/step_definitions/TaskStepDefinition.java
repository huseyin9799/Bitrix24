package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.TaskPage;
import com.nextbasecrm.utils.BrowserUtils;
import com.nextbasecrm.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class TaskStepDefinition {
    TaskPage taskpage = new TaskPage();
    @Given("user is on task module")
    public void user_is_on_task_module() {
        taskpage.getTaskModule();
    }

    @When("user provides task title's name and task's description")
    public void user_provides_task_title_s_name_and_task_s_description() {
        taskpage.enterTaskTitle("Our first Task");
        //BrowserUtils.taskpage.enterTaskTitle("Our first Task");
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("(//iframe[@class='bx-editor-iframe'])[2]")));
        BrowserUtils.enterText(taskpage.getTaskDescription(), "Leaving our first Task");
        Driver.getDriver().switchTo().defaultContent();
    }
    @And("user clicks on send blue button")
    public void user_clicks_on_send_blue_button() {

        taskpage.clickOnSendButton();
        BrowserUtils.wait(5);
    }

    @Then("user should see saved task")
    public void user_should_see_saved_task() {


    }
}
