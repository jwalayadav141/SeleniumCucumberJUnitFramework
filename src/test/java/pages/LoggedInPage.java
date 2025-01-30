package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import utility.BrowserDriver;

public class LoggedInPage extends BrowserDriver {
    public static String formalShoes_xpath = "(//h3[@id=\"ShoeType\"])[1]";
    public static String sportShoes_xpath = "(//h3[@id=\"ShoeType\"])[2]";
    public static String sneakerShoes_xpath = "(//h3[@id=\"ShoeType\"])[3]";

    public static void visibility_productCategory_formalShoes(){
        String actualProductCategoty_fs = driver.findElement(By.xpath(formalShoes_xpath)).getText();
        Assert.assertEquals("Formal Shoes",actualProductCategoty_fs);
    }
    public static void visibility_productCategory_sportShoes(){
        String actualProductCategoty_ss = driver.findElement(By.xpath(sportShoes_xpath)).getText();
        Assert.assertEquals("Sports",actualProductCategoty_ss);
    }
    public static void visibility_productCategory_sneakerShoes(){
        String actualProductCategoty_sn = driver.findElement(By.xpath(sneakerShoes_xpath)).getText();
        Assert.assertEquals("Sneakers",actualProductCategoty_sn);
    }
}
