package pages;

import elementos.Elementos;
import metodos.Metodos;

public class EiPage {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	public void eID(String Fname, String Lname, String Birth, String Street, String Country, String Zip, String City,
			String Occ) {

		metodos.escrever(el.getFname(), Fname);
		metodos.escrever(el.getLname(), Lname);
		metodos.escrever(el.getNiver(), Birth);
		metodos.click(el.getGender());
		metodos.escrever(el.getStreet(), Street);
		metodos.escrever(el.getCountry(), Country);
		metodos.escrever(el.getZip(), Zip);
		metodos.escrever(el.getCity(), City);
		metodos.escrever(el.getOcc(), Occ);
		metodos.click(el.getHobb());

	}

}
