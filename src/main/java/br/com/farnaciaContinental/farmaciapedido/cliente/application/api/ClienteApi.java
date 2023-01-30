package br.com.farnaciaContinental.farmaciapedido.cliente.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cliente")
public interface ClienteApi {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	ClienteResponse postCliente(@Valid @RequestBody ClienteRequest clienteRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<ClienteListResponse> getTodosClientes();
	
	@GetMapping("/{idCliente}")
	@ResponseStatus(code = HttpStatus.OK)
	ClienteDetalhadoResponse getClienteAtravesId(@PathVariable UUID idCliente);
	
	@DeleteMapping("/{idCliente}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaClienteAtravesId(@PathVariable UUID idCliente);
	
	@PatchMapping("/{idCliente}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void patchAlteraCliente(@PathVariable UUID idCliente,
			@Valid @RequestBody ClienteAlteracaoRequest clienteAlteracaoRequest);
}