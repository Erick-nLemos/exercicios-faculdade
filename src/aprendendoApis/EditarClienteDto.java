package aprendendoApis;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class EditarClienteDto {
	
	@JsonProperty("name")
	public String name;
	
	@JsonProperty("cnpj")
	public String cnpj;
	
	@JsonProperty("email")
	public String email;
	
	@JsonProperty("telefone")
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
	
	@Override
    public String toString() {
        return "ClienteDto{" +
                ",\n fantasia='" + name + '\'' +
                ",\n cnpj='" + cnpj + '\'' +
                ",\n email='" + email + '\'' +
                ",\n telefone='" + telefone + '\'' +
                ",\n cep='" + cep + '\'' +
                ",\n rua='" + rua + '\'' +
                ",\n numero=" + numero +
                ",\n bairro='" + bairro + '\'' +
                ",\n cidade='" + cidade + '\'' +
                ",\n uf='" + uf + '\'' + '}';
    }
}
