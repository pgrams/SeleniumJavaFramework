package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) {
		
		TE_Search();

	}


	public static void TE_Search() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\driver\\chrome\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumNEW\\seleniumjavaframework\\driver\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		// Opening the TE.com site
		
		driver.get("https://te.com");
		
		//Enter text in the search box 
		
		driver.findElement(By.id("search-input")).sendKeys("connectors");
		
		//Click search 
		
		driver.findElement(By.id("search-input")).sendKeys(Keys.RETURN);
		
		
		/*try {
			driver.wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		*/
		driver.close();
		
		System.out.println("Test completed successfully");
	}

}
