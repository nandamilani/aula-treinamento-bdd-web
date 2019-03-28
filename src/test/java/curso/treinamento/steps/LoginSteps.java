package curso.treinamento.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginSteps {
	
	WebDriver driver;
	
	@Dado("^que eu esteja na tela de login$")
	public void queEuEstejaNaTelaDeLogin() {
		
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
	}

	@Quando("^faço login com o usuário \"([^\"]*)\" e senha \"([^\"]*)\" $")
	public void façoLoginComOUsuárioESenha(String user, String pass)  {
	
		driver.findElement(By.name("userName")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
	}

	@Então("^sou autenticado com sucesso $")
	public void souAutenticadoComSucesso()  {
	  
	}

}
