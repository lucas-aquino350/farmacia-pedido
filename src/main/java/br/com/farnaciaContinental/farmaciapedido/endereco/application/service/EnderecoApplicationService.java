package br.com.farnaciaContinental.farmaciapedido.endereco.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.farnaciaContinental.farmaciapedido.cliente.application.service.ClienteService;
import br.com.farnaciaContinental.farmaciapedido.endereco.application.api.EnderecoListResponse;
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
	private final ClienteService clienteService;

	@Override
	public EnderecoResponse criaEndereco(UUID idCliente, EnderecoRequest enderecoRequest) {
		log.info("[start] EnderecoApplicationService - criaEndereco");
		clienteService.buscaClienteAtravesId(idCliente);
		Endereco endereco = enderecoRepository.salva(new Endereco(enderecoRequest));
		log.info("[finish] EnderecoApplicationService - criaEndereco");
		return EnderecoResponse.builder().idEndereco(endereco.getIdEndereco()).build() ;
	}

	@Override
	public List<EnderecoListResponse> buscaEnderecosDoClienteComId(UUID idCliente) {
		log.info("[start] EnderecoApplicationService - buscaEnderecosDoClienteComId");
		clienteService.buscaClienteAtravesId(idCliente); 
		List<Endereco> enderecosDoCliente = enderecoRepository.buscaEnderecosDoClienteComId(idCliente);
		log.info("[finish] EnderecoApplicationService - buscaEnderecosDoClienteComId");
		return EnderecoListResponse.converte(enderecosDoCliente);
	}
}