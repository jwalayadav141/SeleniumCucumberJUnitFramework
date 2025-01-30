package stepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;


import static pages.HomePage.*;
import static pages.OnlineProductsPage.*;

public class OnlineProductsPage {

    @Given("User navigates to Online product page")
    public void user_navigates_to_online_product_page() throws InterruptedException {
        click_hamburger_menu();
        click_online_product();

    }
    @When("User clicks on formal shoes dropdown")
    public void user_clicks_on_formal_shoes_dropdown() {
        formal_shoes_dropdown();

    }
    @Then("User should be able to view product")
    public void user_should_be_able_to_view_product() {
        String shoes_text = verify_visibility_of_classic_cheltenham();
        Assert.assertEquals("   Classic Cheltenham", shoes_text);
    }
}
