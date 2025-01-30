package stepDefinition;

import io.cucumber.java.en.*;
import static pages.HomePage.*;


public class HomePage {

    @Given("User navigate to login page")
    public void user_navigate_to_login_page() throws InterruptedException {
        click_hamburger_menu();
        click_signIn_link();
    }
}
