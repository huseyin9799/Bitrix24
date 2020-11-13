package com.nextbasecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PollPage extends BasePage {

    @FindBy(id="feed-add-post-form-tab-vote")
    private WebElement pollTabButton;

    @FindBy(id="bx-b-uploadfile-blogPostForm")
    private WebElement uploadFilesButton;

    @FindBy(xpath="//body[@style='min-height: 134px;']")
    private WebElement PollMesage;

    @FindBy(id="question_0")
    private WebElement question;

    @FindBy(xpath="//input[@id='answer_0__0_']")
    private WebElement answer1;

    @FindBy(xpath="//input[@id='answer_0__1_']")
    private WebElement answer2;

    @FindBy(id = "blog-submit-button-save")
    private static WebElement sendPollButton;

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
    public void getSenButton(){
        sendPollButton.click();
    }
}
