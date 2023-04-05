package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.AccesSelenium;

public class TextoPage extends AccesSelenium {

	private WebDriver driver;

	public TextoPage(WebDriver driver) {
		this.driver = driver;
	}

	public static final By inputFechar = By.xpath("//*[@id='comp-lfhfnha7']/div");
	
	public void fechar() {
		click(driver, inputFechar, 10);
	}
	
}
