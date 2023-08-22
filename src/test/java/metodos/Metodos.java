package metodos;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import browsers.Browsers;

public class Metodos extends Browsers {

	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("******N�o foi poss�vel escrever******");
			System.out.println("******Causa do erro******" + e.getCause());
		}
	}

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("******N�o foi poss�vel clicar******");
			System.out.println("******Causa do erro******" + e.getCause());
		}
	}

	public void validarMsgErro(String texto) {
		String msg = driver.toString();
		assertTrue(msg.contains(msg));
	}
	
	

	/*public void evidencia(String nomeTeste) {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" + nomeTeste + ".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Erro ao tirar evid�ncia");
		}
	}
*/
	public void fecharNavegador() {
		driver.quit();

	}

}
