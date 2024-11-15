package exerciciosAula4;

import java.util.Scanner;

class Calculos{
	
	public int somar(int num1, int num2){
		return num1 + num2;
	}
}


public class Ex04 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		var calc = new Calculos();
		System.out.print("Digite um número: ");
		int n1 = read.nextInt();
		System.out.print("Digite outro número: ");
		int n2 = read.nextInt();
		
		System.out.println("A soma deles é "+ calc.somar(n1, n2));
		
		read.close();
	}

}
