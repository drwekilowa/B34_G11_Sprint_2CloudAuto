package com.tryCloud.step_definitions;

import com.tryCloud.pages.BasePage;
import com.tryCloud.pages.US010_FilesPage;
import com.tryCloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US010_FolderViewFunc_StepDef extends BasePage {

    US010_FilesPage us010FilesPage = new US010_FilesPage();
    @When("User clicks on the folder icon")
    public void user_clicks_on_the_folder_icon() {
    fileLinkModule.click();

    }
    @When("User clicks Name above the files.")
    public void user_clicks_name_above_the_files() {

        us010FilesPage.nameButton.click();
    }
    @Then("User should be able to see the list in alphabetical order A-Z or Z-A")
    public void user_should_be_able_to_see_the_list_in_alphabetical_order_a_z_or_z_a() {
        List<String> files = new ArrayList<>();
        for (WebElement each : us010FilesPage.filesName) {
            files.add(each.getText());
        }
        List<String> orderFileByName = new ArrayList<>(files);
        if (files.contains(".")){
            Collections.sort(orderFileByName);
        }
        Assert.assertEquals(files , orderFileByName);

        us010FilesPage.nameButton.click();
        files.clear();
        for (WebElement each : us010FilesPage.filesName) {
            files.add(each.getText());
        }
        Collections.reverse(orderFileByName);
        Assert.assertEquals(files , orderFileByName);
    }

    @When("User clicks Size above the files.")
    public void user_clicks_size_above_the_files() {

    }
    @Then("User should be able to see the list in order on the sizes")
    public void user_should_be_able_to_see_the_list_in_order_on_the_sizes() {

    }

    @When("User clicks Modified above the files.")
    public void user_clicks_modified_above_the_files() {

    }
    @Then("User should be able to see the list based on modified dates")
    public void user_should_be_able_to_see_the_list_based_on_modified_dates() {

    }

    @When("User can select select all checkbox at the left top corner of the list")
    public void user_can_select_select_all_checkbox_at_the_left_top_corner_of_the_list() {

    }
    @When("User should be able to see all files checkboxes are selected")
    public void user_should_be_able_to_see_all_files_checkboxes_are_selected() {

    }
    @Then("User should be able to see the total values of all files in the first line")
    public void user_should_be_able_to_see_the_total_values_of_all_files_in_the_first_line() {

    }
}
