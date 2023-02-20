package br.com.farnaciaContinental.farmaciapedido.endereco.application.api;

import java.util.List;
import java.util.UUID;

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

	@Override
	public List<EnderecoListResponse> getTodosEndrecoCliente(UUID idCliente) {
		log.info("[start] EnderecoController - getTodosEndrecoCliente");
		log.info("[finish] EnderecoController - getTodosEndrecoCliente");
		return null;
	}
}