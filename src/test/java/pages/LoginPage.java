package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {

    public static String userName_id = "usr";
    public static String password_id = "pwd";
    public static String login_btn_xpath = "//input[@value=\"Login\" and @type=\"submit\"]";
    public static String registration_btn_id = "NewRegistration";

    public static void sendkeys_username(){
        driver.findElement(By.id(userName_id)).sendKeys("Scott.gale@gmail.com");
    }
    public static void sendkeys_password(){
        driver.findElement(By.id(password_id)).sendKeys("P@sword!");
    }
    public static void click_login_btn(){
        driver.findElement(By.xpath(login_btn_xpath)).click();
    }
    public static void click_new_registration_btn(){
        driver.findElement(By.id(registration_btn_id)).click();
    }
}
