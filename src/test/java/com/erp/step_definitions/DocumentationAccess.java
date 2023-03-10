package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.pages.DocumentationPage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Set;

public class DocumentationAccess extends BasePage {

    DocumentationPage documentationPage = new DocumentationPage();
    @Then("user should see documentation")
    public void user_should_see_documentation() {
        documentationPage.userBtn.click();
        BrowserUtils.sleep(2);
        documentationPage.documentationBtn.isDisplayed();
    }
    @Then("user clicks at documentation")
    public void user_clicks_at_documentation() {
        String mainHandle = Driver.getDriver().getWindowHandle();
        BrowserUtils.sleep(1);
        documentationPage.documentationBtn.click();
        BrowserUtils.sleep(1);

        Set<String> windows = Driver.getDriver().getWindowHandles();

        for (String window : windows) {
            Driver.getDriver().switchTo().window(window);
        }

    }
    @Then("documentation is displayed at the window")
    public void documentation_is_displayed_at_the_window() {
        Assert.assertTrue(documentationPage.expectedText.isDisplayed());
    }


    @And("{int} main documents topics are displayed")
    public void mainDocumentsTopicsAreDisplayed(int int1) {
        Assert.assertTrue(documentationPage.headers.size() == int1);
    }
}
