package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.LoginPage.*;

public class LoginPage {
    @When("User successfully enters the login details")
    public void user_successfully_enters_the_login_details() {
        sendkeys_username();
        sendkeys_password();
        click_login_btn();
    }
    @When("User click on new Registration button")
    public void user_click_on_new_registration_button() {
        click_new_registration_btn();
    }

}
