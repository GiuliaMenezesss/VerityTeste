package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.AccesSelenium;

public class DadosPage extends AccesSelenium {
	
	private WebDriver driver;

    public DadosPage(WebDriver driver){
        this.driver = driver;
    }

    public static final By inputFechar = By.xpath("//*[@id='comp-lfhfnha7']/div");
    public static final By inputContato = By.xpath("//*[@id='comp-kevyodnk5']/a/div");
    public static final By inputTextoVamosConversar = By.xpath("//*[@id='comp-kwz6tqa9']/h1");

    public static final By inputNome = By.xpath("//*[@id='input_comp-kwz6tqej']");
  
    public static final By inputEmail = By.xpath("//*[@id='input_comp-kwz6tqf7']");

    public static final By inputTelefone = By.xpath("//*[@id='input_comp-kwz6tqfe']");

    public static final By inputDesafio = By.xpath("//*[@id='textarea_comp-kwz6tqfr']");

    public static final By inputTermo = By.xpath("//*[@id='comp-kwz6tqgp']");
    public static final By inputEnviar = By.xpath("//*[@id='comp-kwz6tqhd']/button");


    public void validacoesContato(){
        click(driver, inputFechar, 20);
        click(driver, inputContato, 20);

        click(driver, inputNome, 20);
        enviarDados(driver, inputNome, "Giulia de Menezes Fraga", 20);

        click(driver, inputEmail, 20);
        enviarDados(driver, inputEmail, "giulia.fraga01@gmail.com", 20);

        click(driver, inputTelefone, 20);
        enviarDados(driver, inputTelefone, "19983640251", 20);

        click(driver, inputDesafio, 20);
        enviarDados(driver, inputDesafio, "Meu desafio e desejo é voltar para a área de automação de testes para uma melhor experiencia aos desenvolvedores e usuários", 20);

        click(driver, inputTermo, 20);
        click(driver, inputEnviar, 20);
    }
}
