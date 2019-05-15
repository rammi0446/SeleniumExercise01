import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest {

	final String URL = "https://www.seleniumeasy.com/test/basic-checkbox-demo.html";
	final String DRIVER_PATH = "/Users/macstudent/Desktop/chromedriver";
	
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		// Setup Selenium + Chrome
		System.setProperty("webdriver.chrome.driver",DRIVER_PATH);
		driver = new ChromeDriver();
		
		// Tell Selenium what page to test
		driver.get(URL);
				
	}

	@After
	public void tearDown() throws Exception {
		// At end of test case, wait for a few seconds, then close the browser
		Thread.sleep(1000);				// OPTION 1
		TimeUnit.SECONDS.sleep(1);		// OPTION 2
		driver.close();
	}

	@Test
	public void testSingleCheckBox() {
		fail("Not yet implemented");
		
		//find check box (id= "isAgeSeleted")
		//click on the checkbox
		//find the output message (id="txtAge")
		//check the output message = "sucess -check box is checked"
		
		WebElement checkBox = driver.findElement(By.id("isAgeSeleted"));
		checkBox.click();
		
		//test that checkbox is checked
		boolean isChecked = checkBox.isSelected();
		assertTrue(isChecked);
		
		WebElement outputDiv = driver.findElement(By.id("txtAge"));
		String actualOutput = outputDiv.getText();
		
		String expectedOutput = "sucess -check box is checked";
		assertEquals(expectedOutput,actualOutput);
		
		
	
	}

}
