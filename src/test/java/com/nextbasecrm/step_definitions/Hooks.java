package com.nextbasecrm.step_definitions;

import com.nextbasecrm.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setup(Scenario scenario){
        System.out.println(":::Starting Automation:::");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }


    @After
    public void tearDown(){
        Driver.closeDriver();
        System.out.println(":::(^_^) End of test execution (*_*):::");

    }

}
