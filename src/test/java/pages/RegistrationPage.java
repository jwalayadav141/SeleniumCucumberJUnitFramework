package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.BrowserDriver;

public class RegistrationPage extends BrowserDriver {

    public static String registationPageHeader_xpath = "//h1[contains(text(),\"User Registration Page\")]";
    public static String salutation_xpath = "//select[@id=\"Salutation\"]";
    public static String firstName_id = "firstname";
    public static String lastName_id = "lastname";
    public static String emailId_id = "emailId";
    public static String contactNo_id = "contactNumber";
    public static String userName_id = "usr";
    public static String password_id = "pwd";
    public static String submit_xpath = "//input[@value=\"Submit\" and @class=\"btn btn-primary\"]";

    public static void verifyRegistrationHeader(){
        String header = driver.findElement(By.xpath(registationPageHeader_xpath)).getText();
        Assert.assertEquals("User Registration Page", header);
    }

    public static void select_Salutation(String salutation){
        WebElement salut = driver.findElement(By.xpath(salutation_xpath));
        Select sel = new Select(salut);
        sel.selectByValue(salutation);
    }

    public static void fill_firstName(String firstName){
        driver.findElement(By.id(firstName_id)).sendKeys(firstName);
    }

    public static void fill_lastName(String lastName){
        driver.findElement(By.id(lastName_id)).sendKeys(lastName);
    }

    public static void fill_email(String email){
        driver.findElement(By.id(emailId_id)).sendKeys(email);
    }

    public static void fill_contact(String contactNo){
        driver.findElement(By.id(contactNo_id)).sendKeys(contactNo);
    }

    public static void fill_userName(String userName){
        driver.findElement(By.id(userName_id)).sendKeys(userName);
    }

    public static void fill_password(String password){
        driver.findElement(By.id(password_id)).sendKeys(password);
    }

    public static void submit(){
        driver.findElement(By.id(submit_xpath)).click();
    }

}
