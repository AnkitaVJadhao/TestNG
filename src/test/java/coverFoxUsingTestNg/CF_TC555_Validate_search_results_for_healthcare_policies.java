package coverFoxUsingTestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.internal.Console;

public class CF_TC555_Validate_search_results_for_healthcare_policies
{
	
	WebDriver driver;
	CoverFoxHomePage homepage;
	CoverFoxHealthPlanPage healthplanpage;
	CoverFoxMemberDetailsPage memberDetails;
	CoverFoxAddressDetailsPage addressDetails;
	CoverFoxHealthPlanResultsPage healthplanpageresult;
  @BeforeClass
  public void launchBrowser() throws InterruptedException 
  {
	  
	  driver=new ChromeDriver();
	  homepage=new CoverFoxHomePage(driver);
	  memberDetails=new CoverFoxMemberDetailsPage(driver);
	  addressDetails=new CoverFoxAddressDetailsPage(driver);
	  healthplanpage=new CoverFoxHealthPlanPage(driver);
	  healthplanpageresult=new CoverFoxHealthPlanResultsPage(driver);
	  
	  Reporter.log("Opening Browser",true);
	  driver.get("https://www.coverfox.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
  }
  
  @BeforeMethod
  public void enterDetails() throws InterruptedException
  {
	  Reporter.log("clicking on gender button ", true);
	  homepage.clickoncheckbox();
	  Thread.sleep(5000);
	  
	  Reporter.log("clicking on next button ", true);
	  healthplanpage.click_on_Nextbutton();
	  Thread.sleep(2000);
	  Reporter.log("Handeling age drop down ", true);
	  memberDetails.select_age("32");
	  Reporter.log("Clicking on next button ", true);
	  memberDetails.next_after_selecting_age();
	  Thread.sleep(2000);
	  Reporter.log("Entering pin code ",true);
	  addressDetails.enter_pincode("443001");
	  Reporter.log("Entering mobile num ",true);
	  addressDetails.enter_mobile("9403599094");
	  Reporter.log("Clicking on continue button ", true);
	  addressDetails.click_continueButton();
	  Thread.sleep(2000); 
  }
  @Test
  public void validateTestPlansFromTextAndBanners() throws InterruptedException
  {
	  Thread.sleep(5000);
	  Reporter.log("Fetching number of results from text ", true);
	  int textResult = healthplanpageresult.search_result();
	  Thread.sleep(7000);
	  Reporter.log("Fetching number of results from Banners ", true);
	  int bannerResult=healthplanpageresult.availablePlanNumberFromBanners();
	  Thread.sleep(1000);
	  Assert.assertEquals(textResult, bannerResult,"Both are not equal ,Test case is failed");
	  Reporter.log("TC is passed ", true);
	  
	  Reporter.log("Click on Apply");
	  
	  healthplanpageresult.clickOnPreferred_Brands();
	  healthplanpageresult.clickOnAdityaBirla();
	  healthplanpageresult.clicONApplyButton();
	  
	  Thread.sleep(3000);
	  int expectedplans = healthplanpageresult.filterSearchResult();
	  int actualResult = healthplanpageresult.validatebirlaPlans();
	  Assert.assertEquals(expectedplans, actualResult,"Plans not matching");
	  Reporter.log(expectedplans+ "and" +actualResult,true);
  }
  
  
  @AfterMethod
  public void closeBrowser() throws InterruptedException
  {
	  Reporter.log("Closing browser ", true);
	  Thread.sleep(3000);
	  driver.close();
  }
}
