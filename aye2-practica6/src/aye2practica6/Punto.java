package aye2practica6;
/** 8. Implemente la clase Punto (pares de coordenadas de tipo float x, y). Defina
constructores y métodos para asignar valores a las coordenadas de los puntos,
retornar el valor de cada coordenada, y sumar dos puntos, retornando su resultado.
Definir un método booleano de igualdad entre dos puntos
/*
 * 
 * @author AluDoc
 *
 */
public class Punto {

	protected float x;
	protected float y;
	
		public Punto (float x, float y) {
			this.x = x;
			this.y = y;
		}
		
		public Punto() {
			this.x = 0;
			this.y = 0;
		}

		public float getX() {
			return x;
		}

		public void setX(float x) {
			this.x = x;
		}

		public float getY() {
			return y;
		}

		public void setY(float y) {
			this.y = y;
		}
		
		public static Punto sumaCoordenadas(Punto p1, Punto p2) {
			Punto p3 = new Punto(p1.getX() + p2.getX(), p1.getY() + p2.getY());
			
			return(p3);
		}
		
		public boolean sonIguales(Punto p2) {
			if (this.x == p2.getX() && this.y == p2.getY()){
					return true;
			}else {
				return false;
			}
			
		}
		
		@Override
		public String toString() {

		return "(" + getX() + "," + getY() + ")";
			
		}
}
