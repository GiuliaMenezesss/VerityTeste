package TestCases;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Page.TextoPage;
import Utils.GerenciamentoDriver;

public class Cenario1 {
	private WebDriver driver;
	GerenciamentoDriver gerenciamentoDriver;
	TextoPage textoPage;

	@Before
	public void setup() {
		gerenciamentoDriver = new GerenciamentoDriver();
		driver = GerenciamentoDriver.browser("chrome");
		textoPage = new TextoPage(driver);
	}

	@Test
	public void teste() {
		driver.get("https://www.verity.com.br/");
		textoPage.fechar();
		assertTrue("Conteúdo diferente do esperado", driver.getTitle().contentEquals("Culture e Tech"));
		assertTrue("Conteúdo diferente do esperado", driver.getTitle().contentEquals("Nossas soluções"));
	}

	@After
	public void fim() {
		driver.quit();
	}
}