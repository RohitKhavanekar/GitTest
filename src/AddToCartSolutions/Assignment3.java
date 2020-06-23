package AddToCartSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Rohit_Folder\\MAXIMUS\\Selenium Driver NEVER DELETE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, 5);////****************EXPLICIT WAIT*****************STEP 1		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.xpath("//a[text()=\"Click to load get data via Ajax!\"]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#results")));
		System.out.println(driver.findElement(By.cssSelector("div#results")).getText());
		

	}

}
