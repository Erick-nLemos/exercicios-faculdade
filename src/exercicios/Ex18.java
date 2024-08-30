package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		Scanner read = new Scanner(System.in);
		int n = 0;
		
		for(int i = 0; i < 4; i++) {
			System.out.printf("Digite o %dº número: ", i+1);
			n = read.nextInt();
			
			num.add(n);
		}
		
		System.out.println("=====================================");
		for(int i = 0; i < num.size(); i++) {
			System.out.println("Números digitados: "+ num.get(i));
		}
		
	}

}
