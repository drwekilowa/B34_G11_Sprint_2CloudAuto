package com.tryCloud.step_definitions;

import com.tryCloud.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
In this class we will be able to create "pre" and "post" condition for ALL the Scenarios and even STEPS.
 */
public class Hooks {
    @Before(order = 1)
    public void setupMethod(){
        System.out.println("--> @Before: Running before each SCENARIO");

    }
    // @Before(value = "@login",order = 2)
    public void setupLoginScenariosMethod(){
        System.out.println("--> @Before: Running before each SCENARIO");
// After will be executed automatically
    }
    @After
    public void tearDownMethod(Scenario scenario){
        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());

        }
        System.out.println("-->@After: Running after each SCENARIO");
        Driver.closeDriver();
    }
    //  @BeforeStep
    public void setupStep(){
        System.out.println("--> @BeforeStep: running before each step");

    }
    //  @AfterStep
    public void tearDownStep(){
        System.out.println("--> @AfterStep: Running after each step");
    }
}

