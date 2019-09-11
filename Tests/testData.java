import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testData {
	WebDriver driver;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/macbookair/Desktop/chromedriver");
		driver = new ChromeDriver();
		// 2. go to website
		driver.get("http://www.mcdonalds.ca");
		
		WebElement crossButton = driver.findElement(By.xpath("//a[@class='exit']"));
	    crossButton.click();
		
	}

	
	@After
	public void tearDown() throws Exception {
	}
	
	// TC1---“Subscribe to my Mcd’s”
	@Test
	public void test() {
		String title = driver.findElement(By.className("click-before-outline")).getText();
		System.out.println("title here = "+ title);
		assertEquals("Subscribe to My McD’s®",title);
	}
	
	// TC2 ----Happy Path
	@Test
	public void test2(){
		
		
		WebElement firstName = driver.findElement(By.id("firstname2"));
		firstName.sendKeys("diljit");
		WebElement email = driver.findElement(By.id("email2"));
		email.sendKeys("diljit7686@gmail.com");
		WebElement postalCode = driver.findElement(By.id("postalcode2"));
		postalCode.click();
		postalCode.sendKeys("L7A");
		
		WebElement subButton = driver.findElement(By.id("g-recaptcha-btn-2"));
		subButton.click();
		
		
		WebElement captcha = driver.findElement(By.xpath("//a[@class='rc-button-default goog-inline-block']"));
	    captcha.click();
	  
	} 
@Test
public void test3() {
	   // TC3 ---  NEGATIVE CASE
	    
//		WebElement firstName = driver.findElement(By.id("firstname2"));
//		firstName.sendKeys("diljit");
//		WebElement email = driver.findElement(By.id("email2"));
//		email.sendKeys("diljit7686@gmail.com");
//		WebElement postalCode = driver.findElement(By.id("postalcode2"));
//		postalCode.click();
//		postalCode.sendKeys("L7A");
//		
    	WebElement negativeButton = driver.findElement(By.id("g-recaptcha-btn-2"));
		negativeButton.click();
	    
}
}
