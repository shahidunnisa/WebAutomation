package Com.Test.Shahi.QualitestWebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderHistoryPage {

	private WebDriver driver;

	private By Signin = By.xpath("//a[@title='Log in to your customer account']");
	private By email = By.id("email");
	private By pwd = By.id("passwd");
	private By Submit = By.id("SubmitLogin");
	private By Assert1 = By.xpath(
			"//p[text()='Welcome to your account. Here you can manage all of your personal information and orders.']");
	private By TShirt = By.xpath("(//a[@title='T-shirts'])[2]");
	private By MouseHover = By.xpath("//span[@class='available-now']");
	private By AddtoCart = By.xpath("//a[@title='Add to cart']");
	private By Checkout = By.xpath("//a[@title='Proceed to checkout']");
	private By Checkout1 = By.xpath("(//a[@title='Proceed to checkout'])[2]");
	private By Checkout2 = By.xpath("//button[@name='processAddress']");
	private By Checkout3 = By.xpath("//button[@name='processCarrier']");
	private By tc = By.id("cgv");
	private By Payment = By.xpath("//a[@title='Pay by bank wire']");
	private By FinalSubmit = By.xpath("(//button[@type='submit'])[2]");
	private By Myorders = By.xpath("//a[@title='My orders']");
	private By Assert2 = By.xpath("//th[text()='Order reference']");

	public OrderHistoryPage(WebDriver driver) {
		this.driver = driver;
	}

	public void Login() {
		driver.findElement(Signin).click();
		driver.findElement(email).sendKeys("Test20111992@gmail.com");
		driver.findElement(pwd).sendKeys("Test@123");
		driver.findElement(Submit).click();
	}

	public String Assert1() {
		return driver.findElement(Assert1).getText();

	}

	public void AddtoCart() {
		driver.findElement(TShirt).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		Actions actions = new Actions(driver);
		WebElement menuOption = driver.findElement(MouseHover);
		actions.moveToElement(menuOption).perform();
		driver.findElement(AddtoCart).click();
	}

	public void Checkout() {

		WebDriverWait w1 = new WebDriverWait(driver, 500);
		w1.until(ExpectedConditions.elementToBeClickable(Checkout));
		driver.findElement(Checkout).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebDriverWait w2 = new WebDriverWait(driver, 500);
		w2.until(ExpectedConditions.elementToBeClickable(Checkout1));
		driver.findElement(Checkout1).click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1000)");
		WebDriverWait w3 = new WebDriverWait(driver, 500);
		w3.until(ExpectedConditions.elementToBeClickable(Checkout2));
		driver.findElement(Checkout2).click();
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,1000)");

		driver.findElement(tc).click();
		WebDriverWait w5 = new WebDriverWait(driver, 500);
		w5.until(ExpectedConditions.elementToBeClickable(Checkout3));
		driver.findElement(Checkout3).click();
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,1000)");
		driver.findElement(Payment).click();
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,1000)");
		driver.findElement(FinalSubmit).click();

	}

	public void OrderHistory() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebDriverWait w1 = new WebDriverWait(driver, 500);
		w1.until(ExpectedConditions.elementToBeClickable(Myorders));
		driver.findElement(Myorders).click();
	}

	public String Assert2() {
		return driver.findElement(Assert2).getText();

	}
}
