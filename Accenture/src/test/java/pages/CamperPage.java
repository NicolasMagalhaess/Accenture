package pages;

import elementos.Elementos;
import metodos.Metodos;

public class CamperPage {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	public void eVD(String make, String ep, String dom, String nos,  String fuel, String pay, String total,
			String list, String plate, String annual) {
		metodos.escrever(el.getMake(), make);
		metodos.escrever(el.getEp(), ep);
		metodos.escrever(el.getData(), dom);
		metodos.escrever(el.getNos(), nos);
		metodos.click(el.getRhd());
		metodos.escrever(el.getFuel(), fuel);
		metodos.escrever(el.getPayload(), pay);
		metodos.escrever(el.getTotal(), total);
		metodos.escrever(el.getPrice(), list);
		metodos.escrever(el.getLpn(), plate);
		metodos.escrever(el.getMi(), annual);
		metodos.click(el.getNext1());

	}

}
