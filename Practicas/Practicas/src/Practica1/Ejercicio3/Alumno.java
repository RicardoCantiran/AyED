package Practica1.Ejercicio3;

public class Alumno {
	private String nombre;
	private String apellido;
	private String comision;
	private String email;
	private String direccion;
	
	public Alumno () {
		
	}

	public Alumno (String nombre, String apellido, String comision, String email, String direccion) {
		setNombre(nombre);
		setApellido(apellido);
		setComision(comision);
		setDireccion(direccion);
		setEmail(email);	
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
	
	private String getComision() {
		return comision;
	}
	
	private void setComision(String comision) {
		this.comision = comision;
	}
	
	private String getEmail() {
		return email;
	}
	
	private void setEmail(String email) {
		this.email = email;
	}
	
	private String getDireccion() {
		return direccion;
	}
	
	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String tusDatos() {
		String str = "Nombre: "+ getNombre();
		str += "\n"+ "Apellido: " + getApellido() + " \n" + "Comision: "+ getComision()  + "\n" + "Direccion: "+ getDireccion() + "\n" +"email: "+ getEmail();
		return str;
	}
}
