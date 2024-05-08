package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
	
	/**
	 * Método para leer un double
	 * 
	 * @param scannercito Scanner que lee datos
	 * @return result Resultado de la lectura
	 */
	public static double readDouble(Scanner scannercito) {
		
		/* Atributo donde se guarda el double leido */
		double result = 0;
		
		//Try Catch Block
		try {
			
			result = scannercito.nextDouble();
			
		} catch (InputMismatchException e) {
			
			System.err.println("El valor introducido no es de tipo Double");
			result = 0.0;
			
		}//Fin try catch
		
		return result;
		
	}//Fin readDouble()
	
	/**
	 * Método para leer un Int
	 * 
	 * @param scannercito Scanner para leer datos
	 * @return result Integer leído
	 */
	public static int readInt(Scanner scannercito) {
		
		/* Atributo donde guardar el número */
		int result = 0;
		
		//Try-catch block
		try {
			
			result = scannercito.nextInt();
			
		} catch (InputMismatchException e) {

			System.err.println("El valor introducido no es de tipo Integer");
			result = 0;
			
		}
		
		return result;
		
	}//Fin readInt

}
