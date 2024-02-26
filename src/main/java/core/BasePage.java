package core;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import utils.MessagesAndLogs;

/**
 * This class provides a series of method to be used on several situations
 *
 * @author andersonmann
 */
public class BasePage extends BaseTest {

    /**
     * Find an element and click
     *
     * @param by the locator identifier
     */
    public void click(By by) {
        try {
            driver.findElement(by).click();
        } catch (Exception e) {
            throw new NoSuchElementException(MessagesAndLogs.ELEMENT_NOT_FOUND + e.getMessage());
        }
    }

    /**
     * Find an element and perform writing in the field *
     *
     * @param by the locator identifier
     */
    public void write(By by, String text) {
        try {
            WebElement element = driver.findElement(by);
            element.sendKeys(text);
        } catch (Exception e) {
            throw new NoSuchElementException(MessagesAndLogs.ELEMENT_NOT_FOUND + e.getMessage());
        }
    }

    /**
     * Method to press ENTER button
     *
     * @param by locator identifier
     */
    public void pressEnterButton(By by) {
        WebElement element = driver.findElement(by);
        element.sendKeys(Keys.ENTER);
    }

    /**
     * Method to verify if a webElement is present at screen
     *
     * @param by locator identifier
     * @return boolean
     */
    public boolean verifyElementIsDisplayed(By by) {
        try {
            WebElement element = driver.findElement(by);
            return element.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException | org.openqa.selenium.StaleElementReferenceException e) {
            return false;
        }
    }
}