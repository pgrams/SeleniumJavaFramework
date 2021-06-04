//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SampleTest {

	public static void main(String[] args) {
		//String projectPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.gecko.driver", projectPath + "\\driver\\gecko\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", "E:\\SeleniumNEW\\seleniumjavaframework\\driver\\gecko\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://te.com");
		//driver.close();
		//String projectPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", projectPath + "\\driver\\chrome\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "E:\\SeleniumNEW\\seleniumjavaframework\\driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://te.com");
		driver.findElement(By.id("search-input")).sendKeys("click here to search");
		//driver.findElements(By.xpath("//input"));
		List<WebElement> Test= driver.findElements(By.xpath("//input"));
		int count = Test.size();
		System.out.println(count);
		driver.close();

	}
}
