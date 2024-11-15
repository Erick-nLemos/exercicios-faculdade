package exerciciosAula4;

public class Ex07 {
	
	public static boolean verificarPar(int num) {
		boolean result;
		try {
			result = num%2 == 0 ? true : false;
		}catch(Exception e){
			System.out.println("Error: Ocorreu um erro inesperado.");
			return false;
		}
		return result;
		
	}

	public static void main(String[] args) {
		
	}

}
