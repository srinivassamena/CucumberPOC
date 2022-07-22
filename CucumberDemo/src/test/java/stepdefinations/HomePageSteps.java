package stepdefinations;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePageSteps {
	
	private static String title;
	public WebDriver driver;
	private HomePage homePage = new HomePage(DriverFactory.getDriver());
	
	
	@Given("user is on Home page")
	public void user_is_on_home_page() throws InterruptedException {
	    DriverFactory.getDriver().get("https://parts.cat.com/en/catcorp");
	    Thread.sleep(5000);
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = homePage.getHomePageTitle();
		System.out.println("Page title:" + title);
	    
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
	    Assert.assertTrue(title.contains(expectedTitleName));
	}

	@When("user enter Cat part in search box {string}")
	public void user_enter_cat_part_in_search_box(String searchCatParts) {
	   homePage.searchCatPart(searchCatParts);
	}

	@When("user clicks on enter")
	public void user_clicks_on_enter(){
	    homePage.clickEnterButton();
	    
	}


	

}
