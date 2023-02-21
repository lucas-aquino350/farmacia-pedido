package br.com.farnaciaContinental.farmaciapedido.endereco.application.service;

import java.util.List;
import java.util.UUID;

import br.com.farnaciaContinental.farmaciapedido.endereco.application.api.EnderecoDetalhadoResponse;
import br.com.farnaciaContinental.farmaciapedido.endereco.application.api.EnderecoListResponse;
import br.com.farnaciaContinental.farmaciapedido.endereco.application.api.EnderecoRequest;
import br.com.farnaciaContinental.farmaciapedido.endereco.application.api.EnderecoResponse;

public interface EnderecoService {

	EnderecoResponse criaEndereco(UUID idCliente, EnderecoRequest enderecoRequest);
	List<EnderecoListResponse> buscaEnderecosDoClienteComId(UUID idCliente);
	EnderecoDetalhadoResponse buscaEnderecoComId(UUID idCliente, UUID idEndereco);
	void deletaEnderecoAtravesId(UUID idCliente, UUID idEndereco);
}