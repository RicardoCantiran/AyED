package Practica1.Ejercicio5;

public class Calculadora {

	public static int calcularMax(int[] a) {
		
		int max = 0;
		for (int i: a) {
			if( i > max)
				max = i;
			}			
		return max;
	}
	public static int calcularMin(int[] a) {
		int min = 999;
		for (int i : a) {
			if(min > i)
				min = i;
		
		}	
	return min;
	
	}
	
	public static double calcularProm(int[] a) {
		
		
		int suma = 0;
		int cantidad = a.length;
		for (int i : a) {
			suma = suma + i;
		}
		
		return suma/cantidad;
	}
	
	public static String devolverInfo(int[] a) {
		String str = "El maximo es :" + calcularMax(a) + "\n" + "El minimo es: "+ calcularMin(a) + "\n" + "El promedio es :" + calcularProm(a) + "\n" ;
		str += "--------------------------------------------------------";
		
		return str;
	}
	
}
