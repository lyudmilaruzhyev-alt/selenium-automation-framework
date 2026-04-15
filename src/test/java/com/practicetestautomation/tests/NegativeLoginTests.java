package com.practicetestautomation.tests;


import com.practicetestautomation.pageobjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTests extends BaseTest {

        @Test(groups = {"negative","regression"})
        public void testLoginWithWrongPassword() {

            LoginPage loginPage = new LoginPage(driver);
            loginPage.visit();

            loginPage.executeLogin("student","wrongPassword");

            Assert.assertTrue(
                    loginPage.getErrorMessage().contains("Your password is invalid!"),
                    "Error message is not displayed"
            );
        }
        }

        @Test(groups = {"negative","regression"})
        public void testLoginWithWrongUsername() {

            LoginPage loginPage = new LoginPage(driver);
            loginPage.visit();

            loginPage.executeLogin("wrongUser","Password123");

            Assert.assertTrue(loginPage.getErrorMessage()
                    .contains("Your username is invalid!"));
        }
    }

