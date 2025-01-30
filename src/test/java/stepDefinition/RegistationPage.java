package stepDefinition;

import io.cucumber.java.en.Then;

import static pages.RegistrationPage.*;

public class RegistationPage {

    @Then("User should be able to view the registration page")
    public void user_should_be_able_to_view_the_registration_page() {
        verifyRegistrationHeader();
//        select_Salutation("Mr.");
//        fill_firstName("Jwala");
//        fill_lastName("Yadav");
//        fill_email("");
//        fill_contact("");
//        fill_userName("");
//        fill_password("");
//        submit();
    }
}
