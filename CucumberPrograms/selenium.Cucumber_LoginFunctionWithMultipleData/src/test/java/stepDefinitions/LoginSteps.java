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
@When("user enter valid username")
public void user_enter_valid_username() {
	WebElement usernamefield = driver.findElement(By.id("username"));
	usernamefield.sendKeys("student");
}
@And("user enter valid password")
public void user_enter_valid_password() {
	WebElement passwordfield = driver.findElement(By.id("password"));
	passwordfield.sendKeys("Password123");
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


@When("user enter invalid username")
public void user_enter_invalid_username() {
	WebElement usernamefield = driver.findElement(By.id("username"));
	usernamefield.sendKeys("hhkj");
}

@When("user enter invalid password")
public void user_enter_invalid_password() {
	WebElement passwordfield = driver.findElement(By.id("password"));
	passwordfield.sendKeys("7y2hg");   
}

@Then("it should display invalid username and invalid password")
public void it_should_display_invalid_username_and_invalid_password() {
	WebElement usernamefield = driver.findElement(By.id("username"));
	usernamefield.sendKeys("hhkj");
	WebElement passwordfield = driver.findElement(By.id("password"));
	passwordfield.sendKeys("7y2hg");   
}

@Then("it should display invalid password")
public void it_should_display_invalid_password() {
	WebElement passwordfield = driver.findElement(By.id("password"));
	passwordfield.sendKeys("7y2hg");   
}

@Then("it should display invalid username")
public void it_should_display_invalid_username() {
	WebElement usernamefield = driver.findElement(By.id("username"));
	usernamefield.sendKeys("hhkj");
}

@When("user left username without entering")
public void user_left_username_without_entering() {
	WebElement usernamefield = driver.findElement(By.id("username"));
	usernamefield.sendKeys("");
}

@When("user left password without entering")
public void user_left_password_without_entering() {
	WebElement passwordfield = driver.findElement(By.id("password"));
	passwordfield.sendKeys("");   
}

@Then("it should display data requried in username and password")
public void it_should_display_data_requried_in_username_and_password() {
	WebElement usernamefield = driver.findElement(By.id("username"));
	usernamefield.sendKeys("");
	WebElement passwordfield = driver.findElement(By.id("password"));
	passwordfield.sendKeys("7y2hg");   
}
}
