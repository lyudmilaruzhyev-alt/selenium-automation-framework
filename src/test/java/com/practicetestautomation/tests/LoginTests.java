package com.practicetestautomation.tests;
import com.practicetestautomation.pageobjects.LoginPage;
import com.practicetestautomation.pageobjects.SuccessfulLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test(groups = {"positive", "regression", "smoke"})
    public void testLoginFunctionality() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.visit();

        SuccessfulLoginPage successPage =
                loginPage.executeLogin("student", "Password123");

        successPage.load();

        Assert.assertTrue(successPage.getCurrentUrl().contains("logged-in-successfully"),
                "URL does not contain logged-in-successfully");
        Assert.assertTrue(successPage.getSuccessMessage().contains("Congratulations"),
        "Success message is not displayed");
        Assert.assertTrue(successPage.isLogOutButtonDisplayed(),
                "Logout button is not displayed");
    }
}