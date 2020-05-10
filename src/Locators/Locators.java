package Locators;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;

import com.google.inject.internal.Scoping;

import browser.BrowserSetup;

public class Locators extends BrowserSetup {
	public static WebElement searchtTextBox() {    //returns search box webElement
		WebElement input = driver.findElement(By.xpath("//*[@id='header-search-field']"));
		return input;	
 }
public static WebElement filter(){ 
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement filterElement =driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[2]/div[3]/div/div/div[5]/div[1]/div[1]/div[1]/button"));   
	js.executeScript("arguments[0].scrollIntoView(true)",filterElement);
	return filterElement;
}
public static WebElement filter1(){
	
      WebElement beginnerEl = driver.findElement(By.xpath("//*[@id=\"filter-form--13\"]/fieldset[3]/div[2]/label/span"));
      return  beginnerEl;
}
public static WebElement filter2(){
	
       WebElement englishEl = driver.findElement(By.xpath("//*[@id=\"filter-form--13\"]/fieldset[4]/div[1]/label/span"));
       return englishEl;
}
public static WebElement submit() {
	WebElement doneBtn = driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[2]/div[3]/div/div/div[5]/div[1]/div[1]/div[1]/button[1]"));
    return doneBtn;
}
public static String  listofcourse() {
	for(int i=0; i<3 ; i++) {
		String course =	driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[2]/div[3]/div/div/div[5]/div[2]/div["+(i+1)+"]/div/a/div/div[2]/div[1]/h4"));	
	return course;

}
}




}