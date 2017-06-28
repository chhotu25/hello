package javapslen;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chhotu\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  //Maximize Windows
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
       driver.get("http://demo.code5.org");
       Thread.sleep(2000);
       driver.findElement(By.id("logo")).click();
       Thread.sleep(2000);
       driver.navigate().back();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//*[@id='navigation']/ul/li)[1]")).click();
       Thread.sleep(2000);
       driver.navigate().back();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//*[@id='navigation']/ul/li)[2]")).click();
       Thread.sleep(2000);
       driver.navigate().back();
       Thread.sleep(2000);	 
       driver.findElement(By.xpath("(//*[@id='navigation']/ul/li)[3]")).click();
       Thread.sleep(2000);
       driver.navigate().back();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//*[@id='navigation']/ul/li)[4]")).click();
       Thread.sleep(2000);
       driver.navigate().back();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//*[@id='navigation']/ul/li)[5]")).click();
       Thread.sleep(2000);
       driver.navigate().back();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//*[@id='navigation']/ul/li)[6]")).click();
       Thread.sleep(2000);
       driver.navigate().back();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@class='right-top']")).click();
       Thread.sleep(2000);
       Actions a=new Actions(driver);
       a.sendKeys(Keys.ENTER).build().perform();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@href='impressum']")).click();
       Thread.sleep(2000);
       driver.navigate().back();
       Thread.sleep(2000);
       driver.close();
       Thread.sleep(2000);
	}

}
