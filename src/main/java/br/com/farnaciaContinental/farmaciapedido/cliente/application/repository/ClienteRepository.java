package br.com.farnaciaContinental.farmaciapedido.cliente.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.farnaciaContinental.farmaciapedido.cliente.domain.Cliente;

public interface ClienteRepository {

	Cliente salva(Cliente cliente);

	List<Cliente> buscaTodosClientes();

	Cliente buscaClienteAtravesId(UUID idCliente);

}
