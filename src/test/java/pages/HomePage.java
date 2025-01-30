package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

import java.util.concurrent.TimeUnit;

public class HomePage extends BrowserDriver {

    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String home_xpath = "//a[@href=\"index.html\"]/li";
    public static String signIn_link_linkText = "//a[@href=\"SignIn.html\"]/li";
    public static String online_products_xpath = "//a[@href=\"OnlineProducts.html\"]/li";

    public static void click_hamburger_menu() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

    public static void click_signIn_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(signIn_link_linkText)).click();
    }

    public static void click_online_product() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(online_products_xpath)).click();
    }

    public void tearDown(){
        driver.close();
    }
}
