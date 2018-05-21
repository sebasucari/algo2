package aye2practica6;
/**
 a) Implemente la clase Hora que contenga miembros datos separados para
almacenar horas, minutos y segundos. Un constructor inicializará estos datos en
0 y otro a valores dados. Una función miembro deberá visualizar la hora en
formato hh:mm:ss. Otra función miembro sumará dos objetos de tipo hora,
retornando la hora resultante. Realizar otra versión de la suma que asigne el
resultado de la suma en el primer objeto hora.
b) Programar un procedimiento main(), que cree dos horas inicializadas y uno que
no lo esté. Se deberán sumar los dos objetos inicializados, dejando el resultado
en el objeto no inicializado. Por último, se pide visualizar el valor resultante.

 */
public class Empleado {
	private int numero;
	private String nombre;
	
	public Empleado(int n, String nombre) {		//SHADOWING
		
		numero = n;
		this.nombre = nombre;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 
	
	public void verDatos() {
		System.out.println("Empleado nro" + numero + ": " + nombre);
	}
}
