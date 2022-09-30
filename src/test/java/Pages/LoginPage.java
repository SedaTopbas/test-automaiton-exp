package Pages;

import com.opencsv.CSVReader;
import org.openqa.selenium.By;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LoginPage extends BasePage {
    String CSV_PATH = "src/test/resources/formpage.csv";
    private CSVReader csvReader;
    String[] csvCell;

    public void ReadCSV() throws FileNotFoundException {

        cvsReader = new CSVReader(new FileReader(CSV_PATH));
        while ((csvCell = csvReader.readNext()) != null) {
            String CustomerEmail = csvCell[0];
            String CustomerSifre = csvCell[1];
            driver.findElement(By.cssSelector("input[class=\"input js-trim\"]")).sendKeys(CustomerEmail);
            driver.findElement(By.cssSelector("input[class=\"input\"]")).sendKeys(CustomerSifre);
        }
    }

    public void ControlButton() {
        isVisible(By.cssSelector("button[type=\"submit\"]"));
    }

    public void clickToNetwork() {
        click(By.cssSelector("svg[class=header__logoImg]"));
    }

}