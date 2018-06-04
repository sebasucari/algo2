package practica7;

import java.util.ArrayList;

public class SistemaEscuela {
	
	private final static int LONGITUD_ARREGLO = 5;
	
	public SistemaEscuela() {
		
	}
	public static void main(String[] args) {
		
		
		// Arreglo est�tico de personas
		Persona[] aPersona = new Persona[LONGITUD_ARREGLO];
		aPersona[0] = new Empleado();
		aPersona[1] = new Alumno();
		
		for (int i = 0; i<aPersona.length; i++) {
			System.out.println(i + ": " + aPersona[i]);
		}
		
		// Arreglo dinamico. Mucho m�s dif�cil pasasrse del �ndice
		ArrayList<Persona> aPersona2 = new ArrayList<>();
		aPersona2.add(new Empleado());
		aPersona2.add(new Empleado());
		aPersona2.add(new Alumno());
		
		for (int i = 0; i < aPersona2.size(); i++) {
			System.out.println(i + ": " + aPersona2.get(i));
		}
		
		for (Persona p : aPersona2) {
			System.out.println(p);
		}
		
		// Covarianza en tipo param�trico ---> SI
		ArrayList<Empleado> emp1 = new ArrayList<>();
		ArrayList<? extends Persona> per1;
		
		per1 = emp1;  // Se puede decir que ArrayList<Empleado> es SUBTIPO de ArrayList<? extends Persona>
	}

}
