package com.tryCloud.step_definitions;

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

public class US012_AddFileToFavorite {
    WebDriver driver;

    @Given("User is logged in and on main page")
    public void user_is_on_the_main_page() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://app.trycloud.net/index.php/login");

        WebElement usernameField = driver.findElement(By.id("user"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("submit"));

        usernameField.sendKeys("User66");
        passwordField.sendKeys("Userpass123");
        loginButton.click();

    }

    @When("The user navigates to the files page")
    public void user_navigates_to_files_page() {
        driver.findElement(By.xpath("//a[@href='/index.php/apps/files/']")).click();

    }


    @And("User clicks 3 dots menu")
    public void User_clicks_3_dot_menu() {
        WebElement threeDotsMenu = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[14]/table/tbody/tr[1]/td[2]/a/span[2]/a[2]"));
        threeDotsMenu.click();

    }

    @Then("User adds his file to favorite")
    public void user_adds_his_file_to_favorite() {
        WebElement addToFavorites = driver.findElement(By.xpath(" //span[text()='Add to favorites']"));
        addToFavorites.click();
    }
}


