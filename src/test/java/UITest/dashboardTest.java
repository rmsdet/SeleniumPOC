package UITest;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import BasePackage.BaseTest;
public class dashboardTest extends BaseTest {

	    WebDriver driver;
		// Login to Application 
		@Test
		public void verifyloginissuccessful() throws InterruptedException {
			WebElement userInput=driver.findElement(By.id("user-name"));
			WebElement pwdInput = driver.findElement(By.id("password"));
			WebElement loginBtn = driver.findElement(By.name("login-button"));
			
			userInput.sendKeys("standard_user");
			pwdInput.sendKeys("secret_sauce");
			loginBtn.click();
			
			// Verify successfully logged in
			
			String title=driver.getTitle();
			Assert.assertEquals(title, "https://www.saucedemo.com/inventory.html");
		}
		
		@Test(priority =1)
		public void verifyProductsAreDisplayedOnDashboard() {
			List<WebElement> items=driver.findElements(By.xpath("//div[@id='inventory_container']//div[@class='inventory_list']//div[@class='inventory_item']"));
			if(items.size()==6) {
				System.out.print("Products are are available in DashBoard");
				
			}
			// Step 2: Validate each product details
		    for (WebElement item : items) {

		        
		        WebElement productName = item.findElement(By.xpath(".//div[@class='inventory_item_name ']"));
		        WebElement productPrice = item.findElement(By.xpath(".//div[@class='inventory_item_price ']"));
		        WebElement addToCartBtn = item.findElement(By.xpath(".//button[contains(@id,'add-to-cart')]"));

		        // Validation
		        if (productName.isDisplayed() && productPrice.isDisplayed() && addToCartBtn.isDisplayed()) {
		            System.out.println("Product Verified: " + productName.getText());
		        } else {
		            System.out.println("Product validation failed");
		        }
			
		}
		     
		
		}
		 @Test(priority =2)
		    public void verifyAddToCartUpdatesCartBadge() {

		        WebElement firstProduct = driver.findElements(By.xpath("//div[@class='inventory_item_name ']")).get(0);
		        WebElement addToCart = firstProduct.findElement(By.xpath(".//button[contains(@id,'add-to-cart')]"));
		        addToCart.click();

		        
		        WebElement badge = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));	        
		        String badgeCount = badge.getText();
		        Assert.assertEquals(badgeCount, "1", "Cart badge count is incorrect");

		        //  Verify button text changed to "Remove"
		        WebElement removeBtn = firstProduct.findElement(By.xpath(".//button[contains(@id,'remove')]"));
		        Assert.assertEquals(removeBtn.getText(), "Remove", "Button did not change to Remove");

		        System.out.println("Add to Cart functionality verified successfully");
		    }
		 
		 @Test(priority = 3)
		 public void verifyUserNavigatesToProductDetailsPage() {

		     //Capture first product details from dashboard
		     WebElement firstProduct = driver.findElements(By.xpath("//div[@class='inventory_item']")).get(0);
		     String expectedName = firstProduct.findElement(By.xpath(".//div[@class='inventory_item_name ']")).getText();
		     String expectedPrice = firstProduct.findElement(By.xpath(".//div[@class='inventory_item_price']")).getText();

		     // Click on product name
		     firstProduct.findElement(By.xpath(".//div[@class='inventory_item_name ']")).click();

		     // Validate navigation Product Details Page

		     // Product Name
		     WebElement productName = driver.findElement(By.xpath("//div[@class='inventory_details_name ']"));
		     Assert.assertEquals(productName.getText(), expectedName, "Product name mismatch");

		     // Product Description
		     WebElement productDesc = driver.findElement(By.xpath("//div[@data-test='inventory-item-desc']"));
		     Assert.assertTrue(productDesc.isDisplayed(), "Product description not displayed");

		     // Product Price
		     WebElement productPrice = driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
		     Assert.assertEquals(productPrice.getText(), expectedPrice, "Product price mismatch");

		     // Back Button
		     WebElement backBtn = driver.findElement(By.id("back-to-products"));
		     Assert.assertTrue(backBtn.isDisplayed(), "Back button not displayed");

		     System.out.println("User successfully navigated to Product Details Page");
		 }

	}


