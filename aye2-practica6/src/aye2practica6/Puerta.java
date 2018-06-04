package aye2practica6;

public class Puerta {
	private enum estadoPuerta{
		ABIERTA ("abierta"),
		CERRADA ("cerrada")
		;
		
		private final String estado;
		
		estadoPuerta (String estado){
			this.estado = estado;
		}
		
	}
	
	public String getEstadoPuerta() {
		return (this.estado);
	}
}
