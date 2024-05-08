package ejercicio2;

public class Principal {

	public static void main(String[] args) {

		/* Atibuto segundos */
		int seconds = -1;
		
		/*  */
		try {
			setSeconds(seconds);
		} catch (NegativeSecondException e) {
			e.printStackTrace();
		}

	}
	
	public static void setSeconds(int seconds) throws NegativeSecondException{
		
		if(seconds < 0) {
			
			throw new NegativeSecondException();
			
		}
		
	}

}
