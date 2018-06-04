package practica9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaExcepciones {
	private static Integer[] arregloInt;
	private static final int SIZE_ARREGLO = 10;
	private static Scanner tecladoMain;
	

	public static void ingresarDatoArray(int indice){
		try {
			arregloInt[indice] = 15;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("El indice esta fuera de rango");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			for (StackTraceElement elemento : e.getStackTrace()) {
				System.out.println("Archivo: " + elemento.getFileName());
				System.out.println("Linea de error: " + elemento.getLineNumber());
				System.out.println("Clase: " + elemento.getClassName());
			}
		}	
	}
	
	public static void ingresarDatoArray2(int indice) throws MiAppException{
		try {
			arregloInt[indice] = 15;
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new MiAppException("Nueva Excepcion por indice fuera de rango", e);
		}
	}
	
	public static int leerIndice() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el indice: ");
		int indice = 0;
		boolean ingresoOk = false;
		while (!ingresoOk) {
			try {
				indice = teclado.nextInt();
				ingresoOk = true;
			} catch (InputMismatchException e) {
			System.out.println("Error ingreso numerico. Intene nuevamente");
			teclado.next();
			} 
			teclado.close();
		}
		
		return indice;
	}
	
	public static int leerIndice2() {
		System.out.println("Ingrese el indice: ");
		return tecladoMain.nextInt();
	}
	
	public static void main(String[] args) {
		tecladoMain = new Scanner(System.in);
		arregloInt = new Integer[SIZE_ARREGLO];
		
		int indice = leerIndice2();
		//ingresarDatoArray(leerIndice());
		
	
		
		try {
			ingresarDatoArray2(indice);
		} catch(MiAppException e) {
			System.out.println(e);
		} catch(InputMismatchException e) {
			System.out.println("Error en ingreso numerico.");
		}
		tecladoMain.close();
		System.out.println("Termina OK");
	}
}
