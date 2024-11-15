package exercicioAula5.domain;

import java.util.ArrayList;

public class Cliente {
	
	private String nameClient;
	private int cnpjCpf;
	ArrayList<Contato> listConts = new ArrayList<Contato>();
	private Endereco endEntr;
	private Endereco endCorresp;
	public void addContato() {
		
		listConts.add(new Contato());
	}
	
	public Cliente() {
		listConts = new ArrayList<Contato>();
		endEntr = new Endereco();
		endCorresp = new Endereco();
	}
	
	public String getNameClient() {
		return this.nameClient;
	}
	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}
	
	public ArrayList<Contato> getListConts() {
		return listConts;
	}

	public void setListConts(ArrayList<Contato> listConts) {
		this.listConts = listConts;
	}

	public Endereco getEndEntr() {
		return endEntr;
	}

	public void setEndEntr(Endereco endEntr) {
		this.endEntr = endEntr;
	}

	public Endereco getEndCorresp() {
		return endCorresp;
	}

	public void setEndCorresp(Endereco endCorresp) {
		this.endCorresp = endCorresp;
	}

	public int getCnpjCpf() {
		return this.cnpjCpf;
	}
	public void setCnpjCpf(int cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}
	
	public void imprimirClient() {
		System.out.println("====================================");
		System.out.printf(" Olá, %s\n", this.nameClient);
		System.out.println("====================================\n");
		System.out.printf("Nome: ", this.nameClient);
		System.out.printf("CNPJ/CPF: ", this.cnpjCpf);
		getEndCorresp().imprimirClient();
		getEndEntr().imprimirClient();
		for(Contato c: listConts)
		{
			c.imprimirClient();
		}
	}
	
}
