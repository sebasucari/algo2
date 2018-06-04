package practica7;

import java.util.Date;
import java.util.Optional;

/**Definir una clase Persona que contenga información de propósito general común a
todas las personas. Derive (subclasifique) las clases Estudiante y Empleado
/*
 * 
 * @author AluDoc
 *
 */
public abstract class Persona {
		protected String nombre; // inicializa en null
		protected int dni; // inicializa en 0
		protected Date fechaNacimiento;
		protected Persona pareja;
		protected Optional<Persona> pareja2; //	Maybe(Persona)	
		public Persona() {
			nombre = new String ("");
			fechaNacimiento = new Date();
			pareja2 = Optional.empty();	// Nothing
		}
		
		public String getNombre() {
			return nombre;
		}
		public int getDni() {
			return dni;
		}
		public Date getFechaNacimiento() {
			return fechaNacimiento;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public void setDni(int dni) {
			this.dni = dni;
		}
		public void setFechaNacimiento(Date fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}
		
		public boolean tienePareja() {
			return pareja2.isPresent(); // isPresent devuelve si tiene valor pareja2 como isJust
		}
		
		public boolean getPareja(Persona p) {
			if (tienePareja()) {
				//p.clone(pareja);
				p = pareja2.get();
				return true;
			}else {
				return false;
			}
		}
		
		public abstract int getIngresos(); // Solo la firma en metodos abstractos
}
