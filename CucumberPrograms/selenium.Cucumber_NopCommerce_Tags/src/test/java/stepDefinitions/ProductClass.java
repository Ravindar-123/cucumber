package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductClass {
public	static WebDriver driver = LoginClass.driver;

	@When("user click on catlogLink")
	public void user_click_on_catlogLink() throws InterruptedException{
		Thread.sleep(2000);
	driver.findElement(By.xpath("(//p)[3][contains(text(),'Catalog')]")).click();
	}
	
	@When("user click on ProductsLink")
	public void user_click_on_products_link() throws InterruptedException {
		Thread.sleep(2000);	
	  driver.findElement(By.xpath("//a[@href=\"/Admin/Product/List\"]")).click();
	}

	@Then("it should display ProductsPage")
	public void it_should_display_products_page() {
	   String expectedValue = "Products / nopCommerce administration";
	   String actualValue = driver.getTitle();
	   Assert.assertEquals(expectedValue, actualValue);
	}

	@When("user enter valid data")
	public void user_enter_valid_data() {
		driver.findElement(By.id("SearchProductName")).sendKeys("Lenovo IdeaCentre 600 All-in-One PC");;

	}

	@When("user click on searchBtn")
	public void user_click_on_search_btn() throws InterruptedException {
		driver.findElement(By.id("search-products")).click();
		Thread.sleep(2000);
	}
	
	@Then("it should display productsdetails")
    public void it_should_display_productsdetails() {
		String expectedValue = "Lenovo IdeaCentre 600 All-in-One PC";
		String actualValue = driver.findElement(By.xpath("//table/tbody/tr/td[3]")).getText();
		Assert.assertEquals(expectedValue, actualValue);
	}
}
