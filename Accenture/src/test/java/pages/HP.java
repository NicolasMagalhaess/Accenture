package pages;

import elementos.Elementos;
import metodos.Browser;
import metodos.Metodos;

public class HP {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	Browser browser = new Browser();

	public void acessoMenu(String menu) {

		if (menu.equalsIgnoreCase("Automobile")) {
			metodos.click(el.getAutomobile());
		} else if (menu.equalsIgnoreCase("Truck")) {
			metodos.click(el.getTruck());
		} else if (menu.equalsIgnoreCase("MotorCycle")) {
			metodos.click(el.getMcycle());
		} else if (menu.equalsIgnoreCase("Camper")) {
			metodos.click(el.getCamper());
		} else {
			System.out.println("Menu inválido");
		}

	}

}
