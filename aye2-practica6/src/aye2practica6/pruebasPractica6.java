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
		
		// Ejercicio Punto
		Punto p1 = new Punto(3, 4);
		Punto p2 = new Punto(3, 4);
		
		
		
		
		
		System.out.println("El punto es: " + Punto.sumaCoordenadas(p1, p2).toString());
		
		System.out.println(p1.sonIguales(p2)); 
		
		//Ejercicio Vecotr3D
		Vector3D v1 = new Vector3D();
		Vector3D v2 = new Vector3D(3f, 4f, 5f);
		Vector3D v3 = Vector3D.sumarVector(v1, v2);
		System.out.println(v3.toString());
	}
	

}
