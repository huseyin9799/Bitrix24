package com.nextbasecrm.pages;

import com.nextbasecrm.utils.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(name = "USER_LOGIN")
    private WebElement loginInputBox;

    @FindBy(name = "USER_PASSWORD")
    private WebElement passwordInputBox;

    @FindBy(className = "login-btn")
    private WebElement loginButton;

    public void login(String role){
        String usernameValue = "";
        String passwordValue = ConfigurationReader.getProperty("password");

        if(role.equalsIgnoreCase("help desk")){
            usernameValue = ConfigurationReader.getProperty("helpdesk.username");
        }else if(role.equalsIgnoreCase("marketing")){
            usernameValue = ConfigurationReader.getProperty("marketing.username");
        }else if(role.equalsIgnoreCase("hr")){
            usernameValue = ConfigurationReader.getProperty("hr.username");
        }

        loginInputBox.sendKeys(usernameValue);
        passwordInputBox.sendKeys(passwordValue, Keys.ENTER);
    }
}
