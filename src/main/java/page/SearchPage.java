package page;

import core.BasePage;
import org.openqa.selenium.By;

/**
 * This class implements the search methods
 *
 * @author andersonmann
 */
public class SearchPage extends BasePage {
    private final static String SEARCH_FIELD = "#search-field";
    HomePage homePage = new HomePage();

    /**
     * This method performs a search passing a string as a parameter.
     * To do this, it invokes the clickButtonSearch() method of the HomePage class.
     * It performs the following order of actions:
     * Click on the search icon
     * Type a text
     * Press the ENTER button
     * @param termToSearch value used in search
     */
    public void performSearch(String termToSearch) {
        homePage.clickButtonSearch();
        write(By.cssSelector(SEARCH_FIELD), termToSearch);
        pressEnterButton(By.cssSelector(SEARCH_FIELD));
    }
}