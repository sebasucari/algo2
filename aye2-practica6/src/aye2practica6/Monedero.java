package aye2practica6;
/** Implemente una clase Monedero que permita gestionar la cantidad de dinero que 
 * una persona dispone en un momento dado. La clase deberá tener un constructor que 
 * permitirá crear un monedero con una cantidad de dinero inicial y deberá definir un 
 * método para meter dinero en el monedero, otro para sacarlo y finalmente, otro para 
 * consultar el disponible; solo podrá conocerse la cantidad de dinero del monedero a 
 * través de este último método. Por supuesto, no se podrá sacar más dinero del que
 *  haya en un momento dado en el monedero. 
 
 * @author Sebastian
 *
 */
public class Monedero {
	
	private float dinero;
	
	public Monedero() {
		this.dinero = 0;
	}
	
	public Monedero (float f) {
		this.dinero = f;
	}
	
	public void meter(float n) {
		this.dinero = this.dinero + n;
		
	}
	
	public void sacar(float n) {
		if ((this.dinero - n) < 0 ) {
			System.out.println("No hay dinero suficiente en el monedero");
			
		}else {
			this.dinero = this.dinero - n;
			
		}
	}

	private float getDinero() {
		return dinero;
	}
	
	public void revisar() {
		System.out.println("La cantidad de dinero que hay en el monedero es de " + this.getDinero());
	}
	
	
	
	

}
