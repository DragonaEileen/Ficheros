package ficheros3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

	/*Crea con un editor el fichero de texto Alumnos.txt en la carpeta del proyecto
	 * y escribe en él los nombres, edades y estaturas de los alumnos de un grupo, 
	 * cada uno en una línea.
	 * Implementa un programa que lea del fichero los datos, muestre los nombres y 
	 * calcule la media de la edad y de las estaturas, mostrándolas por pantalla.*/
	public static void main(String[] args) {

		/* Declaraciones */
			/* Variables para la media de las edades */
				/* Contador de la edad */
		int oldCounty = 0;
				/* Sumatorio de las edades */
		int oldAdditiony = 0;
		
			/* Variables para la media de las estaturas */
				/* Contador de las estaturas */
		int highCounty = 0;
				/* Sumatorio de las estaturas */
		double highAdditiony = 0;
		
		/* NOTA: Uso variables diferentes por si en alguna entrada falta un dato */
		
			/* Flag del bucle de lectura y linea de lectura */
		String linea = "";
		
			/* Array de valores por linea */
		String[] arrayLinea;
		
			/* File Reader */
		FileReader readerino = null;
		
			/* Buffered Reader */
		BufferedReader buffy;
		
		/* Let's find that file with a try-catch*/
		try {
			
			readerino = new FileReader("..\\Ficheros\\Ficheros\\Alumnos.txt");
			
		} catch (FileNotFoundException e) {
			
			System.err.println("Archivo no encontrado");
			
		}//Fin Try-Catch
		
		/* Construcción de Buffy Caza Vampiros */
		buffy = new BufferedReader(readerino);
		
		/* Loopty-loop de lectura */
		while(linea != null) {
			
			//Cazamos cualquier excepción al leer por linea
			try {
				
				linea = buffy.readLine();
				
			} catch (IOException e) {
				
				System.err.println("Error al leer linea.");
				
			}//Fin try-catch --> Catch Reading exceptions
			
			/* Si la linea no es nula (final del archivo), realizamos los siguientes pasos */
			if( linea != null) {
				//Trimmeamos la linea
				linea = linea.trim();
				
				//Spliteamos la linea en los tres valores que la componen por los espacios
				arrayLinea = linea.split(" ");
				
				/* Pasos para llegar al resultado */
					/* Print del nombre */
				System.out.println(arrayLinea[0]);
				
					/* Calculo en pos de la media de edad */
				oldCounty += 1;
				oldAdditiony = oldAdditiony + Integer.parseInt(arrayLinea[1]);
				
					/* Calculo en pos de la media de estatura */
				highCounty += 1;
				highAdditiony = highAdditiony + Double.parseDouble(arrayLinea[2]);
				
			}//Fin IF --> Linea Nula
			
		}//Fin while --> Lectura
		
		/* Resultado */
		System.out.println("Media de Edad: " + oldAdditiony/oldCounty);
		System.out.println("Media de Estatura: " + highAdditiony/highCounty);
		
		/* Cierre de Lectura */
			//Cierre del Buffered Reader
		try {
			buffy.close();
		} catch (IOException e) {
			System.err.println("El BufferedReader no se ha cerrado correctamente.");
		}
			//Cierre del File Reader
		try {
			readerino.close();
		} catch (IOException e) {
			System.err.println("El FileReader no se ha cerrado correctamente.");
		}
		
	}//FIN MAIN

}
