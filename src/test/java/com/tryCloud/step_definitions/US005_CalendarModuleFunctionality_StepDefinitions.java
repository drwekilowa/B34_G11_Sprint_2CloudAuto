package com.tryCloud.step_definitions;

import com.tryCloud.pages.BasePage;
import com.tryCloud.pages.CalendarModulePage;
import com.tryCloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US005_CalendarModuleFunctionality_StepDefinitions extends CalendarModulePage {

// @B34G11-181
//  Scenario: US005_TC1_Verify user can display daily calendar view

    @When("user clicks on the Calendar module")
    public void user_clicks_on_the_calendar_module() {
        calendarLinkModule.click();
    }

    @When("user clicks on the Calendar Menu button")
    public void user_clicks_on_the_calendar_menu_button() {
        calendarMenuButton.click();
    }

    @Then("user can display Daily calendar view")
    public void user_can_display_daily_calendar_view() {
        dayButton.click();
        BrowserUtils.waitFor(3);

        String expectedText = "Day";
        String actualText = dayVerifyText.getText();

        Assert.assertEquals(actualText, expectedText);

        System.out.println(dayVerifyText.getText() + " : calendar view displayed");
    }

    // @B34G11-182
    //  Scenario: US005_TC2_Verify user can display weekly calendar view

    @When("user is on Daily calendar view")
    public void user_is_on_daily_calendar_view() {
        calendarLinkModule.click();
        calendarMenuButton.click();
        dayButton.click();
    }

    @When("user clicks on the Weekly button")
    public void user_clicks_on_the_weekly_button() {
        weekButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("user can see displayed Weekly calendar view")
    public void user_can_see_displayed_weekly_calendar_view() {

        String expectedText = "Week";
        String actualText = weekVerifyText.getText();

        Assert.assertEquals(actualText, expectedText);

        System.out.println(weekVerifyText.getText() + " : calendar view displayed");
    }


    // @B34G11-183
    //  Scenario: US005_TC3_Verify user can display monthly calendar view

    @When("user is on Weekly calendar view")
    public void user_is_on_weekly_calendar_view() {
        calendarLinkModule.click();
        calendarMenuButton.click();
        weekButton.click();
    }

    @When("user clicks on the Monthly button")
    public void user_clicks_on_the_monthly_button() {
        monthButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("user can see displayed Monthly calendar view")
    public void user_can_see_displayed_monthly_calendar_view() {

        String expectedText = "Month";
        String actualText = monthVerifyText.getText();

        Assert.assertEquals(actualText, expectedText);

        System.out.println(monthVerifyText.getText() + " : calendar view displayed");
    }


    // @B34G11-184
    //  Scenario: US005_TC4_Verify user can create a new event under the Calendar module

    @When("user is on the Calendar page")
    public void user_is_on_the_calendar_page() {
        calendarLinkModule.click();
        BrowserUtils.waitFor(3);
    }


    @Then("user clicks on the New event button")
    public void user_clicks_on_the_new_event_button() {
        newEventButton.click();
    }
    @Then("user passes event name in Event title input")
    public void user_passes_event_name_in_event_title_input() {
        newEventInputText.sendKeys("Awesome Meeting");
        BrowserUtils.waitFor(3);
    }

    @Then("user selects from event date and time")
    public void user_selects_from_event_date_and_time() {
        fromSelectButton.click();
        fromDateSelection.click();
        BrowserUtils.waitFor(3);
        fromHourSelection.click();
        fromMinutesSelection.click();
        fromTimeOfDaySelection.click();
    }

    @Then("user selects to event date and time")
    public void user_selects_to_event_date_and_time() {
        toSelectButton.click();
        BrowserUtils.waitFor(3);
        toDateSelection.click();
        toHourSelection.click();
        toMinutesSelection.click();
        toTimeOfDaySelection.click();
    }

    @Then("user clicks to the Save button")
    public void user_clicks_to_the_save_button() {
        saveEventButton.click();
    }

    @Then("user should be able to create a new event under the Calendar module and see it on the related day through the Monthly Calendar view")
    public void user_should_be_able_to_create_a_new_event_under_the_calendar_module_and_see_it_on_the_related_day_through_the_monthly_calendar_view() {
        calendarMenuButtonEvent.click();
        monthButtonEvent.click();

        String expectedText = "Awesome Meeting";
        String actualText = createdEventVerifyText.getText();

        Assert.assertEquals(actualText, expectedText);

        System.out.println(createdEventVerifyText.getText() + " : created event displayed on Monthly Calendar view");

    }
/*
    @When("user is on {string} calendar view")
    public void userIsOnCalendarView(String calendarModesDay) {
    }

    @And("user clicks on the {string} button")
    public void userClicksOnTheButton(String calendarModesWeek) {
    }

    @Then("user can see displayed {string} calendar view")
    public void userCanSeeDisplayedCalendarView(String calendarModesMonth) {
    }

 */
}
