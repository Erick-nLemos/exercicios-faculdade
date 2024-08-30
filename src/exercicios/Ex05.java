package exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[] num = {0, 0, 0, 0, 0};
		int maior = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("Digite o %dº valor: ", i+1);
			num[i] = read.nextInt();
		}
		
		for (int i = 0; i < 5; i++) {
			if(num[i] > maior) {
				maior = num[i];
			}
		}
		System.out.println("O maior valor entre os valores é "+ maior);
		

	}

}
