package aye2practica6;
/** Implemente la clase Polar, cuyos miembros sean el radio y ángulo, y que posea
métodos de obtención de cada coordenada polar, y otro que convierta las
coordenadas polares en rectangulares. Programar un método que permita sumar
coordenadas polares. Realizar un método de prueba para la clase.
x = radio * cos(ángulo)
y = radio * sen(ángulo)
/*
 * 
 * @author Sebastian
 *
 */
import java.lang.Math;

public class Polares {
	private double r;
	private double ang;
	
	public Polares (double r, double ang) {
		
		this.r = r;
		this.ang = ang;
		while (this.ang>360) {
			this.ang = this.ang - 360;
		}
		
	}
	
	public Polares() {
		this.r = 0;
		this.ang = 0;
	}
	
	public double conversionX(Polares p) {
		double x;
		x = p.r*Math.cos(p.ang);
		return x;
	}
	
	public double conversionY(Polares p) {
		double y;
		y = p.r*Math.sin(p.ang);
		return y;
	
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getAng() {
		return ang;
	}

	public void setAng(double ang) {
		this.ang = ang;
	}
	
	public double sumaPx(Polares p1, Polares p2) {
		double x;
		x = conversionX(p1) + conversionX(p2); 
		return x;
			
	}
	
	public double sumaPy(Polares p1, Polares p2) {
		double y;
		y = conversionY(p1) + conversionY(p2);
		return y;

	}
	
	
}