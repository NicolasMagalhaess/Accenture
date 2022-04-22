package metodos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Metodos extends Browser {

	public void click(By elemento) {
		try {
			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.err.println("------Erro ao clickar em um elemento-------" + e.getMessage());
		}
	}

	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {
			System.err.println("------Erro ao escrever em um elemento-------" + e.getMessage());
		}

	}

	public void pausa() {
		try {
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		} catch (Exception e) {
			System.err.println("------Erro ao esperar por um elemento-------" + e.getMessage());
		}
	}

	public void fechar() {
		try {
			driver.quit();

		} catch (Exception e) {
			System.err.println("------Erro ao fechar o browser-------" + e.getMessage());
		}
	}

	public void submit(By elemento) {
		try {
			driver.findElement(elemento).submit();
		} catch (Exception e) {
			System.err.println("------Erro ao enviar-------" + e.getMessage());

		}

	}

}
