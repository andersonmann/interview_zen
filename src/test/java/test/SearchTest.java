package test;

import core.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.SearchPage;
import utils.CsvUtil;
import utils.MessagesAndLogs;

import java.util.Iterator;

import static org.testng.Assert.*;

/**
 * This class contains some automated test scenarios of search functionality
 *
 * @author andersonmann
 */

public class SearchTest extends BaseTest {
    SearchPage searchPage = new SearchPage();

    @DataProvider(name = "search_parameters")
    public Iterator<String[]> provider() throws Exception {
        return CsvUtil.readAll("src/test/resources/data/search.csv", false);
    }

    @Test(description = "Checks that search icon is enable", priority = 0)
    public void isEnableSearch() {
        assertTrue(searchPage.verifyElementIsDisplayed(By.
                xpath(MessagesAndLogs.SEARCH_BUTTON)));
    }

    @Test(description = "Search for a term and validate the result", dataProvider = "search_parameters")
    public void searchAndVerifyTheResult(String searchTerm, String textToValidate) {
        searchPage.performSearch(searchTerm);
        assertEquals(driver.findElement(By.xpath(MessagesAndLogs.RESULT_FIELD)).getText(), textToValidate);
    }

    @Test(description = "Perform a no results search")
    public void searchWithoutResults() {
        searchPage.performSearch("@#$%");
        assertEquals(driver.findElement(By.xpath(MessagesAndLogs.XPATH_EXPRESSION)).getText(), MessagesAndLogs.MESSAGE_TO_VALIDATE);
    }

    @Test(description = "Validates the page title")
    public void verifyTitlePage() {
        assert driver.getTitle().equals(MessagesAndLogs.PAGE_TITLE);
    }
}