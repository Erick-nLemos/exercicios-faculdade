package exercicios;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um número: ");
		num = read.nextInt();
		
		if(num > 0) {
			System.out.println("O valor "+ num +" é positivo.");
		}
		else if(num == 0){
			System.out.println("O valor é 0.");
		}
		else {
			System.out.println("O valor "+ num +" é negativo.");
		}
		
	}
}
