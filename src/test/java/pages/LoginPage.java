package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    By userNameField = By.xpath("//*[@id=\"email\"]");
    By passwordField = By.xpath("//*[@id=\"password\"]");
    By loginBtn = By.xpath("//*[@id=\"submit\"]");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void login(String username, String password){
        driver.findElement(userNameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginBtn).click();
    }

    public boolean isLoginSuccessful() {
        return driver.getTitle().contains("My test Account");
    }
}