package com.tryCloud.step_definitions;


import com.tryCloud.pages.US009_SearchPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US009_SearchFuncStepDefinitions {

    US009_SearchPage us009_searchPage = new US009_SearchPage();

    @When("user clicks {string} module")
    public void user_clicks_module(String module) {



            String locator="//ul[@id='appmenu']/li[@data-id='"+module+"']";

            WebElement eachModule;

        for (int i = 0; i < us009_searchPage.allModules.size(); i++) {

           eachModule = us009_searchPage.allModules.get(i);




            if (eachModule.equals(Driver.getDriver().findElement(By.xpath(locator)))){
                eachModule.click();

            }
           
        }





    }


    @When("user sees search button and click it")
    public void user_sees_search_button_and_click_it() {

        us009_searchPage.search.click();

    }
    @When("user types the file's name and click")
    public void user_types_the_file_s_name_and_click() {

        us009_searchPage.searchButton.sendKeys("Talk");
        us009_searchPage.searchClick.click();


    }
    @When("user open the file on the files module")
    public void user_open_the_file_on_the_files_module() {

        Assert.assertTrue(us009_searchPage.file.isDisplayed());
        BrowserUtils.waitForTitleContains("Files");

    }
    @Then("user sees the details side page of the file")
    public void user_sees_the_details_side_page_of_the_file() {


        BrowserUtils.waitFor(3);
        Assert.assertTrue(us009_searchPage.rightSide.isDisplayed());



    }


    @And("user navigate to the Dashboard page and click it.")
    public void userNavigateToTheDashboardPageAndClickIt() {

        us009_searchPage.appIcon.click();

    }

    @Then("user sees the Dashboard page")
    public void userSeesTheDashboardPage() {

        String expectedTitle = "Dashboard - Trycloud";

        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());

    }
}
