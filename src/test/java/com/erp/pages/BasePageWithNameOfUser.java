package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePageWithNameOfUser extends BasePage{



    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement displayedNameOfTheUser;




}
