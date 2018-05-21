package aye2practica6;

public class pruebasPractica6 {

	public static void main(String[] args) {
		
		Lamparita lamp1 = new Lamparita();
		
		System.out.println("La lamparita está " + lamp1.getEstado());
		
		lamp1.encender();
		System.out.println("La lamparita está " + lamp1.getEstado());
		
	}

}
