package com.erp.step_definitions;

import com.erp.pages.BasePage;
import io.cucumber.java.en.Then;

public class ModulesAsExpensesManager extends BasePage {

    @Then("user login as a Expenses manager")
    public void user_login_as_a_expenses_manager() {
      login("expensesmanager14@info.com", "expensesmanager");
    }

}
