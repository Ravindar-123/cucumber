package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManufracturerClass {
	WebDriver driver = LoginClass.driver;
	
	@When("user click on catlogLinked")
	public void user_click_on_catlogLinked() throws InterruptedException{
		Thread.sleep(2000);
	driver.findElement(By.xpath("(//p)[3][contains(text(),'Catalog')]")).click();
	}
	
	@When("user click on manufracturerLink")
	public void user_click_on_manufracturer_link() throws InterruptedException {
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//p[1][contains(text(),' Manufacturers')]")).click();
	}

	@Then("it should open manufracturer page")
	public void it_should_open_manufracturer_page() throws InterruptedException {
		Thread.sleep(2000);
		String expectedValue = "Manufacturers / nopCommerce administration";
		String actualValue = driver.getTitle();
		Assert.assertEquals(expectedValue, actualValue);
	}
	@When("user enter valid data of manufracturer")
	public void user_enter_valid_data_of_manufracturer() {
		driver.findElement(By.id("SearchManufacturerName")).sendKeys("Apple");;

	}
	@When ("user click on searchBtn of manufracturer")
	public void user_click_on_searchBtn_of_manufracturer() {
		driver.findElement(By.id("search-manufacturers")).click();
	}
	@Then("it should display manufracturer details")
	public void it_should_display_manufracturer_details() {
		String expectedValue = "Apple";
		String actualValue = driver.findElement(By.xpath("//table/tbody/tr/td[2]")).getText();
		Assert.assertEquals(expectedValue, actualValue);	}
}
