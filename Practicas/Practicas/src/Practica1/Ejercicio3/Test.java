package Practica1.Ejercicio3;

public class Test {

	public static void main(String[] args) {
		
		Alumno[] alu= new Alumno[2];
		Profesor[] prof = new Profesor[3];

		alu[0] = new Alumno("Ricardo","Ford","3A","ric@gmail.com","1 y 50");
		alu[1] = new Alumno("Samuel","michael","3B","san@gmail.com","122 y 50");
		//Agrenguen ustedes los datos de los profesores
		prof[0] = new Profesor();
		prof[1] = new Profesor();
		prof[2] = new Profesor();
		
		for (Alumno i: alu) {
			System.out.println(i.tusDatos());
			System.out.println("--------------------");
		}
		
		for (Profesor i: prof) {
			System.out.println(i.tusDatos());
			System.out.println("--------------------");
		}
	}
		

}
