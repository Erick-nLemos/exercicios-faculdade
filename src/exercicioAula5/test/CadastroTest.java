package exercicioAula5.test;

import java.util.Scanner;
import exercicioAula5.domain.*;

public class CadastroTest {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Cliente client01 = new Cliente();
		Contato cont01 = new Contato();
		Endereco enderCorresp = new Endereco();
		Endereco enderEntrega = new Endereco();
		String nome, nomeCont, email, logra, 
		comp, bairro, uf, munic, lograEntr, 
		compEntr, bairroEntr, ufEntr, municEntr;
		int cnpjCpf, telCont, cep, numEnder,cepEntr, numEnderEntr;
		
		System.out.println("============================");
		System.out.println(" Cadastro de Cliente   ");
		System.out.println("============================\n");
		
		System.out.print("Nome: ");
		nome = read.nextLine();
		System.out.print("CNPJ/CPF: ");
		cnpjCpf = read.nextInt();
		
		System.out.println("\n=============================");
		System.out.println(" Contato \n");
		System.out.print("Nome: ");
		nomeCont = read.nextLine();
		System.out.print("Telefone: ");
		telCont = read.nextInt();
		System.out.print("E-mail: ");
		email = read.nextLine();
		
		System.out.println("\n=============================");
		System.out.println(" Endereço de Correspondencia \n");
		System.out.print("CEP: ");
		cep = read.nextInt();
		System.out.print("Logradouro: ");
		logra = read.nextLine();	
		System.out.print("Complemento: ");
		comp = read.nextLine();
		System.out.print("Nº: ");
		numEnder = read.nextInt();
		System.out.print("Bairro: ");
		bairro = read.nextLine();
		System.out.print("UF: ");
		uf = read.next();
		System.out.print("Municipio: ");
		munic = read.nextLine();
		System.out.println("===============================\n");
		
		System.out.println("\n=============================");
		System.out.println(" Endereço de Entrega \n");
		System.out.print("CEP: ");
		cepEntr = read.nextInt();
		System.out.print("Logradouro: ");
		lograEntr = read.nextLine();	
		System.out.print("Complemento: ");
		compEntr = read.nextLine();
		System.out.print("Nº: ");
		numEnderEntr = read.nextInt();
		System.out.print("Bairro: ");
		bairroEntr = read.nextLine();
		System.out.print("UF: ");
		ufEntr = read.next();
		System.out.print("Municipio: ");
		municEntr = read.nextLine();
		System.out.println("===============================");
		
		// guardando cliente e contato
		client01.setNameClient(nome);
		client01.setCnpjCpf(cnpjCpf);
		cont01.setNameCont(nomeCont);
		cont01.setTel(telCont);
		cont01.setEmail(email);
		
		// guardando endereços
		enderCorresp.setCep(cep);
		enderCorresp.setLogradouro(logra);
		enderCorresp.setComp(comp);
		enderCorresp.setNum(numEnder);
		enderCorresp.setBairro(bairro);
		enderCorresp.setUf(uf);
		enderCorresp.setMunic(munic);
		
		enderEntrega.setCep(cep);
		enderEntrega.setLogradouro(logra);
		enderEntrega.setComp(comp);
		enderEntrega.setNum(numEnder);
		enderEntrega.setBairro(bairro);
		enderEntrega.setUf(uf);
		enderEntrega.setMunic(munic);
		

		client01.imprimirClient();
		
		read.close();

	}

}
