package exercicios;

import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

public class Ex06 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int age;
		
		System.out.print("Digite sua idade: ");
		age = read.nextInt();
		
		if(age >= 16) {
			System.out.println("Você já pode votar!");
		}
		else {
			System.out.println("Ainda não tem idade para votar.");
		}
		
	}

}
