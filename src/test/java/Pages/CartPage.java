package Pages;
import org.openqa.selenium.By;

public class CartPage extends BasePage{

    public void addToCart() {

        click(By.xpath("//*[@id=\"header__desktopBasket\"]/div/div[3]/a"));
    }
    public void clicktoDevamEt(){
        click(By.cssSelector("#cop-app > div > div.layout.-default > div.layout__content > div.layout__sidebar > div > div.summary > button "));
    }

}
