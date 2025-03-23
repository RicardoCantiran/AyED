package Practica1.Ejercicio5;

import java.util.Scanner;


public class Ejercicio5 {
	
	// a hace referencia a un array
	public static int[] devolverArreglo(int n) {


		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = n * (i+1);
		}
		
		return a;
	}
	
	public static String incisoA(int[] a) {
		
		return Calculadora.devolverInfo(a);
	}
	
	public static String incisoB(int numero) {
		
		int[] a = devolverArreglo(numero) ;
		
		return Calculadora.devolverInfo(a);
	}
	
	public static void incisoC() {
		
		Scanner numero = new Scanner(System.in);
		
		int[] array = devolverArreglo(numero.nextInt());
		System.out.println(Calculadora.devolverInfo(array));
	}
	
	public static void main (String [] args) {
		
		int[] a = devolverArreglo(10);
		
		System.out.println(incisoA(a));
		System.out.print(incisoB(5));
		System.out.println();
		incisoC();
	}
}
