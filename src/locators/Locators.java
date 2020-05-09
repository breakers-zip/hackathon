package locators;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;

public class Locators extends Browser {
	public static WebElement searchtTextBox() {    //returns search box webElement
			WebElement input = driver.findElement(By.xpath("//*[@id='header-search-field']"));
			return input;	
     }
	 public static WebElement selectCourse() { //returns submit webElement
		 WebElement select =driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div/div/div/ul/li[1]/a/span"));
		 return select;
	 }
	
