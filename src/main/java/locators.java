import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\MY\\Desktop\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
	  /*driver.findElement(By.id("inputUsername")).sendKeys("pallavi");
	    driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");	    
	   // driver.findElement(By.className("submit")).click();
	   //                 Thread.sleep(3000);
	   //driver.close();
	 /* driver.findElement(By.linkText("Forgot your password?")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("das");
	   driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("hari");
	   driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("pallavi");
	   driver.findElement(By.className("reset-pwd-btn")).click();
	   driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
	   
	   */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.id("inputUsername")).sendKeys("pallavi");
		 driver.findElement(By.name("inputPassword")).sendKeys("rahil");
		 driver.findElement(By.className("submit")).click();
		Thread.sleep(2000);
		// String errormesg=driver.findElement(By.cssSelector("p.error")).getText();
		String errormesg=driver.findElement(By.xpath("//p[@class='error']")).getText();
	 
		 System.out.println(errormesg);
	}

	private static void witherror() {
		// TODO Auto-generated method stub
		
	}

}
