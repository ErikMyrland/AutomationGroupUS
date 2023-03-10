package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DocumentationPage extends BasePage{

    public DocumentationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement userBtn;

    @FindBy(xpath = "//a[@data-menu='documentation']")
    public WebElement documentationBtn;

    @FindBy(xpath = "//h1[@class='text-white']")
    public WebElement expectedText;

    public void ClickMenu(String linkText){
        WebElement element = Driver.getDriver().findElement(By.partialLinkText(linkText));
        element.click();
    }

    @FindBy(tagName = "h2")
    public List<WebElement> headers;


    //h1[@class='text-white']

    //a[@data-menu='documentation']


}
