package stepDefinition;

import io.cucumber.java.en.*;
import pages.LoggedInPage.*;

import static pages.LoggedInPage.*;

public class LoggedInPage {

    @Then("User should be able to view product category page")
    public void user_should_be_able_to_view_product_category_page() {
        visibility_productCategory_formalShoes();
        visibility_productCategory_sportShoes();
        visibility_productCategory_sneakerShoes();
    }
}
