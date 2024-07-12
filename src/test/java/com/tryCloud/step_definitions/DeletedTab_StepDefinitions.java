package com.tryCloud.step_definitions;

import com.tryCloud.pages.BasePage;
import com.tryCloud.pages.DeletedTabPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

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

    @Then("user click on the trhee dots icon in the {string} line")
    public void user_click_on_the_trhee_dots_icon_in_the_line(String string) {



    }

    @Then("user click on the Delete permanently button")
    public void user_click_on_the_delete_permanently_button() {

    }

    @Then("user should no longer see the file that was deleted")
    public void user_should_no_longer_see_the_file_that_was_deleted() {

    }

    @Then("user click on the Restore button in the {string} line")
    public void user_click_on_the_restore_button_in_the_line(String string) {

    }

    @Then("user click on the All files tab")
    public void user_click_on_the_all_files_tab() {

    }

    @Then("user see the restored {string} under the All files tab")
    public void user_see_the_restored_under_the_all_files_tab(String string) {

    }


}
