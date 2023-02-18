package br.com.farnaciaContinental.farmaciapedido.endereco.application.service;

import org.springframework.stereotype.Service;

import br.com.farnaciaContinental.farmaciapedido.endereco.application.api.EnderecoRequest;
import br.com.farnaciaContinental.farmaciapedido.endereco.application.api.EnderecoResponse;
import br.com.farnaciaContinental.farmaciapedido.endereco.application.repository.EnderecoRepository;
import br.com.farnaciaContinental.farmaciapedido.endereco.domain.Endereco;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class EnderecoApplicationService implements EnderecoService {

	private final EnderecoRepository enderecoRepository;

	@Override
	public EnderecoResponse criaEndereco(EnderecoRequest enderecoRequest) {
		log.info("[start] EnderecoApplicationService - criaEndereco");
		Endereco endereco = enderecoRepository.salva(new Endereco(enderecoRequest));
		log.info("[finish] EnderecoApplicationService - criaEndereco");
		return EnderecoResponse.builder().idEndereco(endereco.getIdEndereco()).build() ;
	}

}
