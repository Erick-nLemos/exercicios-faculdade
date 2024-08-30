package exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner read =  new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro valor: ");
		n1 = read.nextInt();
		System.out.println("Digite o segundo valor: ");
		n2 = read.nextInt();
		System.out.println("Digite o terceiro valor: ");
		n3 = read.nextInt();
		
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O valor "+ n1 +" é maior que "+ n2 +" e "+ n3);
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println("O valor "+ n2 +" é maior que "+ n1 +" e "+ n3);
		}
		else if(n3 > n1 && n3 > n2){
			System.out.println("O valor "+ n3 +" é maior que "+ n1 +" e "+ n2);
		}
		else {
			System.out.println("Os valores são iguais.");
		}

	}

}
