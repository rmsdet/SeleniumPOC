package UITest;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseTest;

public class AppLoginTest extends BaseTest {

	@Test(priority=0)
	public void verifyLoginPageTitle() throws InterruptedException {
		String titles=driver.getTitle();
		Assert.assertEquals(titles, "OrangeHRM");
	}
	
	@Test(priority=1)
	public void verifyLoginPageSourceDoesNotContainError(){
		Assert.assertFalse(
				driver.getPageSource().contains("404") || 
				driver.getPageSource().contains("500"), "Verify Network issue");
		
	}
	
	@Test(priority=2)
	public void verifyLoginFieldPlaceholders(){
		
		}
	
	@Test(priority=3)
	public void verifyErrorMessageForInvalidLogin() throws InterruptedException{
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.name("username"));
		WebElement pwd=driver.findElement(By.name("password"));
		WebElement loginBtn=driver.findElement(
				By.xpath("//button[normalize-space(text()='Login')]"));
		username.sendKeys("Admin123");
		pwd.sendKeys("admin123");
		loginBtn.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[text()='Invalid credentials']")).isDisplayed();

	}

	@Test(priority=4)
	public void verifyPasswordFieldIsMasked(){
		WebElement pwd=driver.findElement(By.name("password"));
		String mask = pwd.getAttribute("type");
		Assert.assertEquals(mask, "password");
	
	}
	
	@Test(priority=5)
	public void verifyLoginWithValidCredentials() throws InterruptedException{	
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.name("username"));
		WebElement pwd=driver.findElement(By.name("password"));
		WebElement loginBtn=driver.findElement(
				By.xpath("//button[normalize-space(text()='Login')]"));
		username.sendKeys("Admin");
		pwd.sendKeys("admin123");
		loginBtn.click(); 
		Thread.sleep(5000);
		driver.getCurrentUrl().contentEquals("dashboard");
		
	}
	
	@Test(priority=6)
	public void verifyNewAdminMemberAddedSuccefully() throws InterruptedException{	
		
		WebElement admin = driver.findElement(By.xpath("//span[text()='Admin']"));
		admin.click();
		Thread.sleep(7000);
		WebElement addBtnAdmin = driver.findElement(By.xpath("//button[@fdprocessedid='ruebq']"));
		addBtnAdmin.click();
		Thread.sleep(5000);
	}
	

}
