package task2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class FunctionalTesting {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.dealsdray.com/");
		driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//button[@align='right']")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\1\\Downloads\\demo-data.xlsx");
		driver.findElement(By.xpath("//div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/button[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/button[1]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfle = ts.getScreenshotAs(OutputType.FILE);
		File dstfle = new File("D:\\Task2\\screenshot.png");
		Files.copy(srcfle, dstfle);
		
		
	}

}
