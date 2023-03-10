package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.pages.SalesPage;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SalesPageAccessAsManager extends BasePage {

    SalesPage salesPage = new SalesPage();

    @Then("user login as a POSManager")
    public void user_login_as_a_pos_manager() {
        login("posmanager14@info.com","posmanager");
    }
    @Then("use should see {int} columns")
    public void use_should_see_columns(Integer numberOfColumns) {
        salesPage.sales.click();
        Assert.assertTrue(numberOfColumns.equals(salesPage.columns.size()));

    }
}
