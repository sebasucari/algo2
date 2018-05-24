package aye2practica6;
/** 9. Implemente la clase Vector3D (ternas de coordenadas de tipo float x, y, z). Defina
constructores y métodos para asignar valores a las coordenadas de los vectores3D,
retornar el valor de cada coordenada, y sumar dos vectores3D, retornando su
resultado. Definir un método booleano de igualdad entre dos vectores3D.
Implementar esta clase a partir de la implementación de la clase Punto
/*
 * 
 * @author AluDoc
 *
 */
public class Vector3D extends Punto {
	private float z;
	
	public Vector3D (float x, float y, float z) {
				
		super(x, y); //equivalente a this.x = x;   this.y = y;
		this.z = z;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	
	public static Vector3D sumaCoordenadas()
	
	
}
	
