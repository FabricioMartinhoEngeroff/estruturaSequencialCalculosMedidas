package javaEstutrutura;

import java.util.Locale;
import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US );
		Scanner sc = new  Scanner ( System . in );
		
		double r;
		double area;
		
		System.out.print("Digitr o valor do raio do circuo: ");
		r = sc.nextDouble();
		
		area = 3.14159 * r * r;
		
		System.out.printf("AREA = %.3f\n" , area );
		
		sc.close();
	}

}
