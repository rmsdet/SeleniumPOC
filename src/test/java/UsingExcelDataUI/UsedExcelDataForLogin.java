package UsingExcelDataUI;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.ExcelUtil;
public class UsedExcelDataForLogin {

	public static void main(String[] args) {
    String userName= ExcelUtil.cellValue("Sheet1",1, 0);
    String passWord= ExcelUtil.cellValue("Sheet1",1, 1);
    WebDriver driver;
    driver=new ChromeDriver();
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().maximize();
    
    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    WebElement unElement=driver.findElement(By.id("user-name"));
    //wait.until(ExpectedCondition.elementToBeClickable(unElement));
    unElement.sendKeys(userName);
    
    WebElement pwElement=driver.findElement(By.id("password"));
    pwElement.sendKeys(passWord);
    
    driver.findElement(By.id("login-button")).click();
    

	}

}
