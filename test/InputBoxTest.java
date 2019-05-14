import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class InputBoxTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	void testsingleInput()
	{
		System.setProperty("webdriver.chrome.driver","/Users/macstudent/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://www.seleniumeasy.com/test/basic-first-form-demo.html";
		driver.get(baseUrl);
		
		//tell slenium to get page
		
		
		
		//Find the textbox (id = user-message)
		//type "hello" into the box
		//find the button (cssSelector = form#get-input button)
		//click on the button
		//find the output message thing
		//ckeck the output message(expectedResult = "Hello World"
		
		WebElement textBox = driver.findElement(By.id("user-message"));
		textBox.sendKeys("Hello World");
		
		WebElement button = driver.findElement(By.cssSelector("form#grt-input button"));
		button.click();
		
		WebElement outputSpan = driver.findElement(By.id("display"));
				String outputMessage = outputSpan.getText();
				assertEquals("Hello World", outputMessage);
				
				driver.close();
				
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
