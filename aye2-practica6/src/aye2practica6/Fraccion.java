package aye2practica6;
/** Implemente la clase Fraccion con las 
 * operaciones aritméticas comunes (suma, resta, multiplicación y división), 
 * dos constructores, y el método toString().
 * 
 * @author Sebastian
 *
 */
public class Fraccion {

	private int n;
	private int d;
	
	public Fraccion() {
		this.n = 0;
		this.d = 1;
	}
	
	public Fraccion(int n, int d) {
		
		this.n = n;
		if (d != 0) {
			this.d = d;
		} else {
			System.out.println("Error, no existe la división por 0");
		}
		
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}
	
	public static Fraccion suma(Fraccion f1, Fraccion f2) {
		
		return new Fraccion(f1.getN() * f2.getD() + f2.getN() * f1.getD(), (f1.getD() * f2.getD()) );
		
	}
	
	

	public static Fraccion resta(Fraccion f1, Fraccion f2) {
		
		return new Fraccion(f1.getN() * f2.getD() - f2.getN() * f1.getD(), (f1.getD() * f2.getD()) );
		
	}
	
	
	public static Fraccion prod(Fraccion f1, Fraccion f2) {
		
		return new Fraccion(f1.getN() * f2.getN(), f1.getD() * f2.getD());
		
	}
	
	public static Fraccion div(Fraccion f1, Fraccion f2) {
		
		return new Fraccion (f1.getN() * f2.getD(), f1.getD() * f2.getN());
	}
	
	@Override
	public String toString() {
		
			return (getN() + "/" + getD());
		
		}
	}
