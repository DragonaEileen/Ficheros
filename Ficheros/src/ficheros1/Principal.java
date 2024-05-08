package ficheros1;

import java.io.*;

public class Principal {

	public static void main(String[] args) {

		FileReader in = null;
		
		/* Flag */
		String flag = "";
		
		try {
			in = new FileReader("/Ficheros/NumerosReales.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedReader out = new BufferedReader(in);
		
		try {
			while(out.readLine() != null) {
				
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
