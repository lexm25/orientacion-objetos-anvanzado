package gui;

import gui.clases.animales.Gusano;
import gui.clases.animales.GusanoVeloz;

public class Main {

	public static void main(String[] args) {
		Gusano gusano = new Gusano("Manolito",7);
		GusanoVeloz gusanito = new GusanoVeloz("Pepe",8);
		System.out.println(gusanito.getNumPatas());
		System.out.println(gusano.getNumPatas());
	}

}
