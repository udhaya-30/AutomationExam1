package SeleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Udhaya");
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("934567894");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Udaya89");
	    WebElement date = driver.findElement(By.id("day"));
         Select date1 =new Select(date);
	    
	    date1.selectByValue("20");
	    WebElement month = driver.findElement(By.id("day"));
        Select month1 =new Select(month);
	    
	    month1.selectByValue("1");
	    WebElement year = driver.findElement(By.id("year"));
        Select year1 =new Select(year);
	    
	    year1.selectByValue("2001");
	    
	    driver.findElement(By.xpath("//label[text()='Male']")).click();
	    
	    
	    
	   
	    
	    driver.close();
//		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		driver.findElement(By.className("decorativeSubmit")).click();
//		
		
	}
}
