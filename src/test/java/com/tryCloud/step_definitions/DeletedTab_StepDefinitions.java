package com.tryCloud.step_definitions;

import com.tryCloud.pages.BasePage;
import com.tryCloud.pages.DeletedTabPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeletedTab_StepDefinitions extends BasePage {


    DeletedTabPage deletedTabPage = new DeletedTabPage();
    @When("user click on the File module")
    public void user_click_on_the_file_module() {

        fileModule.click();

    }

    @Then("user click on the Deleted files tab")
    public void user_click_on_the_deleted_files_tab() {

        deletedTabPage.deletedFileTab.click();

    }

    @Then("user click on the triangled icon deleted")
    public void user_click_on_the_triangled_icon_deleted() {

        deletedTabPage.deletedButtonSort.click();

    }

    @Then("user see the list of files sorted")
    public void user_see_the_list_of_files_sorted() {

        for (int i = 0; i < deletedTabPage.deletedFiles.size(); i++) {

            WebElement file1 = deletedTabPage.deletedFiles.get(i);

            deletedTabPage.deletedButtonSort.click();

            WebElement file2 = deletedTabPage.deletedFiles.get(i);


            Assert.assertTrue(file2.equals(file1));

        }
    }


    int fileSize1 = deletedTabPage.deletedFiles.size();
    int fileSizeForRestory1;

    @Then("user click on the three dots icon in the file line")
    public void user_click_on_the_three_dots_icon_in_the_line() {

        deletedTabPage.threeDotsIcon.click();
        BrowserUtils.waitForPageToLoad(3);

    }
    @Then("user click on the Delete permanently button")
    public void user_click_on_the_delete_permanently_button() {

        if (deletedTabPage.deletePermanentlyButton.isDisplayed()){
            deletedTabPage.deletePermanentlyButton.click();
        } else {
            BrowserUtils.waitForClickablility(deletedTabPage.deletePermanentlyButton, 15);
            deletedTabPage.deletePermanentlyButton.click();
        }
        fileSizeForRestory1 = deletedTabPage.deletedFiles.size();

    }

    @Then("user should no longer see the file that was deleted")
    public void user_should_no_longer_see_the_file_that_was_deleted() {

        Assert.assertTrue(fileSize1<fileSizeForRestory1);

    }

    int fileSize = deletedTabPage.deletedFiles.size();
    int fileSizeForRestory;
    @Then("user click on the Restore button in the file line")
    public void userClickOnTheRestoreButtonInTheLine() {


            if (deletedTabPage.restoreButton.get(0).isDisplayed()){
                deletedTabPage.restoreButton.get(0).click();
            } else {
                BrowserUtils.waitForClickablility(deletedTabPage.restoreButton.get(0), 7);
                deletedTabPage.restoreButton.get(0).click();
            }
             fileSizeForRestory = deletedTabPage.deletedFiles.size();

    }
    @Then("user do not see the restored file in the page")
    public void userDoNotSeeTheRestoredInThePage() {



        Assert.assertTrue(fileSize<fileSizeForRestory);
    }
}
