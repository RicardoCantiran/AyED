package Practica1;
import java.util.Scanner;
public class Ejercicio2 {


public static int[] devolverArreglo(int n) {


	int[] a = new int[n];
	
	for(int i = 0; i < n; i++) {
		a[i] = n * (i+1);
	}
	
	return a;
}



public static void main (String [] args) {
	
	Scanner b = new Scanner(System.in);

	int [] a;
	int n = b.nextInt();
	while (n != 0) {
		a = Ejercicio2.devolverArreglo(n);
		for (int elto: a)
			System.out.println(elto);
		n = b.nextInt();
		}

	}

}
