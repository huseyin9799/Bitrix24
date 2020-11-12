package com.nextbasecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventPage extends BasePage {

    @FindBy(xpath = "//span[.='Event']")
    private static WebElement eventModule;

    @FindBy(id = "feed-cal-event-namecal_3Jcl")
    private static WebElement eventName;

    @FindBy(xpath = "//body[@style='min-height: 104px;']")
    private static WebElement eventDescription;

    @FindBy(id = "blog-submit-button-save")
    private static WebElement sendButton;

    public void getEventModule(){
        eventModule.click();
    }

    public WebElement getEventName(){
        return eventName;
    }
    public WebElement getEventDescription(){
        return eventDescription;
    }

    public void clickOnSendButton(){
        sendButton.click();
    }


}
