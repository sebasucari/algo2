package aye2practica6;
/**Implemente una clase Microondas que permita cocinar una comida. El microondas
 posee una puerta que puede estar abierta o cerrada, y un contenido que puede
 tener una comida o estar vac�o. Se puede insertar una comida
 (si la puerta est� abierta, y no hay otra comida adentro), 
 retirar una comida (si la puerta est� abierta y hay una comida adentro).
 Tambi�n se puede iniciar una cocci�n con un nivel de intensidad de cocci�n
 y una cantidad de segundos de cocci�n, si la puerta est� cerrada,
 y hay una comida adentro. Tambi�n se puede finalizar la cocci�n
 (cuando se acaba su tiempo), lo cual la comida cocinada tendr�
 tantos puntos adicionales de cocci�n como el nivel de intensidad de la
 cocci�n finalizada multiplicado por la cantidad de segundos de esa cocci�n.
 Cuando una cocci�n se encuentra en curso, la puerta no se puede abrir.
 Lo que s� se puede hacer es abortar una cocci�n a una cantidad de segundos
 faltantes, si existe una cocci�n en curso. El efecto de esto �ltimo ser�a
 cocinar la comida por s�lo el tiempo parcial en que estuvo cocin�ndose
 (el tiempo de la cocci�n del inicio menos el tiempo que faltaba al abortar)
 y abrir la puerta. Tambi�n se solicita que se pueda mostrar el estado completo
 del microondas en cualquier momento, incluyendo el de la comida que puede estar
 dentro. La comida se caracteriza por poseer un nombre y una cantidad de puntos de cocci�n. 
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
