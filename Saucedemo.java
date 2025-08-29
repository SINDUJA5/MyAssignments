package sauce;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Saucedemo {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	
		List<WebElement> items = driver.findElements(By.className("inventory_item"));
		driver.findElement(By.className("inventory_item_name")).click();
		driver.findElement(By.cssSelector("button.btn_primary.btn_inventory")).click();
		driver.findElement(By.className("shopping_cart_link")).click();
	
		driver.findElement(By.className("btn_action checkout_button")).click();
		driver.findElement(By.id("first-name")).sendKeys("sinduja",Keys.ENTER);
		driver.findElement(By.id("last-name")).sendKeys("Ravi",Keys.ENTER);
		driver.findElement(By.id("postal-code")).sendKeys("600785",Keys.ENTER);
		driver.findElement(By.id("CONTINUE")).click();
		System.out.print("inventory_details_price");
		 List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		    for(int i=0; i<list.size(); i++) {
		    	String text = list.get(i).getText();
		    	System.out.println("Price Details = "+text);
		    }
		    File source = driver.getScreenshotAs(OutputType.FILE);
		    File destination = new File("./screenShot/image.png");
		    FileUtils.copyFile(source,destination);
		    
		    System.out.println("\nScreenShot saved at = "+destination.getAbsolutePath());
		    
		    driver.quit();
		


	}

}
