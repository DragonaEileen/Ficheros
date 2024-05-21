package ficheros1y2;

import java.io.*;
import java.util.Scanner;

/* Crea con un editor el fichero de texto NumerosReales.txt en la 
 * carpeta del proyecto. Escribe en él una serie de números reales 
 * separados por espacios simples. Implementar un programa que acceda 
 * a NumerosReales.txt, lea los números y calcule la suma y la media 
 * aritmética, mostrando los resultados por pantalla. */

/* NOTA: Tras leer el ejercicio 2 me he dado cuenta de que la manera en la que he hecho el primer ejercicio
 * también le sirve al segundo, por lo que tras hacer pruebas, todo va guay, y he decidido implementar los dos
 * como el mismo ejercicio */
public class Principal {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Variables para el calculo de la media y la suma */
				/* Contador de números para la media */
		int county = 0;
				/* Sumatorio de los numeros */
		int additiony = 0;
		
			/* FileReader */
		FileReader readerino = null;
		
			/* Scanner */
		Scanner fileSC;
		
		//Try-Catch --> Finding File
		try {
			
			readerino = new FileReader("..\\Ficheros\\Ficheros\\NumerosReales.txt");
			
		} catch (FileNotFoundException e) {
			
			System.err.println("Archivo no encontrado");
			
		}//Fin TRY-CATCH --> Finding File
		
		//Le pasamos como flujo de entrada al Scanner el FileReader
		fileSC = new Scanner(readerino);
		
		//Bucle de lectura
		while(fileSC.hasNextInt()) {
			
			additiony = additiony + fileSC.nextInt();
			county += 1;
			
		}//Fin WHILE --> Lectura
		
		/* Resultado */
		System.out.println("Suma: " + additiony);
		System.out.println("Media: " + additiony/county);
		
		/* Cierre de Scanner */
		fileSC.close();
		
	}//FIN MAIN

}
