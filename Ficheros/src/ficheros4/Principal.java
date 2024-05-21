package ficheros4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	
	/*Escribe un texto en un archivo de texto, línea a línea leídas de teclado,
	 * hasta que se introduzca la cadena “fin”.*/

	public static void main(String[] args) {

		/* Declaraciones */
			/* Linea de texto a escribir */
		String linea = "";
		
			/* File Writer */
		FileWriter writey = null;
		
			/* Buffered Writer */
		BufferedWriter buffyWriter = null;
		
			/* Scanner */
		Scanner scannercito = new Scanner(System.in);
		
		/* Construimos los Escritores */
			/* File Writer */
		try {
			writey = new FileWriter("..\\Ficheros\\Ficheros\\TestText.txt");
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Archivo no encontrado.");
		}//Fin construcción FileWriter
		
			/* Buff Writer */
		buffyWriter = new BufferedWriter(writey);
		
		/* Bucle de Escritura */
		System.out.println("Escribe ahora:");
		while(!linea.equals("fin")) {
			
			linea = scannercito.nextLine();
			
			//Escritura
			try {
				buffyWriter.write(linea);
				buffyWriter.newLine();
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println("Error al escribir");
			}//Fin try-catch escritura
			
		}//Fin while --> Loopty writing loop
		
		/* Closing things up */
			/* Scanner */
		scannercito.close();
		
			/* Flush */
		try {
			buffyWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Error al flushear.");
		}
		
			/* Close Buffy */
		try {
			buffyWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Error al cerrar.");
		}
		
	}//FIN MAIN

}
