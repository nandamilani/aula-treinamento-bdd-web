package curso.treinamento.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class RegistroSteps {
	
	WebDriver driver;

	
	@Dado("^que eu esteja na tela de Registro$")
	public void queEuEstejaNaTelaDeRegistro() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		Assert.assertTrue("Página'Register' NÃO apresentada com sucesso.", driver.findElement(By.xpath("//img[@src='/images/masts/mast_register.gif']")).isDisplayed());
	
	
	}

	@Quando("^faço o preenchimento das informações da tela de Register$")
	public void façoOPreenchimentoDasInformaçõesDaTelaDeRegister(DataTable dataTable) throws Throwable {
	    
		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
		
		driver.findElement(By.name("firstName")).sendKeys(list.get(0).get("First Name"));
	}

	@Então("^sou registrado com sucesso$")
	public void souRegistradoComSucesso() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
