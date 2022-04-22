package pages;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import elementos.Elementos;
import metodos.Browser;
import metodos.Metodos;

public class Executa {
	Metodos metodos = new Metodos();
	Browser browser = new Browser();
	Elementos el = new Elementos();

	@Before
	public void setUp() throws Exception {
		metodos.abrirNavegador("http://sampleapp.tricentis.com/");
	}

	@After
	public void tearDown() throws Exception {
		metodos.click(el.getCamper());
		metodos.click(el.getMake());
		metodos.click(el.getCarro());
		metodos.click(el.getEp());
		metodos.escrever(By.id("engineperformance"), "220");
		metodos.escrever(By.id("dateofmanufacture"), "12/03/2015");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
