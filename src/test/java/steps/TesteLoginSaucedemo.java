package steps;

import browsers.Browsers;
import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class TesteLoginSaucedemo {
	
	Browsers browser = new Browsers();
	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	@Given("que esteja em {string}")
	public void queEstejaEm(String site) {
		browser.abrirNavegador(site);

	}

	@When("preencher os campos username e password corretamente")
	public void preencherOsCamposUsernameEPasswordCorretamente() {
		metodo.escrever(elemento.userName, "standard_user");
		metodo.escrever(elemento.password, "secret_sauce");

	}

	@Then("valido o login com sucesso")
	public void validoOLoginComSucesso() {
		metodo.clicar(elemento.btnLogin);
		//metodo.evidencia("Login realizado com sucesso");
		metodo.fecharNavegador();

	}

	@When("preencher os campos username e password da conta com problema")
	public void preencherOsCamposUsernameEPasswordDaContaComProblema() {
		metodo.escrever(elemento.userName, "problem_user");
		metodo.escrever(elemento.password, "secret_sauce");
		
	}

	@Then("valido o login na pagina com problema")
	public void validoOLoginNaPaginaComProblema() {
		metodo.clicar(elemento.btnLogin);
		//metodo.evidencia("Login realizado, pagina com problema");
		metodo.fecharNavegador();
		
	}

	@When("preencher username {string}")
	public void preencherUsername(String string) {
	    metodo.escrever(elemento.userName, string);
		
	}
	
	@When("preencher password {string}")
	public void preencherPassword(String string) {
		metodo.escrever(elemento.password, string);
		
	}
	
	@Then("valido a {string}")
	public void validoA(String string) {
		metodo.clicar(elemento.btnLogin);
		metodo.validarMsgErro(string);
		//metodo.evidencia("validando mensagem de erro");
		metodo.fecharNavegador();
		
	}




}
