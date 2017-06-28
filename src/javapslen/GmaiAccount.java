package javapslen;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GmaiAccount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chhotu\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  //Maximize Windows
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		driver.get("https://accounts.google.com/SignUp");
		Thread.sleep(5000);
		//driver.findElement(By.partialLinkText("Create account")).click();
		driver.findElement(By.name("FirstName")).sendKeys("abjabdul");
		driver.findElement(By.name("LastName")).sendKeys("kalam");
		driver.findElement(By.name("GmailAddress")).sendKeys("aminfo.virus");
		driver.findElement(By.name("Passwd")).sendKeys("74158649");
		driver.findElement(By.name("PasswdAgain")).sendKeys("74158649");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("//*[@title='Birthday']"));
		Actions a=new Actions(driver);
		a.click(e).build().perform();
		Thread.sleep(5000);
		a.sendKeys("o").build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.name("BirthDay")).sendKeys("25");
		driver.findElement(By.name("BirthYear")).sendKeys("1993");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@title='Gender']")).click();
          Thread.sleep(5000);
          a.sendKeys("ma").build().perform();
          Thread.sleep(5000);
          a.sendKeys(Keys.ENTER).build().perform();
          Thread.sleep(5000);
      	driver.findElement(By.name("RecoveryPhoneNumber")).sendKeys("7415864940");
      	 Thread.sleep(2000);
        driver.findElement(By.name("RecoveryEmailAddress")).sendKeys("amwebtech.virus@gmail.com");
        WebElement b=driver.findElement(By.xpath("//*[@id='CountryCode']"));
        a.click(b).build().perform();
        Thread.sleep(5000);
        a.sendKeys("India (भारत)").build().perform();
        Thread.sleep(5000);
        driver.findElement(By.name("submitbutton")).click();
        
          Thread.sleep(5000);
		driver.close();
	}

}
