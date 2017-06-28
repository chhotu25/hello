package javapslen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chhotu\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  //Maximize Windows
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.get("https://accounts.google.com");
		  driver.findElement(By.name("identifier")).sendKeys("amw.chhotusingh@gmail.com");
		  Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='RveJvd snByac']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.name("password")).sendKeys("am_chhotu");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@class='RveJvd snByac']")).click();
		  Thread.sleep(2000);

	}

}
