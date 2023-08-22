package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {
	
	public static WebDriver driver;
	
	public void abrirNavegador(String site) {
		try {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(site);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.err.println("---------- erro ao abrir navegador ---------- " + e.getMessage());
			System.err.println("---------- causa do erro ----------" + e.getCause());
		} 
	}
}
