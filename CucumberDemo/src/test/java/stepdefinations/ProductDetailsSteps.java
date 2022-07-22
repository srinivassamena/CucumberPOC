package stepdefinations;

import static org.junit.Assert.assertTrue;

import com.pages.HomePage;
import com.pages.ProductDetailsPage;
import com.pages.ResultsPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.When;

public class ProductDetailsSteps {
	
	private HomePage homePage = new HomePage(DriverFactory.getDriver());
	private ResultsPage resultspage = new ResultsPage(DriverFactory.getDriver());
	private ProductDetailsPage productDetailPage = new ProductDetailsPage(DriverFactory.getDriver());
	@When("user enter Product Category in search box {string}")
	public void user_enter_product_category_in_search_box(String productCategory) {
	    
		homePage.searchCatPart(productCategory);
		
	}

	@When("user select the {string}")
	public void user_select_the(String productName) throws InterruptedException {
		resultspage.selectProduct(productName);
	}

	@When("verify Product details Warranty Information and View Return Policy links displayed")
	public void verify_product_details_links_displayed() {
		assertTrue(productDetailPage.validateLoginToViewPriceDiplayed());
		assertTrue(productDetailPage.validateWarrantyInformationDiplayed());
		assertTrue(productDetailPage.validateViewReturnPolicyDiplayed());
			    
	}

}
