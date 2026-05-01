package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.annotations.Listeners;
import BasePackage.TestListner; //This line only tells Java compiler,This class exists, you can use it
@Listeners(TestListener.class) // Attach this Listener class to this test class, tells testng to execute it

import BasePackage.BaseTest;

import util.ExcelUtil;

public class SauceLabLogin extends BaseTest {
	@Test
    public void loginTest() {
    	test = extent.createTest("Sauce Labs Login Test1");
        log.info("Starting Sauce Labs Login Test");
        // Read username, password from Excel
        String username = ExcelUtil.cellValue("Sheet1", 1, 0);
        String password = ExcelUtil.cellValue("Sheet1", 1, 1);
        log.info("Entering username");
        WebElement uname = driver.findElement(By.id("user-name"));
        uname.sendKeys(username);
        log.info("Entering password");
        // Enter password
        WebElement pwd = driver.findElement(By.id("password"));
        pwd.sendKeys(password);
        log.info("Clicking login button");
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();
        // Validation
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
        test.pass("Login successful");
        log.info("Login successful");
    }
    
    @Test
    public void sampletest1() {
    	test = extent.createTest("Sauce Labs Login Test2");
        log.info("Starting Sauce Labs Login Test");
        System.out.println("sample test case");
}}



