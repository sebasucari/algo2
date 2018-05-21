package aye2practica6;
//1. Implemente la clase Lamparita, que sirva para representar el estado de encendido de
//una lamparita (encendido o apagado). Defina, asimismo, dos métodos que permitan
//encender y apagar la luz de la lamparita y otro que indique en qué estado se
//encuentra. La lamparita inicialmente está apagada.
public class Lamparita {
	enum EstadoLampara {ENCENDIDA, APAGADA};
	
	private EstadoLampara estado;
	
	//privaet boolean estado;
	
	public Lamparita() {
		estado = EstadoLampara.APAGADA;
		
	}
	
	public void encender() {
		estado = EstadoLampara.ENCENDIDA;
	}
	
	public void apagar() {
		estado = EstadoLampara.APAGADA;
	}
	
	public EstadoLampara getEstado() {
		return estado;
	}
}
