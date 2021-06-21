package Com.Test.Shahi.QualitestWebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateAccountInfoPage {

	private WebDriver driver;

	private By PersInfo = By.xpath("//span[text()='My personal information']");
	private By Fname = By.id("firstname");
	private By oldpwd = By.id("old_passwd");
	private By Submit = By.xpath("(//button[@type='submit'])[2]");
	private By Assert3 = By.xpath("//p[@class='alert alert-success']");

	public UpdateAccountInfoPage(WebDriver driver) {
		this.driver = driver;
	}

	public void MyAccount() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebDriverWait w1 = new WebDriverWait(driver, 500);
		w1.until(ExpectedConditions.elementToBeClickable(PersInfo));
		driver.findElement(PersInfo).click();

	}

	public void UpdatesFname() {

		WebDriverWait w1 = new WebDriverWait(driver, 500);
		w1.until(ExpectedConditions.elementToBeClickable(Fname));
		driver.findElement(Fname).clear();
		driver.findElement(Fname).sendKeys("Test Automation User");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(oldpwd).sendKeys("Test@123");
		driver.findElement(Submit).click();
	}

	public String Assert3() {
		return driver.findElement(Assert3).getText();

	}
}
