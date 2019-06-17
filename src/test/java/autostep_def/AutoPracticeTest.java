package autostep_def;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AutoPracticeTest {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	@Given("^user should be on homepage$")
	public void user_homepage() {
		
		   //LAUNCH THE BROWSER
	       //1.Go to website on chrome.
			System.setProperty("webdriver.chrome.driver","D:\\browserexe\\chromedriver_win32\\chromedriver.exe");				
			//OPEN THE GMAIL
			//INTERFACE VARIABLENAME=NEW IMPLEMENTINGCLASS();
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			//add implicitwait command
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(" http://www.automationpractice.com");	
			wait=new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.titleContains("My Store"));			
	}
	@Given("^Click on Add to Cart button that appears on mouseover$")
	public void addto_cart() throws InterruptedException {
		
	//scroll down until that element visible
	//create a variable for JavascriptExecutor and assign webdriver variable.
	JavascriptExecutor jsx=(JavascriptExecutor)driver;
	jsx.executeScript("window.scrollBy(0,500)"," ");
	Thread.sleep(3000);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(AutoPracticeObjectMap.SCROLL_TILLIMG));
	//jsx.executeScript("arguments[0].scrollIntoView(true);",AutoPracticeObjectMap.SCROLL_TILLIMG);
	Thread.sleep(3000);
	
	//2.Mouseover first item in popular list
	//identify that element
	WebElement img=driver.findElement(AutoPracticeObjectMap.IDENT_IMG);
	//create an object for Actions class
	Actions act=new Actions(driver);
	//mouse over on that element
	act.moveToElement(img).perform();
	driver.findElement(AutoPracticeObjectMap.ADDTOCART_ELE).click();	
	}
	
	@When("^transfer control to popup that appears$")
	public void switchto_childwindow() throws InterruptedException {
		//4.transfer control to popup that appears
		//fetching parent windowID
		String pwinid=driver.getWindowHandle();
		//fetch all the window ids or child window ids
		Set<String>chwinid=driver.getWindowHandles();
		for(String allwinids:chwinid) {
			if(!allwinids.equals(pwinid)) {
				//switch to the child window id
				driver.switchTo().window(allwinids);
				Thread.sleep(3000);
										
			}
		}
	}
	@When("^verify product added message$")
	public void success_msg() {
		//5.verify product added message
			wait.until(ExpectedConditions.visibilityOfElementLocated(AutoPracticeObjectMap.SUC_MSG));
	}
	
  @Then("^click on Continue Shopping button in popup$")
  public void continue_shop() {
	  driver.findElement(AutoPracticeObjectMap.CONTSHOP_BUTTON).click();	  
  }
  @When("^transfer control to main page$")
  public void moveto_parentwin() {
	  String pwinid=driver.getWindowHandle();
	  driver.switchTo().window(pwinid);
  }
  @Then("^close the window$")
  public void close_win() {
	  driver.close();
  }
}
