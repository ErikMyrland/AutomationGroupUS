package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.pages.CalendarPageEM;
import com.erp.pages.EventManagerPageEM;
import com.erp.utilities.ConfigurationReader;
import com.erp.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccessCalendarPageEM extends BasePage {

    CalendarPageEM calendarPageEM = new CalendarPageEM();

    @Then("user login with his credentials")
    public void user_login_with_his_credentials() {
      login("posmanager14@info.com","posmanager");
    }

    @Then("user clicks to calendar page")
    public void user_clicks_to_calendar_page() {
        calendarPageEM.calendarBtn.click();
    }

    @And("user should see list midnight to 23pm")
    public void user_should_see_list_midnight_to_23pm() {

       // Assert.assertTrue(calendarPageEM.timesFrom0to23.contains());
        Assert.assertEquals(48, calendarPageEM.timesFrom0to23.size());

    }

    //System.out.println("calendarPageEM.timesFrom0to23.size() = " + calendarPageEM.timesFrom0to23.size());







}
