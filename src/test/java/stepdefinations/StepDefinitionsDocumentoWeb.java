package stepdefinations;

import clasesLocators.CreacionDocumento;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static clasesLocators.CreacionDocumento.driver;

public class StepDefinitionsDocumentoWeb {
	
	
	CreacionDocumento creacionDocumento;
	
	@SuppressWarnings("static-access")
	@Given("^Redireccion a la vista del buscador de Google \"([^\"]*)\"$")
	public void redireccion_a_la_vista_del_buscador_de_Google(String arg1) throws Throwable {
		creacionDocumento.redireccion_a_la_vista_del_buscador_de_Google(arg1);
		driver.quit();
	}

	@SuppressWarnings("static-access")
	@Given("^Ir al menu de Google Apps$")
	public void ir_al_menu_de_Google_Apps() throws Throwable {
	   creacionDocumento.ir_al_menu_de_Google_Apps();		
	}

	@SuppressWarnings("static-access")
	@Given("^Abrir Drive$")
	public void abrir_Drive() throws Throwable {
	   creacionDocumento.abrir_Drive();
		//driver.quit();
	}

	@SuppressWarnings("static-access")
	@When("^Acceder a la cuenta de Google con usuario \"([^\"]*)\" y la clave \"([^\"]*)\"$")
	public void acceder_a_la_cuenta_de_Google_con_usuario_y_la_clave(String correo, String clave) throws Throwable {
	   	creacionDocumento.acceder_a_la_cuenta_de_Google_con_usuario_y_la_clave(correo, clave);		
	}

	@SuppressWarnings("static-access")
	@When("^Crear un documento$")
	public void crear_un_documento() throws Throwable {
		creacionDocumento.crear_un_documento();

	}

	@SuppressWarnings("static-access")
	@Then("^Nombrar al documento \"([^\"]*)\"$")
	public void nombrar_al_documento(String arg1) throws Throwable {
	   
		creacionDocumento.nombrar_al_documento(arg1);
	}

}
