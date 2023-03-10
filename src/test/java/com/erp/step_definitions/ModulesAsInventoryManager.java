package com.erp.step_definitions;

import com.erp.pages.BasePage;
import io.cucumber.java.en.Then;

public class ModulesAsInventoryManager extends BasePage {

    @Then("user login as a Inventory manager")
    public void user_login_as_a_inventory_manager() {
      login("imm14@info.com","inventorymanager");
    }


}
