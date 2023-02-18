package br.com.farnaciaContinental.farmaciapedido.endereco.application.api;

import org.springframework.web.bind.annotation.RestController;

import br.com.farnaciaContinental.farmaciapedido.endereco.application.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class EnderecoController implements EnderecoApi {

	private final EnderecoService enderecoService;

	@Override
	public EnderecoResponse postEndreco( EnderecoRequest enderecoRequest) {
	log.info("[start] EnderecoController - postEndreco");
	EnderecoResponse enderecoCriado = enderecoService.criaEndereco(enderecoRequest);
	log.info("[finish] EnderecoController - postEndreco");
		return enderecoCriado;
	}
}