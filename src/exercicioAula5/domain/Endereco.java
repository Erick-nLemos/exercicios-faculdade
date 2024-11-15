package exercicioAula5.domain;

public class Endereco {
	private int cep;
	private String logradouro;
	private String comp;
	private int num;
	private String bairro;
	private String uf;
	private String munic;
	//private int tel;
	
	public void imprimirClient() {
		
		System.out.print("CEP: ");
		System.out.print("Logradouro: ");
		System.out.print("Complemento: ");
		System.out.print("Nº: ");
		System.out.print("Bairro: ");
		System.out.print("UF: ");
		System.out.print("Municipio: ");
		System.out.println("===============================\n");
	}
	
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getMunic() {
		return munic;
	}
	public void setMunic(String munic) {
		this.munic = munic;
	}
	/*public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}*/
	
}
