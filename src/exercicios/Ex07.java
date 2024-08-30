package exercicios;

import java.util.Scanner;

class Media3{
	Scanner read = new Scanner(System.in);
	double[] notas = {0, 0, 0};
	double somaN, m;
	
	
	public void calcMedia() {
		for(int i = 0; i < 3; i++) {
			System.out.printf("Digite o %dº valor: ", i+1);
			notas[i] = read.nextInt();
			
			somaN += notas[i];
		}
		m = somaN/3;
		
		System.out.println("A média das notas é: "+ m);
	}
	
}

public class Ex07 {
	public static void main(String[] args) {
		Media3 calc = new Media3();	
		calc.calcMedia();
	}
}
