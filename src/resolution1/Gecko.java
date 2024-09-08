package resolution1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Gecko {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("Webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Resolution- 1920*1080
		
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfle = ts.getScreenshotAs(OutputType.FILE);
		File dstfle = new File("D:\\gecko(1920-1080)\\07-10.38pm.png");
		Files.copy(srcfle, dstfle);
		
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		driver.findElement(By.xpath("//a[contains(text(),'https://www.getcalley.com/calley-lifetime-offer/')]")).click();
		TakesScreenshot tc = (TakesScreenshot)driver;
		File surcfle = tc.getScreenshotAs(OutputType.FILE);
		File destfle = new File("D:\\gecko(1920-1080)\\07-10.39pm.png");
		Files.copy(surcfle, destfle);

		driver.get("https://www.getcalley.com/page-sitemap.xml");
		driver.findElement(By.xpath("//a[contains(text(),'https://www.getcalley.com/see-a-demo/')]")).click();
		TakesScreenshot tr = (TakesScreenshot)driver;
		File srfle = tr.getScreenshotAs(OutputType.FILE);
		File dtfle = new File("D:\\gecko(1920-1080)\\07-10.40pm.png");
		Files.copy(srfle, dtfle);
		
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		driver.findElement(By.xpath("//a[contains(text(),'https://www.getcalley.com/calley-teams-features/')]")).click();
		TakesScreenshot ta = (TakesScreenshot)driver;
		File srcefle = ta.getScreenshotAs(OutputType.FILE);
		File desfle = new File("D:\\gecko(1920-1080)\\07-10.41pm.png");
		Files.copy(srcefle, desfle);
		
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		driver.findElement(By.xpath("//a[contains(text(),'https://www.getcalley.com/calley-pro-features/')]")).click();
		TakesScreenshot tk = (TakesScreenshot)driver;
		File sfle = tk.getScreenshotAs(OutputType.FILE);
		File dfle = new File("D:\\gecko(1920-1080)\\07-10.42pm.png");
		Files.copy(sfle, dfle);
	}

}
