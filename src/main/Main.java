package main;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		File entrada = new File("in1.txt");
		Reserva reserva = new Reserva(entrada);
		reserva.resolver();
	}

}
