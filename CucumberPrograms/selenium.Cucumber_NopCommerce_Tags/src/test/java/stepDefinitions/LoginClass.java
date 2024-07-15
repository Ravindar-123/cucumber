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

public class LoginClass {
	public static WebDriver driver;
	@Given("open browser and get url np")
	public void open_browser_and_get_url_np() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
	}
	
	@When("user enter valid username np")
	public void user_enter_valid_username_np() {
	WebElement uname =  driver.findElement(By.id(("Email")));
	uname.clear();
	uname.sendKeys("admin@yourstore.com");  
	}

	@When("user enter valid password np")
	public void user_enter_valid_password_np() {
	 WebElement pwd =  driver.findElement(By.id("Password"));
	 pwd.clear();
	 pwd.sendKeys("admin");
	}

	@When("user click on login button np")
	public void user_click_on_login_button_np() throws InterruptedException {
	  driver.findElement(By.xpath("//button[1][@type=\"submit\"]")).click();
		Thread.sleep(1000);
	}

	@Then("it should navigate to home page np")
	public void it_should_navigate_to_home_page_np() throws InterruptedException {
		Thread.sleep(2000);
    String	expectedValue =  "Dashboard / nopCommerce administration";
	String  actualValue = driver.getTitle();
	Assert.assertEquals(expectedValue, actualValue);
	}
	@When("user enter invalid username np")
	public void user_enter_invalid_username_np() {
		WebElement uname =  driver.findElement(By.id(("Email")));
		uname.clear();
		uname.sendKeys("fhskwe");	
	}
	@And("user enter invalid password np")
	public void user_enter_invalid_password_np() {
		 WebElement pwd =  driver.findElement(By.id("Password"));
		 pwd.clear();
		 pwd.sendKeys("dsj23");
	}
}
