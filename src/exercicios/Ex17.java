package exercicios;

public class Ex17 {

	public static void main(String[] args) {
		int somaPar = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i%2 == 0) {

				somaPar += i;
			}
		}
		System.out.println("A soma de todos os numeros pares de 1 até 100 é: "+ somaPar);
	}
}
