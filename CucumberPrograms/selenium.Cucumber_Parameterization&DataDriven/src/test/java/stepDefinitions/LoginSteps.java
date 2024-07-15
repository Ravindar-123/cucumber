package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	 public static WebDriver driver;
	 @Given("open browser and get url")
	 public void open_browser_and_get_url() {
	 	driver = new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.get("https://practicetestautomation.com/practice-test-login/");
	 }
	 @When("user enter {string}")
	 public void user_enter_valid_username(String userdata) {
	 	WebElement usernamefield = driver.findElement(By.id("username"));
	 	usernamefield.sendKeys(userdata);
	 }
	 @And("user entered {string}")
	 public void user_enter_valid_password(String pwd) {
	 	WebElement passwordfield = driver.findElement(By.id("password"));
	 	passwordfield.sendKeys(pwd);
	 }
	 @When("user click on login button")
	 public void user_click_on_login_button() {
	 	driver.findElement(By.id("submit")).click();
	 }
	 @Then("it should navigate to home page")
	 	public void it_should_navigate_to_home_page() {
	 	String expectedvalue = "Logged In Successfully | Practice Test Automation";
	 	String actualvalue = driver.getTitle();
	 	Assert.assertEquals(expectedvalue, actualvalue);
	 }
}
