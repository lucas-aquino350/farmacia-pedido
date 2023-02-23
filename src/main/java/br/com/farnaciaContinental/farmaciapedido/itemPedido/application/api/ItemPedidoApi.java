package br.com.farnaciaContinental.farmaciapedido.itemPedido.application.api;

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
@RequestMapping("/v1/{idCliente}/itemPedido")
public interface ItemPedidoApi {

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	ItemPedidoResponse postItemPedido(@PathVariable UUID idCliente, @Valid @RequestBody ItemPedidoRequest itemPedidoRequest);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<ItemPedidoListResponse> getTodosItemPedidoCliente(@PathVariable UUID idCliente);
	
	@GetMapping("/{idItemPedido}")
	@ResponseStatus(code = HttpStatus.OK)
	ItemPedidoDetalhadoResponse getItemPedidoComId(@PathVariable UUID idCliente, @PathVariable UUID idItemPedido);
	
	@DeleteMapping("/{idItemPedido}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaItemPedidoAtravesId(@PathVariable UUID idCliente, @PathVariable UUID idItemPedido);
	
	@PatchMapping("/{idItemPedido}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void patchAlteraItemDoPedido(@PathVariable UUID idCliente,@PathVariable UUID idItemPedido,
			@Valid @RequestBody ItemDoPedidoAlteracaoRequest ItemDoPedidoAlteracaoRequest);
}