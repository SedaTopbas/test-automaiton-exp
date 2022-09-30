package Pages;

import Test.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage extends BaseTest{

    public WebElement findElement(By by) {

        return driver.findElement(by);
    }
    public void click(By by) {

        findElement(by).click();
    }
    public void urlControl(){

        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://www.network.com.tr");
    }
    public void write(By by, String text){

        findElement(by).sendKeys(text);
    }
    public void sendKeys(By by, String text) {

        findElement(by).sendKeys(text);
    }

    public void waitBySeconds(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean isVisible(By by){
        return findElement(by).isDisplayed();

    }

}
