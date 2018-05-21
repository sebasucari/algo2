package aye2practica6;

public class pruebasPractica6 {

	public static void main(String[] args) {
		// Prueba lamparita
		Lamparita lamp1 = new Lamparita();
		
		System.out.println("La lamparita está " + lamp1.getEstado());
		
		lamp1.encender();
		System.out.println("La lamparita está " + lamp1.getEstado());
		
		
		
	 // Ejercicio Hora
		Hora h1 = new Hora(1, 123, 108);
		Hora h2 = new Hora(4, 23, 123);
		
		System.out.println("La hora h1 es: " + h1);
		
		System.out.println("La suma de h1 y h2 es (static): " + Hora.sumar(h1,  h2));
		h1.sumar(h2);
		System.out.println("La suma de h1 y h2 es:" + h1);
		
		// Ejercicio EMpleado
		Empleado emp1 = new Empleado(26483937, "Carlos");
		emp1.verDatos();
		
	}

}
