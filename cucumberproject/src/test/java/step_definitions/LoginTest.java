package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class LoginTest {
	WebDriver dr;

	@Given("Already registered user access the url")
	public void openURL() throws InterruptedException {
		String path = "C:\\Users\\anand\\eclipse-workspace\\cucumberproject\\drivers\\";

		System.setProperty("webdriver.chrome.driver", path + "chromedriver.exe");
		dr = new ChromeDriver();

		dr.get("http://demowebshop.tricentis.com/");
		dr.manage().window().maximize();
		Thread.sleep(2000); // Let the user actually see something!
	}

	@When("User clicks on login link")
	public void clickLoginLink() {

		WebElement lnk_Login = dr.findElement(By.xpath("//a[@class='ico-login']"));
		lnk_Login.click();
	}

	// Actions for this class
	@And("User enters username to the username box")
	public void enterUserEmail() {

		WebElement txtbx_usremail = dr.findElement(By.id("Email"));
		txtbx_usremail.clear();
		txtbx_usremail.sendKeys("preeti.k1125@gmail.com");
	}

	@And("User enters userpassword to the userpassword box")
	public void enterUserPassword() {

		WebElement txtbx_usrpwd = dr.findElement(By.id("Password"));
		txtbx_usrpwd.clear();
		txtbx_usrpwd.sendKeys("abc@123");
	}

	@And("User clicks on the login button")
	public void ClickLoginBtn() {
		// usrpwd.submit(); Example where we are submitting the form. Example -// Using
		// ENTER KEY...

		WebElement btn_Login = dr.findElement(By.xpath("(//input[@type='submit'])[2]"));
		btn_Login.click();
	}

	@Then("User navigate to home page")
	public void userHomePage() {
		System.out.println("User is in Home Page ...");
	}

	@Then("Click on Logout")
	public void click_on_logout() {
		WebElement wb_lnk_logout = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
		wb_lnk_logout.click();
	}

	@Then("Close Browser")
	public void Close_Browser() {
		dr.quit();
	}

}