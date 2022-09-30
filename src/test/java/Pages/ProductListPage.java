package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductListPage extends BasePage {
    public void scrollToButton() {

        WebElement element = findElement(By.cssSelector("button[class='button -secondary -sm relative']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }

    public void urlControl2() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://www.network.com.tr/search?searchKey=ceket&page=2");
    }
    public void hover(By by) {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(by);
        action.moveToElement(we).build().perform();
    }
}
