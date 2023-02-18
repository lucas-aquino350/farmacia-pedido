package br.com.farnaciaContinental.farmaciapedido.endereco.application.service;

import org.springframework.stereotype.Service;

import br.com.farnaciaContinental.farmaciapedido.endereco.application.api.EnderecoRequest;
import br.com.farnaciaContinental.farmaciapedido.endereco.application.api.EnderecoResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class EnderecoApplicationService implements EnderecoService {

	@Override
	public EnderecoResponse criaEndereco(EnderecoRequest enderecoRequest) {
		log.info("[start] EnderecoApplicationService - criaEndereco");
		log.info("[finish] EnderecoApplicationService - criaEndereco");
		return null;
	}

}
