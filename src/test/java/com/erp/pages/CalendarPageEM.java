package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarPageEM extends BasePage{

    public CalendarPageEM() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[normalize-space()='Calendar']")
    public WebElement calendarBtn;

    @FindBy(xpath = "//td[@class='fc-axis fc-time fc-widget-content']")
    public List<WebElement> timesFrom0to23;

    //td[@class='fc-axis fc-time fc-widget-content']

}
