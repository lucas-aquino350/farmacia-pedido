package br.com.farnaciaContinental.farmaciapedido.cliente.application.repository;

import java.util.List;

import br.com.farnaciaContinental.farmaciapedido.cliente.application.api.ClienteListResponse;
import br.com.farnaciaContinental.farmaciapedido.cliente.domain.Cliente;

public interface ClienteRepository {

	Cliente salva(Cliente cliente);

	List<ClienteListResponse> buscaTodosClientes();

}
