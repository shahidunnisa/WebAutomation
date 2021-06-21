package Com.Test.Shahi.StepDefinitions;

import org.testng.Assert;

import Com.Test.Shahi.QualitestWebAutomation.OrderHistoryPage;
import Com.Test.Shahi.QualitestWebAutomation.UpdateAccountInfoPage;
import Com.Test.Shahi.QualitestWebAutomation.base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateAccountInfo {
	private UpdateAccountInfoPage AH = new UpdateAccountInfoPage(base.getDriver());
	private OrderHistoryPage OR = new OrderHistoryPage(base.getDriver());

	@Given("user is in the home page")
	public void user_is_in_the_home_page() {
		base.getDriver().get("http://automationpractice.com/index.php");
		OR.Login();
		Assert.assertTrue(OR.Assert1()
				.contains("Welcome to your account. Here you can manage all of your personal information and orders."));
	}

	@When("user selects My Account")
	public void user_selects_my_account() {
		AH.MyAccount();
	}

	@And("updates the first name and Click on Save")
	public void updates_the_first_name_and_click_on_save() {
		AH.UpdatesFname();
	}

	@Then("First name is updated successfully")
	public void first_name_is_updated_successfully() {
		Assert.assertTrue(AH.Assert3().contains("Your personal information has been successfully updated."));
	}

}
