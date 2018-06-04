package aye2practica6;
/**Implemente una clase Microondas que permita cocinar una comida. El microondas
 posee una puerta que puede estar abierta o cerrada, y un contenido que puede
 tener una comida o estar vacío. Se puede insertar una comida
 (si la puerta está abierta, y no hay otra comida adentro), 
 retirar una comida (si la puerta está abierta y hay una comida adentro).
 También se puede iniciar una cocción con un nivel de intensidad de cocción
 y una cantidad de segundos de cocción, si la puerta está cerrada,
 y hay una comida adentro. También se puede finalizar la cocción
 (cuando se acaba su tiempo), lo cual la comida cocinada tendrá
 tantos puntos adicionales de cocción como el nivel de intensidad de la
 cocción finalizada multiplicado por la cantidad de segundos de esa cocción.
 Cuando una cocción se encuentra en curso, la puerta no se puede abrir.
 Lo que sí se puede hacer es abortar una cocción a una cantidad de segundos
 faltantes, si existe una cocción en curso. El efecto de esto último sería
 cocinar la comida por sólo el tiempo parcial en que estuvo cocinándose
 (el tiempo de la cocción del inicio menos el tiempo que faltaba al abortar)
 y abrir la puerta. También se solicita que se pueda mostrar el estado completo
 del microondas en cualquier momento, incluyendo el de la comida que puede estar
 dentro. La comida se caracteriza por poseer un nombre y una cantidad de puntos de cocción. 
 * 
 * @author Sebastian
 *
 */
public class Microondas {
	
	private enum estado{
		APAGADO,
		STANDBY,
		EnCOCCION
	}
	
	
	private enum Intensidad {
		MUYBAJA (1),
		BAJA (2),
		MEDIA (3),
		ALTA (4),
		MUYALTA (5)
		;
	
	
	private final int nivelIntensidad;
	Intensidad (int nivelIntensidad){
		this.nivelIntensidad = nivelIntensidad;
	}
	
	private double tiempo;

}
