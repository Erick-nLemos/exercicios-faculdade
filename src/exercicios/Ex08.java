package exercicios;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int age;
		
		System.out.print("Digite sua idade: ");
		age = read.nextInt();
		
		if(age <= 13) {
			System.out.println("Você é criança.");
		}
		else if(age <= 17) {
			System.out.println("Você é adolescente");
		}
		else if(age <= 59) {
			System.out.println("Você é adulto");
		}
		else {
			System.out.println("Você é idoso");
		}
	}

}
