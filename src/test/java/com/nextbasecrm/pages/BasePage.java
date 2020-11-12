package com.nextbasecrm.pages;

import com.nextbasecrm.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "pagetitle")
    private WebElement pageTitle;

    public String getPageTitleText(){
        return pageTitle.getText().trim();
    }

}
