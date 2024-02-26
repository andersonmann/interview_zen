
package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.MessagesAndLogs;


/**
 * This class provides the initial parameters to initiate a session
 *
 * @author andersonmann
 */
public class BaseTest {
    protected static WebDriver driver;
    private static final String url = MessagesAndLogs.URL;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}