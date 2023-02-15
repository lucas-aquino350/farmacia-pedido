package br.com.farnaciaContinental.farmaciapedido.cliente.application.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.farnaciaContinental.farmaciapedido.cliente.application.api.ClienteAlteracaoRequest;
import br.com.farnaciaContinental.farmaciapedido.cliente.application.repository.ClienteRepository;
import br.com.farnaciaContinental.farmaciapedido.cliente.domain.Cliente;
import br.com.farnaciaContinental.farmaciapedido.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
	private final ClienteMongoSpringRepository clienteMongoSpringRepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[start] ClienteInfraRepository - salva");
		try {
		clienteMongoSpringRepository.save(cliente);
		} catch (DataIntegrityViolationException e) {
			throw APIException.build(HttpStatus.BAD_REQUEST,"Existem dados duplicados");
	    }
		log.info("[finish] ClienteInfraRepository - salva");
		return cliente;
	}

	@Override
	public List<Cliente> buscaTodosClientes() {
		log.info("[start] ClienteInfraRepository - buscaTodosClientes");
		List<Cliente> todosClientes = clienteMongoSpringRepository.findAll();
		log.info("[finish] ClienteInfraRepository - buscaTodosClientes");
		return todosClientes;
	}

	@Override
	public Cliente buscaClienteAtravesId(UUID idCliente) {
		log.info("[start] ClienteInfraRepository - buscaClienteAtravesId");
		Cliente cliente = clienteMongoSpringRepository.findById(idCliente)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Cliente não Encontrado"));
		log.info("[finish] ClienteInfraRepository - buscaClienteAtravesId");
		return cliente;
	}

	@Override
	public void deletaClienteAtravesId(Cliente cliente) {
		log.info("[start] ClienteInfraRepository - deletaClienteAtravesId");
		clienteMongoSpringRepository.delete(cliente);
		log.info("[start] ClienteInfraRepository - deletaClienteAtravesId");
	}

	@Override
	public void patchAlteraCliente(ClienteAlteracaoRequest clienteAlteracaoRequest) {
		log.info("[start] ClienteInfraRepository - patchAlteraCliente");
		log.info("[start] ClienteInfraRepository - patchAlteraCliente");
	}
}