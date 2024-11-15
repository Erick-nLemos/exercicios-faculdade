package aprendendoApis;


import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClienteDto {
	
	@JsonProperty("idCodCliente")
	public int idCodCliente;
	
	@JsonProperty("fantasia")
	public String fantasia;
	
	@JsonProperty("cnpj")
	public String cnpj;
	
	@JsonProperty("email")
	public String email;
	
	@JsonProperty("telCelCli")
	public String telefone;
	
	@JsonProperty("cep")
	public String cep;
	
	@JsonProperty("rua")
	public String rua;
	
	@JsonProperty("numero")
	public int numero;
	
	@JsonProperty("bairro")
	public String bairro;
	
	@JsonProperty("cidade")
	public String cidade;
	
	@JsonProperty("uf")
	public String uf;
	
	@JsonProperty("senha")
	public String senha;
	
	@Override
    public String toString() {
        return "ClienteDto{" +
                "idCodCliente=" + idCodCliente +
                ",\n fantasia='" + fantasia + '\'' +
                ",\n cnpj='" + cnpj + '\'' +
                ",\n email='" + email + '\'' +
                ",\n telefone='" + telefone + '\'' +
                ",\n cep='" + cep + '\'' +
                ",\n rua='" + rua + '\'' +
                ",\n numero=" + numero +
                ",\n bairro='" + bairro + '\'' +
                ",\n cidade='" + cidade + '\'' +
                ",\n uf='" + uf + '\'' +
                ",\n senha='" + senha + '\'' +
                '}';
    }
}
