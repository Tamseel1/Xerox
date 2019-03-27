package xtp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Otp {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Chrome driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://tspsc.gov.in/TSPSCOTR2015/oneTimeRegistration.tspsc");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.id("aadhdarNo")).sendKeys("123456789101");

		Thread.sleep(2000);

		driver.findElement(By.id("aadhdarName")).sendKeys("Tamseel Ahmed");

		Thread.sleep(2000);

		driver.findElement(By.id("candidateName")).sendKeys("Tamseel Ahmed");

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();

		Thread.sleep(2000);

		WebElement tamseel = driver.findElement(By.id("dob"));

		tamseel.sendKeys("27/12/2000");

		driver.findElement(By.id("dob")).sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		// driver.findElement(By.id("nativeDistrict")).click();

		Select drp = new Select(driver.findElement(By.id("nativeDistrict")));

		drp.selectByVisibleText("Hyderabad");

		Thread.sleep(3000);

		Select mnd = new Select(driver.findElement(By.id("nativeMandal")));

		mnd.selectByVisibleText("Charminar");

		Thread.sleep(3000);

		driver.findElement(By.id("nativeVillage")).sendKeys("Telengana");

		Thread.sleep(3000);

		Select com = new Select(driver.findElement(By.id("community")));

		com.selectByVisibleText("BC-E");

		Thread.sleep(3000);

		driver.findElement(By.id("creamyLayer")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"fatherName\"]")).sendKeys("Maqsood Khaleel Ahmed");

		Thread.sleep(3000);

		driver.findElement(By.name("dyna(motherName)")).sendKeys("Durdana Yasmeen");

		Thread.sleep(3000);

		Select mt = new Select(driver.findElement(By.id("motherTongue")));

		mt.selectByVisibleText("Urdu");

		Thread.sleep(3000);

		Select rgn = new Select(driver.findElement(By.id("religion")));

		rgn.selectByVisibleText("Muslim");

		Thread.sleep(2000);

		driver.findElement(By.id("identificationMark1")).sendKeys("A mole on left leg");

		Thread.sleep(3000);

		driver.findElement(By.id("identificationMark2")).sendKeys("A mole on fore finger of right hand");

		Thread.sleep(3000);

		Select ph = new Select(driver.findElement(By.xpath("(input//*[@id='isPh']")));

		ph.selectByValue("N");
		
		Thread.sleep(3000);

		driver.close();

	}

}