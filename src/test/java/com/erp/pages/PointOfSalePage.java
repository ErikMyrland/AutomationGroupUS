package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PointOfSalePage extends BasePage {


    @FindBy(xpath = "//a[@class='oe_menu_toggler']//span[@class='oe_menu_text'][normalize-space()='Point of Sale']")
    public WebElement pointOfSaleBtn;


    @FindBy(xpath = "(//a[contains(.,'Orders')])[6]")
    public WebElement ordersBtn;

    //li[@class='active']//span[@class='oe_menu_text'][normalize-space()='Orders']
    @FindBy(xpath = "//th[@class='o_list_record_selector']//input[@type='checkbox']")
    public WebElement checkBox;

    public List<WebElement> checks= Driver.getDriver().findElements(By.xpath("//td/div/input[@type='checkbox']"));





}

//li[@class='active']//span[@class='oe_menu_text'][normalize-space()='Orders']




