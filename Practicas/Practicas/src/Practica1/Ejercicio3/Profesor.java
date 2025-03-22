package Practica1.Ejercicio3;

public class Profesor {
	private String nombre;
	private String apellido;
	private String email;
	private String  facultad;
	private String catedra;
	
	public Profesor() {
		
	}
	public Profesor(String nombre, String apellido, String email, String facultad, String catedra) {
		
		setNombre(nombre);
		setApellido(apellido);
		setEmail(email);
		setFacultad(facultad);
		setCatedra(catedra);
	}
	
	private String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private String getApellido() {
		return apellido;
	}
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	private String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	private String getFacultad() {
		return facultad;
	}
	private void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	private String getCatedra() {
		return catedra;
	}
	private void setCatedra(String catedra) {
		this.catedra = catedra;
	}
	
	public String tusDatos() {
		String str = " " + getNombre() + "\n" + getApellido() + "\n" + getEmail() + "\n" ;
		str += getFacultad() + "\n" + getCatedra();
		return str;
	}
}
