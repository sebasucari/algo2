package aye2practica6;
/**a) Implemente la clase Hora que contenga miembros datos separados para
almacenar horas, minutos y segundos. Un constructor inicializará estos datos en
0 y otro a valores dados. Una función miembro deberá visualizar la hora en
formato hh:mm:ss. Otra función miembro sumará dos objetos de tipo hora,
retornando la hora resultante. Realizar otra versión de la suma que asigne el
resultado de la suma en el primer objeto hora.
b) Programar un procedimiento main(), que cree dos horas inicializadas y uno que
no lo esté. Se deberán sumar los dos objetos inicializados, dejando el resultado
en el objeto no inicializado. Por último, se pide visualizar el valor resultante.
**/
public class Hora {
	private int seg;
	private int min;
	private int hor;
	
	
	public Hora() {
		seg = 0;
		min = 0;
		hor = 0;
	}
	
	public Hora(int s, int m, int h) {
		seg = s;
		min = m;
		hor = h;
		corregirHora();		
	}
	
	private void corregirHora() {
		if (seg < 0) {
			seg = 0;
					
				
		} else if (seg > 59) {
			seg = seg % 60;
			min += seg / 60;
		}
	

	if (min < 0) {
		
		min = 0;
	} else {
		if (min > 59) {
			min = min % 60;
			hor += min / 60;
			
		}
	}
	if (hor < 0)
		hor = 0;
}


	public String toString() {
		return "Hora " + String.format("%02d", hor) + ":" + min + ":" + seg;
	}
	
	public void clone(Hora h) {
		seg = h.seg;
		min = h.min;
		hor = h.hor;
	}
	
	public void sumar(Hora h2) {
		seg += h2.seg;
		min += h2.min;
		hor += h2.hor;
		corregirHora();
	}
	public static Hora sumar(Hora h1, Hora h2) {
		Hora h3 = new Hora();
		h3.clone(h1);
		
		h3.sumar(h2);
		
		return h3;
	}
}	
