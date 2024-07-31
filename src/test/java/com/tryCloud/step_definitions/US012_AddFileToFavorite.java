package com.tryCloud.step_definitions;

import com.tryCloud.pages.FileModule_S_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

public class US012_AddFileToFavorite extends FileModule_S_Page {


// AC1 User should be able to add file to favorite
    @Given("The user navigates to the files page")
    public void user_navigates_to_files_page() {
        fileLinkModule.click();
    }

    @And("User clicks 3 dots menu")
    public void User_clicks_3_dot_menu() {
        threeDotsIcon.click();

    }
    @Then("User adds his file to favorite")
    public void user_adds_his_file_to_favorite() {
      addToFavorites.click();

    }
    @Then("User should be able to see the file under the Favorites tab")
    public void userShouldBeAbleToSeeTheFileUnderTheFavoritesTab() {
    }


    // AC2 Users can rename any file from its own three dots menu

    @And("User clicks on rename the file")
    public void user_clicks_on_rename_file() {
        RenameFile.click();
        fileNameInput.sendKeys("8");
        fileNameInput.sendKeys(Keys.RETURN);
    }
    // AC3 User can put some comments on any file from the file details menu opened right side

   @And ("Click on \"Details\"")
    public void click_on_details() {
    Details.click();
    Comment.click();
    Comment1.click();
    Comment1.sendKeys("asdas");


   }








    }











