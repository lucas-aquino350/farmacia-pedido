package br.com.farnaciaContinental.farmaciapedido.cliente.application.service;

import java.util.List;

import javax.validation.Valid;

import br.com.farnaciaContinental.farmaciapedido.cliente.application.api.ClienteListResponse;
import br.com.farnaciaContinental.farmaciapedido.cliente.application.api.ClienteRequest;
import br.com.farnaciaContinental.farmaciapedido.cliente.application.api.ClienteResponse;

public interface ClienteService {

	ClienteResponse criaCliente(@Valid ClienteRequest clienteRequest);

	List<ClienteListResponse> buscaTodosClientes();

}
