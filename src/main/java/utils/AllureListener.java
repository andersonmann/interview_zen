package utils;

import core.BaseTest;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import static java.sql.DriverManager.getDriver;

public class AllureListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult result) {
        WebDriver driver = ((BaseTest) result.getInstance()).getDriver();
        captureScreenshot(driver, result.getMethod().getMethodName());
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] captureScreenshot(WebDriver driver, String screenshotName) {
        ScreenshotUtils.captureScreenshot(driver, screenshotName);
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}