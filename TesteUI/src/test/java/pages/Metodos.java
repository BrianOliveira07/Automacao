package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String passo, String site) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
		
	}

	public void clicar(By element) {

		driver.findElement(element).click();

	}

	public void descerPagina(By element) {

		WebElement rolarPagina = driver.findElement(element);
		new Actions(driver).moveToElement(rolarPagina).perform();

	}

	public void escrever(By element, String texto) {

		driver.findElement(element).sendKeys(texto);

	}

	public void validarTexto(String textoEsperado, By element) {

		WebElement elemento = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(driver -> driver.findElement(element));
		assertEquals(elemento.getText(), textoEsperado);

	}

	public void validarUrl(String site) {

		String url = driver.getCurrentUrl();
		assertEquals(site, url);

	}

	public void print(String nome) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(srcFile, destFile);

	}

	public void tempo(int tempo) throws InterruptedException {

		Thread.sleep(tempo);

	}

	public void fecharNavegador(String passo) {

		driver.quit();

	}

}
