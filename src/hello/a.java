package hello;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

class Webdriver{

	public Object navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement findElement(By id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		//System.setProperty("webdriver.ie.driver", "D:\\Selenium\\selenium-server\\driver\\iedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		driver.findElement(By.id("kw")).sendKeys("12306");
		driver.findElement(By.id("su")).click();
		driver.close();
	}

}