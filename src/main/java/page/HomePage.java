package page;

import core.BasePage;
import org.openqa.selenium.By;

/**
 * This class implements the method that access feature search
 *
 * @author andersonmann
 */
public class HomePage extends BasePage {
    /**
     * This method access the search feature
     */
    public void clickButtonSearch() {
        click(By.xpath("//header/div[@id='ast-desktop-header']/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]"));
    }
}
