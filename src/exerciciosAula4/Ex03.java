package exerciciosAula4;

import java.util.Scanner;

public class Ex03 {
	
	public static int dobrarValor(int num) {
		return num * 2;
	}
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int val;
		
		System.out.print("Digite um valor inteiro: ");
		val = read.nextInt();
		
		System.out.println("O dobro do valor é: "+ dobrarValor(val));
		
		read.close();
	}

}
