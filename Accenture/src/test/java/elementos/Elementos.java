package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By Automobile = By.id("nav_automobile");
	private By Truck = By.id("nav_truck");
	private By Mcycle = By.id("nav_motorcycle");
	private By Camper = By.id("nav_camper");
	private By Make = By.id("make");
	private By Carro = By.xpath("//*[@id=\"make\"]/option[3]");
	private By Ep = By.id("engineperformance");
	private By Dom = By.id("opendateofmanufacturecalender");
	private By Data = By.id("dateofmanufacture");
	private By Nos = By.id("numberofseats");
	private By Number = By.xpath("//*[@id=\"numberofseats\"]/option[6]");
	private By Rhd = By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[5]/p/label[2]/span");
	private By Fuel = By.id("fuel");
	private By Type = By.xpath("//*[@id=\"fuel\"]/option[3]");
	private By Payload = By.id("payload");
	private By Total = By.id("totalweight");
	private By Price = By.id("listprice");
	private By Lpn = By.id("licenseplatenumber");
	private By Mi = By.id("annualmileage");
	private By Next1 = By.id("nextenterinsurantdata");
	private By Fname = By.id("firstname");
	private By Lname = By.id("lastname");
	private By Birth = By.name("Open Date of Birth Calender");
	private By Niver = By.id("birthdate");
	private By Gender = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");
	private By Street = By.id("streetaddress");
	private By Country = By.id("country");
	private By Pais = By.xpath("//*[@id=\"country\"]/option[58]");
	private By Zip = By.id("zipcode");
	private By City = By.id("city");
	private By Occ = By.id("occupation");
	private By Job = By.xpath("//*[@id=\"occupation\"]/option[3]");
	private By Hobb = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]");
	private By Next2 = By.id("nextenterproductdata");
	public By Sdate = By.id("startdate");
	public By Is = By.id("insurancesum");
	public By Di = By.id("damageinsurance");
	public By Op = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[1]/span");
	public By Next3 = By.id("nextselectpriceoption");
	public By Ulti = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span");
	public By Dow = By.xpath("//*[@id=\"downloadquote\"]/span");
	public By Next4 = By.id("nextsendquote");
	
	public By getFname() {
		return Fname;
	}

	public By getLname() {
		return Lname;
	}

	public By getBirth() {
		return Birth;
	}

	public By getNiver() {
		return Niver;
	}

	public By getGender() {
		return Gender;
	}

	public By getStreet() {
		return Street;
	}

	public By getCountry() {
		return Country;
	}

	public By getPais() {
		return Pais;
	}

	public By getZip() {
		return Zip;
	}

	public By getCity() {
		return City;
	}

	public By getOcc() {
		return Occ;
	}

	public By getJob() {
		return Job;
	}

	public By getHobb() {
		return Hobb;
	}

	public By getNext2() {
		return Next2;
	}

	public By getMake() {
		return Make;
	}

	public By getCarro() {
		return Carro;
	}

	public By getEp() {
		return Ep;
	}

	public By getDom() {
		return Dom;
	}

	public By getData() {
		return Data;
	}

	public By getNos() {
		return Nos;
	}

	public By getNumber() {
		return Number;
	}

	public By getRhd() {
		return Rhd;
	}

	public By getFuel() {
		return Fuel;
	}

	public By getType() {
		return Type;
	}

	public By getPayload() {
		return Payload;
	}

	public By getTotal() {
		return Total;
	}

	public By getPrice() {
		return Price;
	}

	public By getLpn() {
		return Lpn;
	}

	public By getMi() {
		return Mi;
	}

	public By getNext1() {
		return Next1;
	}

	public By getMcycle() {
		return Mcycle;
	}

	public By getCamper() {
		return Camper;
	}

	public By getAutomobile() {
		return Automobile;
	}

	public By getTruck() {
		return Truck;
	}

}
