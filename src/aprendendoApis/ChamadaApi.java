package aprendendoApis;

import java.io.IOException;

public class ChamadaApi {

	public static void main(String[] args) {
		
		ApiService apiServico = new ApiService();
		LoginDto loginDto = new LoginDto();
		EditarClienteDto editDto = new EditarClienteDto();
		CreateClienteDto criarCliente = new CreateClienteDto();
		int id_cliente;
		
		
		try {
            ClienteDto cliente = apiServico.getCliente(2);
			System.out.println(cliente);
			
			System.out.println("=======================================\n");
			loginDto.setName("Luis Corp Editado");
			loginDto.setSenha("thur1234");
			RespostaApiDto login = apiServico.loginValid(loginDto);
			if(login != null) {
				
				System.out.println("Status: "+ login.isStatus());
				System.out.println("Mensagem: "+ login.getMensagem());
				if(login.getDados() != null) {
					System.out.println("Cliente: "+ login.getDados().idCodCliente);
				}
				
			}else {
				System.out.println("Os campos são Obrigatórios!");
			}
			id_cliente = login.getDados().idCodCliente;
			
			System.out.println("==========================================\n");
			editDto.name = "Luis Corp Editado";
			editDto.cnpj = "10000";
			editDto.email = "email";
			editDto.telefone = "telefone";
			editDto.cep = "cepTeste";
			editDto.rua = "ruaTeste";
			editDto.numero = 25;
			editDto.bairro = "bairroTeste";
			editDto.cidade = "cidadeTeste";
			editDto.uf = "SP";
			
			cliente = apiServico.editCliente(id_cliente, editDto);
			System.out.println(cliente);
			
			System.out.println("==================================================\n");
			criarCliente.name = "Kymera Corp";
			criarCliente.cnpj = "1002312300";
			criarCliente.email = "kymera@gmail.com";
			criarCliente.telefone = "telefoneKy";
			criarCliente.cep = "cepTeste";
			criarCliente.rua = "Rua Aspasia";
			criarCliente.numero = 130;
			criarCliente.bairro = "bairro Kymera";
			criarCliente.cidade = "Kymera city";
			criarCliente.uf = "SP";
			criarCliente.senha = "kymera123";
			
			cliente = apiServico.criarCliente(criarCliente);
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
