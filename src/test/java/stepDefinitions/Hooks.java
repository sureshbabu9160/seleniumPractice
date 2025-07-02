package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.DriverFactory;

public class Hooks {

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        DriverFactory.setDriver(driver1);
    }

    @After
    public void tearDown() {

        DriverFactory.removeDriver();
    }
}