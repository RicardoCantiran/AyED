package Practica1;

public class Ejercicio1 {


public static String conFor(int a, int b) {
	int i;
	String str = "";
	for (i= a; i<= b; i++) {
		str += i + " ";
	}
	
	return str;
}

public static String conWhile(int a, int b) {
		
	String str = "";
	while (a <= b) {
		str += a++ + " ";
		}
	return str;
	}

public static String sinEstructuras(int a, int b) {
	String str = "";
	if (a <= b) {
		str += a++ + " " + sinEstructuras(a, b);
	}
	return str;
}
}
