package exerciciosAula4;

import java.util.Scanner;

class CalculoArea{
	double area;
	
	public double calcularArea(double lado) {
		this.area = Math.pow(lado, 2);
		return this.area;
	}
	
	public double calcularArea(double alt, double larg) {
		this.area = alt * larg;
		return this.area;
	}
	
}


public class Ex05 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		CalculoArea calc = new CalculoArea();
		double lado = 10, alt = 7.5, larg = 9.8;
		
		System.out.println("A área do quadrado é: "+ calc.calcularArea(lado));
		System.out.println("A área do triângulo é: "+ calc.calcularArea(alt, larg));
		
		read.close();
	}

}
