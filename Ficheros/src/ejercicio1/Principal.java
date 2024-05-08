package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		/* Atributos */
		/**
		 * Atributo double
		 */
		double doble;
		
		/**
		 * Atributo int
		 */
		int integer = 0;
		
		/* Apertura de Scanner */
		Scanner scannercito = new Scanner(System.in);
		
		do {
			
			System.out.println("Double:");
			doble = Utils.readDouble(scannercito);
			
			System.out.println("Integer:");
			integer = Utils.readInt(scannercito);
			
		}while(integer > 0);
		
	}

}
