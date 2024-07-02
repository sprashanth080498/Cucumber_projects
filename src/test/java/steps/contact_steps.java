package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class contact_steps {
	WebDriver driver;

@Given("user has landed on the sparsh website in chrome")
public void user_has_landed_on_the_sparsh_website_in_chrome() {
	
	ChromeOptions op=new ChromeOptions();
	op.addArguments("headless");
	//driver=new ChromeDriver(op);
	driver=new ChromeDriver();
	driver.get("https://www.sparshhospital.com/contact-us/");
	//driver.manage()tim
	driver.manage().window().maximize();
	
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@When("user enters firstname,lastname,email,phone.")
public void user_enters_firstname_lastname_email_phone() {
	driver.findElement(By.cssSelector("#contact_first_name")).sendKeys("Charan");
	driver.findElement(By.cssSelector("#contact_last_name")).sendKeys("Raj");
	driver.findElement(By.name("contact_email")).sendKeys("charanraj1234@gmail.com");
    driver.findElement(By.cssSelector("#contact_phone")).sendKeys("8870402155");
	// Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@When("user enters {string},{string},email,phone.")
public void user_enters_email_phone(String string, String string2) {
	driver.findElement(By.cssSelector("#contact_first_name")).sendKeys(string);
	driver.findElement(By.cssSelector("#contact_last_name")).sendKeys(string2);
	driver.findElement(By.name("contact_email")).sendKeys("charanraj1234@gmail.com");
    driver.findElement(By.cssSelector("#contact_phone")).sendKeys("8870402155");
}
@When("selects hospital and for general enquiry.")
public void selects_hospital_and_for_general_enquiry() {
	WebElement hosp=driver.findElement(By.name("contact_hospital"));
	Select sel1=new Select(hosp);
	sel1.selectByIndex(2);
	WebElement enq=driver.findElement(By.id("contact_enquiry_type"));
	Select sel2=new Select(enq);
	sel2.selectByIndex(1);
	
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@When("clicks on send button.")
public void clicks_on_send_button() {
	driver.findElement(By.cssSelector("#contact_submit")).click();
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@Then("a message is displayed after successful form filling.")
public void a_message_is_displayed_after_successful_form_filling() {
	System.out.println("Clicked on the submit button");
	driver.close();
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
}
