package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.pages.EventManagerPageEM;
import io.cucumber.java.en.Then;

public class ModulesAsSalesManager extends BasePage {

    EventManagerPageEM eventManagerPageEM = new EventManagerPageEM();

    @Then("user login as a sales manager")
    public void user_login_as_a_sales_manager() {
        eventManagerPageEM.login("salesmanager14@info.com","salesmanager");

    }


}
