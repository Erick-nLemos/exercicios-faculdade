package aprendendoApis;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import aprendendoApis.ClienteDto;

public class ApiService {
	
	public ClienteDto getCliente(int id) throws IOException, InterruptedException {
		try {
			HttpClient client = IgnorarSSL.createHttpClientIgnoringSSL();
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://localhost:7144/api/Cliente/ListarClientes/"+ id)).build();
			
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			
			ObjectMapper mapper = new ObjectMapper();
			RespostaApiDto resposta = mapper.readValue(response.body(), RespostaApiDto.class);
			return resposta.getDados();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return null;
	}
}
