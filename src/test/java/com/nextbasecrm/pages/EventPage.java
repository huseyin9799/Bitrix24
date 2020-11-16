package com.nextbasecrm.pages;

import com.nextbasecrm.utils.BrowserUtils;
import com.nextbasecrm.utils.Driver;
import org.openqa.selenium.By;
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

    @FindBy(name = "EVENT_LOCATION")
    private static WebElement eventLocation;

    @FindBy(xpath = "//div[.='Central Meeting Room']")
    private static WebElement centralRoom;

    @FindBy(xpath = "//div[.='East Meeting Room']")
    private static WebElement eastRoom;

    @FindBy(xpath = "//div[.='West Meeting Room']")
    private static WebElement westRoom;


    public void getEventModule(){
        eventModule.click();
    }

    public WebElement getEventName(){
        return eventName;
    }
    public WebElement getEventDescription(){
        return eventDescription;
    }

    public void pickEventLocation(String string){
        eventLocation.click();
        if (string.equals("Central Meeting Room")){
            centralRoom.click();
        }else if (string.equals("East Meeting Room")){
            eastRoom.click();
        }else if (string.equals("West Meeting Room")){
            westRoom.click();
        }else{
            throw new RuntimeException("No Such Room!!!");
        }

    }

    public void clickOnSendButton(){
        BrowserUtils.clickOnElement(sendButton);
    }

    public static String getEventText(String eventName){
      String text = Driver.getDriver().findElement(By.xpath("//a[.='" + eventName + "']")).getText();
      return text;
    }

    public static String getEventLocationtext(String string){
        String text = Driver.getDriver().findElement(By.xpath("//td[.='" + string + "']")).getText();
        return text;
    }


}
