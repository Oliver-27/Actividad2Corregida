package app.ito.poo;

import clase.ito.poo.musico;
import java.time.LocalDate;

public class MyApp {

	static void run() {
		musico c1 = new musico("La puerta negra", 3, 34, LocalDate.of(2000, 01, 12), LocalDate.of(2001, 2, 24));
		System.out.println(c1);
		System.out.println(c1.addInterprete("Maluma"));
		System.out.println(c1.addInterprete("Paquita la del Barrio"));
		System.out.println(c1);
	}

	public static void main(String[] args) {
		run();
	}

}