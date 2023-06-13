package selenium;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
public class Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
	}

}
