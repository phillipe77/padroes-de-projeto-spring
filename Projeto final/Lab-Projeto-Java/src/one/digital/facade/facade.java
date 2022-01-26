package one.digital.facade;

import subsistema1.CrmService;
import subsistema2.CepApi;

public class facade {
	
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
	
		
		CrmService.gravarCliente(nome, cep, estado, cidade);
		
	}

}
