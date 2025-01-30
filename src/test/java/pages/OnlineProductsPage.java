package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

public class OnlineProductsPage extends BrowserDriver {

    public static String formal_shoes_text_xpath = "//h2[contains(text(),\"Formal Shoes\")]";
    public static String formal_shoes_dropdown_xpath = "//i[contains(@class,\"formalshoedropdown\")]";
    public static String classic_cheltenham_text_xpath = "//table[@class=\"table table-striped thead-dark formalshoetable\"]//tr/td[1]";

    public static void visibility_of_formal_shoes(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formal_shoes_text_xpath)));
    }

    public static void formal_shoes_dropdown(){
        WebElement formalShoesDropdown = driver.findElement(By.xpath(formal_shoes_dropdown_xpath));
        formalShoesDropdown.click();
    }

    public static String verify_visibility_of_classic_cheltenham(){
        String text = driver.findElement(By.xpath(classic_cheltenham_text_xpath)).getText();
        return text;
    }
}
