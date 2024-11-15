package aprendendoApis;

import java.io.IOException;

public class ChamadaApi {

	public static void main(String[] args) {
		
		ApiService apiServico = new ApiService();
		LoginDto loginDto = new LoginDto();
		
		
		try {
			//apiServico = new ApiService();
            ClienteDto cliente = apiServico.getCliente(1);
			System.out.println(cliente);
			
			System.out.println("=======================================\n");
			loginDto.setName("Empresa Exemplo");
			loginDto.setSenha("senhaSegura123");
			RespostaApiDto login = apiServico.loginValid(loginDto);
			if(login != null) {
				System.out.println("Status: "+ login.isStatus());
				System.out.println("Mensagem: "+ login.getMensagem());
				System.out.println("Cliente: "+ login.getDados().idCodCliente);
			}else {
				System.out.println("Os campos são Obrigatórios!");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}/*catch(IOException e) {
			throw new RuntimeException(e);
		}catch (InterruptedException e) {
			throw new RuntimeException(e);
		}*/

	}

}
