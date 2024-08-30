package exercicios;

import java.util.Scanner;

class Media {
	
	public double calcMedia(double num1, double num2) {
		double m = (num1+num2)/2;
		
		return m;
	}

}

public class Ex01 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Media calc = new Media();
		double n1, n2;
		
		System.out.println("Digite o primeiro valor: ");
		n1 = read.nextDouble();
		System.out.println("Digite o segundo valor: ");
		n2 = read.nextDouble();
		
		System.out.println("A média dos valores é: "+ calc.calcMedia(n1, n2));

	}
}
