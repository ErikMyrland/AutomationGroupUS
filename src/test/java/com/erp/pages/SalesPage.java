package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SalesPage extends BasePage {


    @FindBy(xpath = "//span[normalize-space()='Sales']")
    public WebElement sales;

    @FindBy(xpath = "//th[@class='o_column_sortable']")
    public List<WebElement> columns;



}
