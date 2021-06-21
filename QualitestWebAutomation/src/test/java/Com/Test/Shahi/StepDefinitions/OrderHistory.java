package Com.Test.Shahi.StepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import Com.Test.Shahi.QualitestWebAutomation.OrderHistoryPage;
import Com.Test.Shahi.QualitestWebAutomation.base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderHistory {

	private OrderHistoryPage OR = new OrderHistoryPage(base.getDriver());

	@Given("user is in the order page")
	public void user_is_in_the_order_page() throws Throwable {
		base.getDriver().get("http://automationpractice.com/index.php");
		OR.Login();
		Assert.assertTrue(OR.Assert1()
				.contains("Welcome to your account. Here you can manage all of your personal information and orders."));
	}

	@When("user selects the Tshirt and clicks on add to cart")
	public void user_selects_the_tshirt_and_clicks_on_add_to_cart() throws Throwable {
		OR.AddtoCart();
	}

	@And("user clicks on proceed to checkout and places the order")
	public void user_clicks_on_proceed_to_checkout_and_places_the_order() throws Throwable {
		OR.Checkout();
	}

	@Then("Tshirt is ordered successfully and is available in order history")
	public void tshirt_is_ordered_successfully_and_is_available_in_order_history() throws Throwable {
		OR.OrderHistory();
		Assert.assertTrue(OR.Assert2().contains("Order reference"));
	}

}
