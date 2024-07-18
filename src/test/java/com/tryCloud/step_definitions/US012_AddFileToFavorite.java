package com.tryCloud.step_definitions;

import com.tryCloud.pages.BasePage;
import com.tryCloud.pages.FileModule_S_Page;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US012_AddFileToFavorite extends FileModule_S_Page {


    @Given("The user navigates to the files page")
    public void user_navigates_to_files_page() {

        fileLinkModule.click();

    }

    @And("User clicks 3 dots menu")
    public void User_clicks_3_dot_menu() {

       threeDotsMenu.click();

    }
    @Then("User adds his file to favorite")
    public void user_adds_his_file_to_favorite() {

      addToFavorites.click();

    }
    @Then("User should be able to see the file under the Favorites tab")
    public void userShouldBeAbleToSeeTheFileUnderTheFavoritesTab() {



    }
}


