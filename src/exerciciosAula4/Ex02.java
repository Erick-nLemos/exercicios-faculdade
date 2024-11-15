package exerciciosAula4;

import java.util.Scanner;

class Saudacao{
	
	
	public void saudarUsuario(String name) {
		System.out.printf("Olá, %s!\n", name);
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Saudacao saudar = new Saudacao();
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite seu nome: ");
			String name = read.next(); 	
			
			
			saudar.saudarUsuario(name);
		}
		
		read.close();

	}

}
