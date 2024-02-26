package utils;
import core.BaseTest;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ScreenshotUtils extends BaseTest {

    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        try {
            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            String destination = "target/screenshots/" + screenshotName + ".png";
            Files.copy(source.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            System.out.println("Erro ao capturar screenshot: " + e.getMessage());
        }
    }
}