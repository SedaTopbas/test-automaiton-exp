package Test;

import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductListPage;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestNetwork extends BaseTest{
    HomePage homePage = new HomePage();
    ProductListPage productPage = new ProductListPage();
    CartPage cartPage = new CartPage();
    LoginPage loginpage = new LoginPage();


    @Test
    public void Test() throws InterruptedException {

        Thread.sleep(10000);
        homePage.closePopup();
        Thread.sleep(2000);
        homePage.urlControl();
        homePage.searchProduct();
        homePage.enter();
        productPage.scrollToButton();
        productPage.click(By.cssSelector("button[class='button -secondary -sm relative']"));
        Thread.sleep(2000);
        productPage.urlControl2();
        productPage.hover(By.xpath("//div[@class='product__header'])[90]"));
        productPage.click(By.cssSelector("#product-136456 > div > div.product__header > div > div > div > div:nth-child(1) > label"));
        cartPage.addToCart();
        cartPage.clicktoDevamEt();
        loginpage.ReadCSV();
        loginpage.ControlButton();
        loginpage.clickToNetwork();
        homePage.clickBag();
        homePage.isVisible(By.className("header__basketModal -title"));
        homePage.DeleteProduct();
        homePage.EmptyCart();

    }
}