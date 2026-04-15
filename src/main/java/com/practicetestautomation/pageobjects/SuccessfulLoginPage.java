package com.practicetestautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessfulLoginPage extends BasePage {

    private By logOutButtonLocator = By.linkText("Log Out");
    private By successMessageLocator = By.tagName("h1");

    public SuccessfulLoginPage(WebDriver driver) {
        super(driver);
    }

    public void load() {
        waitForElement(logOutButtonLocator);
    }

    public boolean isLogOutButtonDisplayed() {
        return isDisplayed(logOutButtonLocator);
    }

    public String getSuccessMessage() {
        return waitForElement(successMessageLocator).getText();
    }
}