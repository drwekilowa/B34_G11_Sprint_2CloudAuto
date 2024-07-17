package com.tryCloud.step_definitions;

import com.tryCloud.pages.BasePage;
import com.tryCloud.pages.FileModulePage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class US002_FileModule_Functionality_Step_Definition {

    Robot robot = new Robot();

    FileModulePage fileModulePage = new FileModulePage();

    Actions actions = new Actions(Driver.getDriver());

    public US002_FileModule_Functionality_Step_Definition() throws AWTException {
    }

    @Then("user navigates file module")
    public void user_navigates_file_module() {


        fileModulePage.fileLinkModule.click();


    }

    @Then("user sees plus icon to upload file")
    public void user_sees_plus_icon_to_upload_file() {

        fileModulePage.plusIcon.click();

        actions.click(fileModulePage.uploadFileOption).perform();

        //  fileModulePage.uploadFile.sendKeys("C:\\Users\\Azat\\Desktop\\Document.txt");

    }

    @Then("user chooses a file from local computer and click open button")
    public void user_chooses_a_file_from_local_computer_and_click_open_button() {

        // Specify the path to the file you want to upload using method
        BrowserUtils.sleep(2);
        fileModulePage.uploadFileDynamic("Document.txt");


        // Upload the file

//        robot.setAutoDelay(2000);
//
//        StringSelection stringSelection = new StringSelection("C:\\Users\\Azat\\Desktop\\Document.txt");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//
//        robot.setAutoDelay(2000);
//
//        // copy and pass file to upload
//
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_V);
//
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        robot.keyRelease(KeyEvent.VK_V);
//
//        robot.setAutoDelay(3000);
//
//        // clicks open button to upload the file
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//

    }

    @Then("user sees uploaded file in list of files")
    public void user_sees_uploaded_file_in_list_of_files() {

        BrowserUtils.waitForTitleContains("Files - Trycloud");

        String actualFile = fileModulePage.documentFileTxt.getText();

        Assert.assertTrue(actualFile.startsWith("Document"));

    }

    @When("user clicks plus icon and sees New folder option")
    public void user_clicks_plus_icon_and_sees_new_folder_option() {

        String newFolderOptionText = fileModulePage.newFolderOption.getText();

        System.out.println("newFolderOptionText = " + newFolderOptionText);

    }

    @Then("user types folder name and clicks arrow")
    public void user_types_folder_name_and_clicks_arrow() {

//        List<String> actualPlusIconOptions = new ArrayList<>();
//
//        for (WebElement each : fileModulePage.plusButtonOptions) {
//
//            actualPlusIconOptions.add(each.getText());
//
//            System.out.println("actualPlusIconOptions = " + actualPlusIconOptions);
//        }
//        if (actualPlusIconOptions.contains(fileModulePage.newFolderOption)) {
//
//            fileModulePage.newFolderOption.click();
//
//            actions.sendKeys("new folder22").perform();
//
//            actions.moveToElement(fileModulePage.arrow).click().perform();
//
//
//        }


        fileModulePage.newFolderOption.click();


        fileModulePage.inputBox.sendKeys("new folder22");
        // actions.click(fileModulePage.arrow).perform();
        fileModulePage.arrow.click();

    }

    @Then("user sees a new folder in list")
    public void user_sees_a_new_folder_in_list() {
        fileModulePage.newFolder22.isDisplayed();


    }

    @When("user is in all files table")
    public void user_is_in_all_files_table() {

        fileModulePage.fileLinkModule.getLocation();

    }

    @When("user sees the total number of files and folders under the files list")
    public void user_sees_the_total_number_of_files_and_folders_under_the_files_list() {
        fileModulePage.fileNumber.isDisplayed();
        fileModulePage.folderNumber.isDisplayed();
    }

    @When("user clicks three dots menu")
    public void user_clicks_three_dots_menu() {

        fileModulePage.threeDotsFile.click();


    }

    @When("user sees delete option and clicks on it")
    public void user_sees_delete_option_and_clicks_on_it() {

        fileModulePage.deleteFileOption.click();


    }


    @When("user navigate plus icon and clicks")
    public void userNavigatePlusIconAndClicks() {

        fileModulePage.plusIcon.click();
    }
}
