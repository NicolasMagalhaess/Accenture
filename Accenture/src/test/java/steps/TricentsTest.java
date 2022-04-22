package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Browser;
import metodos.Metodos;
import pages.CamperPage;
import pages.EiPage;
import pages.HP;
import pages.PdataPage;
import pages.PoptionPage;

public class TricentsTest {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	Browser browser = new Browser();
	HP HP = new HP();
	CamperPage Cpage = new CamperPage();
	EiPage Epage = new EiPage();
	PdataPage Pdata = new PdataPage();
	PoptionPage Pop = new PoptionPage();

	@Given("eu acesse o site {string}")
	public void eu_acesse_o_site(String site) {
		browser.abrirNavegador(site);

	}

	@Given("clico no menu {string}")
	public void clico_no_menu(String menu) {
		HP.acessoMenu(menu);

	}

	@When("preencho Enter Vehicle Data")
	public void preencho_enter_vehicle_data() {
		Cpage.eVD("BMW", "220", "12/15/1978", "4", "Diesel", "86", "1300", "80000", "cnhVenc1d4", "150");
		metodos.click(el.getNext1());

	}

	@When("preencho Enter Insurant Data")
	public void preencho_enter_insurant_data() {
		Epage.eID("John", "Walker", "10/03/1998", "Queen St", "Australia", "4404", "City of Melbourne", "Farm");
		metodos.click(el.getNext2());

	}

	@When("preencho Enter Product Data")
	public void preencho_enter_product_data() {
		Pdata.pData("10/06/2022", "5.000.000,00", "full coverage");
		metodos.click(el.Next3);

	}

	@When("preencho Select Price Option")
	public void preencho_select_price_option() {
		Pop.Pop();
		metodos.pausa();
		//metodos.click(el.Dow);
		metodos.click(el.Next4);

	}

	@When("clico Send Quote")
	public void clico_send_quote() {

	}

	@Then("envio uma proposta")
	public void envio_uma_proposta() {

	}

}
