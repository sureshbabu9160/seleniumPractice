package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.ConfigReader;
import utils.DriverFactory;

import java.io.IOException;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("user is on login page")
    public void user_is_on_login_page() throws IOException {
        driver = DriverFactory.getDriver();
        driver.get(ConfigReader.getProperty("login.url"));
        loginPage = new LoginPage(driver);
    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() throws IOException {
        loginPage.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
    }

    @Then("user should be redirected to dashboard")
    public void user_should_be_redirected_to_dashboard() {
        Assert.assertTrue(loginPage.isLoginSuccessful());
    }
}