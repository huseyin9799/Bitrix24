package com.nextbasecrm.pages;

import com.nextbasecrm.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PollPage extends BasePage {

    @FindBy(id="feed-add-post-form-tab-vote")
    private WebElement pollTabButton;

    @FindBy(xpath="//body[@style='min-height: 134px;']")
    private WebElement PollMesage;

    @FindBy(xpath="//input[@id='question_0']")
    private WebElement question;

    @FindBy(xpath="(//input[@class='vote-block-inp adda'])[1]")
    private WebElement answer1;

    @FindBy(xpath="//input[@id='answer_0__1_']")
    private WebElement answer2;

    @FindBy(id = "blog-submit-button-save")
    private static WebElement sendPollButton;

    @FindBy(xpath = "(//div[contains(@id,'blg-post-')])[1]")
    private static WebElement ActivityStream;

//================================= ========================

    @FindBy(xpath="(//span[@title='Upload files'])[1]")
    private WebElement uploadFilesButton;

    @FindBy(xpath="(//span[@title='Link'])[1]")
    private WebElement LinkButton;

    @FindBy(xpath="(//span[@title='Insert video'])[1]")
    private WebElement InsertVideoButton;

    @FindBy(xpath="(//span[@title='Quote text'])[1]")
    private WebElement QuoteTextButton;

    @FindBy(xpath="(//span[@title='Add mention'])[1]")
    private WebElement AddMentionButton;

    @FindBy(xpath="(//span[@title='Add tag'])[1]")
    private WebElement AddTagButton;

    public void getPollTab(){
        pollTabButton.click();
    }
    public void getMessageBox(String str1){
        PollMesage.sendKeys(str1);
    }

    public void getQuestion(String str2){
        question.sendKeys(str2);
    }

    public void getAnswers1(String str3){
        answer1.sendKeys(str3);
    }
    public void getAnswers2(String str4){
        answer2.sendKeys(str4);
    }
    public void getSenButton() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(sendPollButton);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(sendPollButton));
        sendPollButton.click();
    }
    public WebElement getfirstPost(){
        return ActivityStream;
    }
}

