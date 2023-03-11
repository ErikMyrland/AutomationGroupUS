package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.pages.RepairsPage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class RepairsAccessAndCheckBox extends BasePage {

    RepairsPage repairsPage = new RepairsPage();

    @Then("user login with {string} {string}")
    public void userLoginWith(String userLogin, String userPassword) {
        email.sendKeys(userLogin);
        password.sendKeys(userPassword);
        btn_logIn.click();

    }

    @Then("user clicks Repair module")
    public void user_clicks_repair_module() {
        repairsPage.repairsModule.click();

    }

    @Then("should see repairs page")
    public void should_see_repairs_page() {
        //System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        Driver.getDriver().getCurrentUrl().contains("Repair");
    }

    @Then("user can click and select all of the check boxes")
    public void user_can_click_and_select_all_of_the_check_boxes() {
        BrowserUtils.sleep(1);
        repairsPage.checkBox.click();
        Assert.assertTrue(repairsPage.checkBox.isSelected());
    }


}


