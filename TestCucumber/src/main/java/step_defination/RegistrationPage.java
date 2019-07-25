package step_defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationPage {
	WebDriver driver;
	@Given("Launching of the Test Me App Application")
	public void launching_of_the_Test_Me_App_Application() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://10.232.237.143:443/TestMeApp");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Given("I click on SignUp link")
	public void i_click_on_SignUp_link() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
	}

	@Then("I Provide UserName {string}")
	public void i_Provide_UserName(String string) {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("I provide FirstName {string}")
	public void i_provide_FirstName(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(string);
	}

	@Then("I provide LastName {string}")
	public void i_provide_LastName(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(string);
	}

	@Then("I provide Password {string}")
	public void i_provide_Password(String string) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("I provide Confirm Password {string}")
	public void i_provide_Confirm_Password(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys(string);
	}

	@Then("I provide Gender")
	public void i_provide_Gender() {
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("I provide E-Mail {string}")
	public void i_provide_E_Mail(String string) {
		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("I provide Mobile Number {string}")
	public void i_provide_Mobile_Number(String string) {
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("I Provide DOB {string}")
	public void i_Provide_DOB(String string) {
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("I provide Address {string}")
	public void i_provide_Address(String string) {
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("I provide Security Question")
	public void i_provide_Security_Question() {
		driver.findElement(By.xpath("//option[@value='411011']")).click();
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("I Provide Answer {string}")
	public void i_Provide_Answer(String string) {
		driver.findElement(By.xpath("//input[@id='answer']")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("I Click on Register")
	public void i_Click_on_Register() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		Thread.sleep(5000);
	}
	
	
	@Given("I provide username {string}")
	public void i_provide_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(string);
	}
	@And("I provide password {string}")
	public void i_provide_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string);
		
	}
	



@Then("I click on login and verify the login status")
public void i_click_on_login_and_verify_the_login_status() {
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//input[@name='Login']")).click();
}
}