package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends BasePage {

    public void closePopup() {

        findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    public void searchProduct() {

        write(By.id("search"), "ceket");
    }
    public void enter() {

        findElement(By.id("search")).sendKeys(Keys.ENTER);
    }

    public void clickBag(){

        click(By.className("header__basketTrigger js-basket-trigger -desktop"));
    }

    public void DeleteProduct(){

        click(By.className("header__basketProductRemove"));
    }

    public void EmptyCart(){

        isVisible(By.className("header__emptyBasketText"));
    }

}

