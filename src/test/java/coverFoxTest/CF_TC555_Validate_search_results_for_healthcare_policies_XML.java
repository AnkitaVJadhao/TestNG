package coverFoxTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import coverFoxUsingTestNg.CoverFoxAddressDetailsPage;
import coverFoxUsingTestNg.CoverFoxHealthPlanPage;
import coverFoxUsingTestNg.CoverFoxHealthPlanResultsPage;
import coverFoxUsingTestNg.CoverFoxHomePage;
import coverFoxUsingTestNg.CoverFoxMemberDetailsPage;

public class CF_TC555_Validate_search_results_for_healthcare_policies_XML 
	{
		
		WebDriver driver;
		CoverFoxHomePage homepage;
		CoverFoxHealthPlanPage healthplanpage;
		CoverFoxMemberDetailsPage memberDetails;
		CoverFoxAddressDetailsPage addressDetails;
		CoverFoxHealthPlanResultsPage healthplanpageresult;
		@Parameters("Url")
	  @BeforeClass
	  public void launchBrowser(String Url) throws InterruptedException 
	  {
		  
		  driver=new ChromeDriver();
		  homepage=new CoverFoxHomePage(driver);
		  memberDetails=new CoverFoxMemberDetailsPage(driver);
		  addressDetails=new CoverFoxAddressDetailsPage(driver);
		  healthplanpage=new CoverFoxHealthPlanPage(driver);
		  healthplanpageresult=new CoverFoxHealthPlanResultsPage(driver);
		  
		  Reporter.log("Opening Browser",true);
		  driver.get(Url);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   
	  }
		@Parameters({"age","pincode","Mnumber"})
	  @BeforeMethod
	  public void enterDetails(String age,String pincode,String mobileNumber) throws InterruptedException
	  {
		  Reporter.log("clicking on gender button ", true);
		  homepage.clickoncheckbox();
		  Thread.sleep(5000);
		  
		  Reporter.log("clicking on next button ", true);
		  healthplanpage.click_on_Nextbutton();
		  Thread.sleep(2000);
		  Reporter.log("Handeling age drop down ", true);
		  memberDetails.select_age(age);
		  Reporter.log("Clicking on next button ", true);
		  memberDetails.next_after_selecting_age();
		  Thread.sleep(2000);
		  Reporter.log("Entering pin code ",true);
		  addressDetails.enter_pincode(pincode);
		  Reporter.log("Entering mobile num ",true);
		  addressDetails.enter_mobile(mobileNumber);
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
	  }
	  @AfterMethod
	  public void closeBrowser() throws InterruptedException
	  {
		  Reporter.log("Closing browser ", true);
		  Thread.sleep(3000);
		  driver.close();
	  }
	}

