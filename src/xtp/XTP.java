/*
 * @author Tamseel Ahmed
 * 
 * 
 * 
 */
package xtp;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

public class XTP {
	
	@Test

	public static void main(String[] args) throws InterruptedException, AWTException {
// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://xtp-stage.corp.xerox.com/xtp-stage/");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.findElement(By.id("login")).click();

		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='S3 User ID:'])[1]/following::input[1]"))
				.clear();

		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='S3 User ID:'])[1]/following::input[1]"))
				.sendKeys("demo");

		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Determine your S3 login'])[1]/following::button[1]"))
				.click();

		Thread.sleep(8000);

		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Support'])[1]/following::img[3]"))
				.click();

		driver.findElement(By.id("2")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.linkText("International")).click();

		Thread.sleep(5000);

		driver.findElement(By.linkText("Royalty")).click();

		Thread.sleep(5000);

		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Royalty'])[1]/following::a[1]"))
				.click();

		Thread.sleep(8000);

		driver.findElement(By.id("processNamesFilter")).click();

		Thread.sleep(3000);

		new Select(driver.findElement(By.id("processNamesFilter"))).selectByVisibleText("Royalty Calculation");

		Thread.sleep(5000);

		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Process Name'])[1]/preceding::img[1]"))
				.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("upload")).click();

		Robot r = new Robot();

		Thread.sleep(2000);

		for (int i = 1; i <= 8; i++) {
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			System.out.println("Tabbed " + i + " time.");
		}

		Thread.sleep(2000);

		for (int i = 1; i <= 10; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			System.out.println("Down " + i + " time.");
		}

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_TAB);

		r.keyRelease(KeyEvent.VK_TAB);

		Thread.sleep(2000);

		for (int i = 1; i <= 5; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			System.out.println("Down " + i + " time.");
		}

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_RIGHT);

		r.keyRelease(KeyEvent.VK_RIGHT);

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		for (int i = 1; i <= 3; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			System.out.println("Down " + i + " time.");
		}

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		for (int i = 1; i <= 5; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			System.out.println("Down " + i + " time.");
		}

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		for (int i = 1; i <= 6; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			System.out.println("Down " + i + " time.");
		}

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Drop files or click to select your files'])[1]/following::button[1]"))
				.click();

		driver.findElement(By.linkText("2018")).click();

		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[1]/following::img[1]"))
				.click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Feb")).click();

		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[2]/following::img[1]"))
				.click();

		driver.findElement(By.linkText("DEFAULT")).click();

		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[3]/following::button[1]")).click();
		
		Thread.sleep(20000);

	driver.findElement(By.xpath("((.//*[normalize-space(text()) and normalize-space(.)='AutoFill'])[1]/following::img[1]")).click();
		
		
	}

}