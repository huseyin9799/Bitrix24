package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.CourierDeliveryPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class CourierDeliveryStepDefinitions {

    CourierDeliveryPage courierDeliveryPage = new CourierDeliveryPage();

    @Given("user is on the courier delivery form")
    public void user_is_on_the_courier_delivery_form() {
        courierDeliveryPage.navigateToCourierDelivery();
    }

    @When("user enters valid data in each field")
    public void user_enters_valid_data_in_each_field(Map<String,String> dataTable) {
        courierDeliveryPage.sendCourierDeliveryForm(dataTable);
    }

    @When("clicks {string} button")
    public void clicks_button(String string) {
        courierDeliveryPage.clickSubmitOrder();
    }

    @Then("user should see the order created at the top of My Orders page")
    public void user_should_see_the_order_created_at_the_top_of_my_orders_page() {
        Assert.assertTrue("Did not get re-routed to My Orders page!",courierDeliveryPage.getPageTitle().equals("My Orders"));
        Assert.assertTrue(courierDeliveryPage.confirmRequest());
    }
}
