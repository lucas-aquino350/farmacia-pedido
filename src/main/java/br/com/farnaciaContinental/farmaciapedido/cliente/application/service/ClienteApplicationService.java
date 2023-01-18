package br.com.farnaciaContinental.farmaciapedido.cliente.application.service;

import org.springframework.stereotype.Service;

import br.com.farnaciaContinental.farmaciapedido.cliente.application.api.ClienteRequest;
import br.com.farnaciaContinental.farmaciapedido.cliente.application.api.ClienteResponse;
import br.com.farnaciaContinental.farmaciapedido.cliente.application.repository.ClienteRepository;
import br.com.farnaciaContinental.farmaciapedido.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {

	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[start] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finish] ClienteApplicationService - criaCliente");
		return ClienteResponse.builder().idCliente(cliente.getIdCliente()).build();
	}
}