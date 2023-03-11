package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.pages.SalesPage;
import com.erp.utilities.BrowserUtils;
import io.cucumber.java.en.Then;

public class AccessToQuotations extends BasePage {

    SalesPage salesPage = new SalesPage();

    @Then("user clicks at sales module")
    public void userClicksAtSalesModule() {
        BrowserUtils.sleep(2);
        salesPage.sales.click();
    }

}
