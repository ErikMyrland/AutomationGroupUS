package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.pages.PointOfSalePage;
import com.erp.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class ProductOrderAsSalesManager extends BasePage {

    PointOfSalePage pointOfSalePage = new PointOfSalePage();

    @Then("user clicks on point of sale")
    public void user_clicks_on_point_of_sale() {
    pointOfSalePage.pointOfSaleBtn.click();
    }
    @Then("user clicks at orders")
    public void user_clicks_at_orders() {
        pointOfSalePage.ordersBtn.click();
    }
    @Then("user clicks on check boxes and all should be selected")
    public void user_clicks_on_check_boxes_and_all_should_be_selected() {
    pointOfSalePage.checkBox.click();

        for (WebElement each : pointOfSalePage.checks) {  // checking if each checks box is selected
            Assert.assertTrue(each.isSelected());
        }
    }


}
