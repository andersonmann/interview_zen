
package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.MessagesAndLogs;

import java.util.logging.Logger;


/**
 * This class provides the initial parameters to initiate a session
 *
 * @author andersonmann
 */
public class BaseTest {
    private static final Logger LOGGER = Logger.getLogger(BaseTest.class.getName());

    protected static WebDriver driver;
    private static final String URL = MessagesAndLogs.URL;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        LOGGER.info("Browser instanciado: GOOGLE CHROME");
        driver.get(URL);
        LOGGER.info("Página acessada: ".concat((URL)));

    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            LOGGER.info("Instância do browser finalizada");
        }
    }
}