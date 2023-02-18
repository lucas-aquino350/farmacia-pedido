package br.com.farnaciaContinental.farmaciapedido.endereco.application.service;

import br.com.farnaciaContinental.farmaciapedido.endereco.application.api.EnderecoRequest;
import br.com.farnaciaContinental.farmaciapedido.endereco.application.api.EnderecoResponse;

public interface EnderecoService {

	EnderecoResponse criaEndreco(EnderecoRequest enderecoRequest);

}