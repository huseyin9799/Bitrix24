package com.nextbasecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskPage extends BasePage{
    @FindBy(id = "feed-add-post-form-tab-tasks")
    private static WebElement taskModule;

    @FindBy(name = "ACTION[0][ARGUMENTS][data][TITLE]")
    private static WebElement taskTitle;

    @FindBy(xpath = "//body[@style='min-height: 84px;']")
    private static WebElement taskDescription;

    @FindBy(id = "blog-submit-button-save")
    private static WebElement sendButton;

    public void enterTaskTitle(String string){

        taskTitle.click();
        taskTitle.sendKeys(string);
    }

    public void getTaskModule(){
        taskModule.click();
    }

    public WebElement getTaskName(){
        return taskTitle;
    }
    public WebElement getTaskDescription(){
        return taskDescription;
    }

    public void clickOnSendButton(){
        sendButton.click();
    }
}
