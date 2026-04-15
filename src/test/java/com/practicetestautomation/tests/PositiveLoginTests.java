import com.practicetestautomation.pageobjects.LoginPage;
import com.practicetestautomation.pageobjects.SuccessfulLoginPage;
import com.practicetestautomation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test(groups = {"positive","smoke","regression"})
    public void testLoginFunctionality() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.visit();

        SuccessfulLoginPage successfulLoginPage =
                loginPage.executeLogin("student","Password123");

        successfulLoginPage.load();

        Assert.assertTrue(successfulLoginPage.isLogOutButtonDisplayed());
    }
}