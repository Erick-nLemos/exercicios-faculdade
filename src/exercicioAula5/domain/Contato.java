package exercicioAula5.domain;

import java.util.ArrayList;

public class Contato {
	private String nameCont;
	private int tel;
	private String email;
	
	
	
	public Contato() {
		
	}
	public Contato(String nome, int tel, String email) {
		this.nameCont = nome;
		this.tel = tel;
		this.email = email;
	}
	
	public void imprimirClient() {
		System.out.println("\n=============================");
		System.out.println(" Contato \n");
		System.out.printf("Nome: ", this.nameCont);
		System.out.printf("Telefone: ", this.tel);
		System.out.printf("E-mail: ", this.email);
	}
	
	
	
	
	public String getNameCont() {
		return nameCont;
	}
	public void setNameCont(String nameCont) {
		this.nameCont = nameCont;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
