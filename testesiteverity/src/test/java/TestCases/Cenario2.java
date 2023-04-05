package TestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Page.DadosPage;
import Page.TextoPage;
import Utils.GerenciamentoDriver;

public class Cenario2 {
	private WebDriver driver;
	GerenciamentoDriver gerenciamentoDriver;
	DadosPage dadosPage;

	@Before
	public void setup() {
		gerenciamentoDriver = new GerenciamentoDriver();
		driver = GerenciamentoDriver.browser("chrome");
		dadosPage = new DadosPage(driver);
	}

	@Test
	public void teste() {
		driver.get("https://www.verity.com.br/");
		dadosPage.validacoesContato();
	}

	@After
	public void fim() {
		driver.quit();
	}
}