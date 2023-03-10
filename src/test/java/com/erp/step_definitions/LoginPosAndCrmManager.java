package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.pages.BasePageWithNameOfUser;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPosAndCrmManager extends BasePage {

    BasePageWithNameOfUser basePageWithNameOfUser = new BasePageWithNameOfUser();
    @When("I login using {string} {string}")
    public void i_login_using_posmanager(String userEmail, String userPassword) {
        email.sendKeys(userEmail);
        password.sendKeys(userPassword);
        btn_logIn.click();

    }

    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String userName) {
        //System.out.println("basePageWithNameOfUser.displayedNameOfTheUser.getText() = " + basePageWithNameOfUser.displayedNameOfTheUser.getText());

        Assert.assertTrue(basePageWithNameOfUser.displayedNameOfTheUser.getText().contains(userName));

    }




}