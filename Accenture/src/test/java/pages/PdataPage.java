package pages;

import elementos.Elementos;
import metodos.Metodos;

public class PdataPage {
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	public void pData(String Sdate, String Is, String Di) {
		
		metodos.escrever(el.Sdate, Sdate);
		metodos.escrever(el.Is, Is);
		metodos.escrever(el.Di, Di);
		metodos.click(el.Op);
		
	}
	
	

}
