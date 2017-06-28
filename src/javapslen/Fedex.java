package javapslen;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fedex {

	public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","F:\\chhotu\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	  //Maximize Windows
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  //get Url
	  driver.get("https://www.fedex.com/apps/fedextrack/?action=track&tracknumbers=732021896479&locale=en_US&cntry_code=us");
	  Thread.sleep(5000);
	
	
	  String FN1 = driver.findElement(By.xpath("(//*[@class='address_cscp'])[1]")).getText();
	  FN1 = FN1.replace(",", "");
	  
	  String FileN = driver.findElement(By.xpath("//*[@class='snapshotController_date orig']")).getText();
	 
	  String s1 = FileN.replace("/", "-");
	 //create folder
	  File f= new File("C:\\Users\\AL Moin Webtech\\Desktop\\"+FN1);
	  f.mkdirs();
	  Thread.sleep(10000);
	 //click on print
	  driver.findElement(By.xpath("(//*[@class='help_print_link'])[2]")).click();
	  Thread.sleep(2000);
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_D);
	  r.keyRelease(KeyEvent.VK_D);
	  Thread.sleep(2000);
	
	  
	  r.keyPress(KeyEvent.VK_P);
    r.keyRelease(KeyEvent.VK_P);
	  
	  
	  r.keyPress(KeyEvent.VK_I);
	  r.keyRelease(KeyEvent.VK_I);
	  
	  r.keyPress(KeyEvent.VK_C);
	  r.keyRelease(KeyEvent.VK_C);
	
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	
	  Thread.sleep(2000);

	  StringSelection s2 =new StringSelection("C:\\Users\\AL Moin Webtech\\Desktop\\"+FN1+"\\"+s1);
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2,null);
	  Thread.sleep(5000);
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_V);
	  r.keyRelease(KeyEvent.VK_V);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  Thread.sleep(2000);
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_S);
	  r.keyRelease(KeyEvent.VK_S);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  Thread.sleep(2000);
	  
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(3000);
	  	  
	  
	  //close windows
	   r.keyPress(KeyEvent.VK_ALT);
	  r.keyPress(KeyEvent.VK_F4);
	  r.keyRelease(KeyEvent.VK_F4);
	  
	  r.keyRelease(KeyEvent.VK_ALT);
    Thread.sleep(5000);
  //close site  
   driver.quit();
   Thread.sleep(5000);

	  
	}

	

}
