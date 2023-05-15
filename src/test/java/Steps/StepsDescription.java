package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDescription {
	public static WebDriver driver;	
	
	@Given("Launch Linkedin Application Login Page")
	public void Launch_Linkedin_Application_Login_Page() 
	{
		 	System.setProperty("webdriver.chrome.driver","C:\\SeleniumAll\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		
			driver = new ChromeDriver();
			System.out.println("Chrome Browser launch succesfully");
			
			driver.manage().window().maximize();
			driver.get("https://www.linkedin.com/");
			
	}
	@When ("User Entered Valid Username and password")
	public void User_Entered_Valid_Username_and_password()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.xpath("//input[@id='session_key']"));
		username.sendKeys("darshanspokharkar@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement password = driver.findElement(By.xpath("//input[@id='session_password']"));
		password.sendKeys("darshan23");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@data-id='sign-in-form__submit-btn']")).click();
	}
	@Then ("Login should be successfully")
	public void Login_should_be_successfully()
	{
		System.out.println("Login should be successfully");
	}
	
	//my network button
		@When ("User should be clicked on MyNetwork button")
		public void User_should_be_clicked_on_MyNetwork_button() throws InterruptedException
		{
			WebElement MyNetwork= driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/mynetwork/?']"));
			MyNetwork.click();
			Thread.sleep(3000);
			Actions action = new Actions(driver);
			action.moveToElement(MyNetwork).perform();
		}
		@Then ("MyNetwork button should be clicked successfully")
		public void MyNetwork_button_should_be_clicked_successfully()
		{
			System.out.println("MyNetwork button should be successfully click");
		}
	
	//job button
	@When ("User should be clicked on job button")
	public void User_should_be_clicked_on_job_button() throws InterruptedException
	{
		WebElement Jobs = driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/jobs/?']"));
		Jobs.click();
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(Jobs).perform();
	}
	@Then ("Job button should be clicked successfully")
	public void Job_button_should_be_clicked_successfully()
	{
		System.out.println("Jobs button should be successfully click");
	}
		
	//messaging button
	@When ("User should be clicked on Messaging button")
	public void User_should_be_clicked_on_Messaging_button() throws InterruptedException
	{
		WebElement Messaging = driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/messaging/?']"));
		Messaging.click();
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(Messaging).perform();
	}
	@Then ("Messaging button should be clicked successfully")
	public void Messaging_button_should_be_clicked_successfully()
	{
		System.out.println("Messaging button should be successfully click");
	}
	
	//notification button
		@When ("User should be clicked on Notification button")
		public void User_should_be_clicked_on_Notification_button() throws InterruptedException 
		{
			WebElement Notification = driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/notifications/?']"));
			Notification.click();
			Thread.sleep(3000);
			Actions action = new Actions(driver);
			action.moveToElement(Notification).perform();
		}
		@Then ("Notification button should be clicked successfully")
		public void Notification_button_should_be_clicked_successfully()
		{
			System.out.println("Notification button should be successfully click");
		}
		
		
	//Me button
		@When ("User should be clicked on Me button")
		public void User_should_be_clicked_on_Me_button() throws InterruptedException
		{
			WebElement Me = driver.findElement(By.xpath("//button[@id='ember13']"));
			Me.click();
			Actions action = new Actions(driver);
		    action.moveToElement(Me).perform();
		    		}
		@Then("Me button should be clicked successfully")
		public void Me_button_should_be_clicked_successfully()
		{
			System.out.println("Me button should be successfully click");
		}
		
		@When("User should be clicked on Signout")
		public void User_should_be_clicked_on_Signout() throws InterruptedException 
		{
			//logout by Link test 
			WebElement signOut = driver.findElement(By.linkText("Sign Out"));
			signOut.click();
			
		}
		@Then("Signout should be clicked successfully")
		public void Signout_should_be_clicked_successfully() 
		{
			System.out.println("Signout should be clicked successfully");
		}

		//@ReggressionTest 
		//tags = "@ReggressionTest"

	
}





