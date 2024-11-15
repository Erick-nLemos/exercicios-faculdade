package aprendendoApis;

import java.io.IOException;

public class ChamadaApi {

	public static void main(String[] args) {
		
		ApiService apiServico = new ApiService();
		
		try {
			apiServico = new ApiService();
            ClienteDto cliente = apiServico.getCliente(1);
			System.out.println(cliente);
		}catch(Exception e) {
			e.printStackTrace();
		}/*catch(IOException e) {
			throw new RuntimeException(e);
		}catch (InterruptedException e) {
			throw new RuntimeException(e);
		}*/

	}

}
