package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		ArrayList<Double> notas = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		double n, m, somaN = 0;
		
		
		for(int i = 0; i < 4; i++) {
			System.out.printf("Digite a %dª nota: ", i+1);
			n = ler.nextDouble();
			notas.add(n);	
		}
		
		for(int i = 0; i < notas.size(); i++) {
			somaN += notas.get(i);
		}
		
		m = somaN/notas.size();
		
		System.out.println("A média das "+ notas.size() +" notas é: "+ m);
		
	}

}