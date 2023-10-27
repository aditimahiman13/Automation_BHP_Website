package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.concurrent.TimeUnit;
//
//public class DatePicker {
//    WebDriver driver;
//
//    public DatePicker(WebDriver driver) {
//
//    }
//    public void(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//        // Identify the date picker element (change the locator as per your HTML)
//        WebElement datePicker = driver.findElement(By.id("datePickerId"));
//
//        // Get the current date
//        Date currentDate = new Date();
//
//        // Format the current date as per the expected date format
//        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); // Modify the format as needed
//        String formattedDate = dateFormat.format(currentDate);
//
//        // Enter the formatted date into the date picker
//        datePicker.sendKeys(formattedDate);
//
//
//    }
//}