package exerciciosAula4;

import java.util.Scanner;

public class Ex06 {
	public static double dividir(int n1, int n2) {
		double result;
		try {
			result = n1/n2;
		}catch(ArithmeticException e){
			System.out.println("Error: Divisão por zero.");
			return -1;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("Digite o valor: ");
		n1 = read.nextInt();
		System.out.print("Digite outro valor: ");
		n2 = read.nextInt();
		
		System.out.printf("A divisão de %d por %d é: %.2f", n1, n2, dividir(n1, n2));
		
		read.close();
		
	}

}
