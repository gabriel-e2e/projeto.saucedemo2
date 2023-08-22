package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browsers {
	
	public static WebDriver driver;
	
	public void abrirNavegador(String site) {
		try{
			
			System.setProperty("webdriver.http.factory","jdk-http-client");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			driver = new ChromeDriver();
			driver.get(site);
			
			driver.manage().window().maximize();
		}catch (Exception e) {
			System.err.println("---------- erro ao abrir navegador ---------- " + e.getMessage());
			System.err.println("---------- causa do erro ----------" + e.getCause());
		} 
		
	}

}
