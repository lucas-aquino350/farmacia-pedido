package br.com.farnaciaContinental.farmaciapedido.itemPedido.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.farnaciaContinental.farmaciapedido.itemPedido.application.service.ItemPedidoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ItemPedidoController implements ItemPedidoApi {


	private final ItemPedidoService itemPedidoService;

	@Override
	public ItemPedidoResponse postItemPedido( UUID idCliente, ItemPedidoRequest itemPedidoRequest) {
	log.info("[start] ItemPedidoController - postItemPedido");
	log.info("[idCliente] {}", idCliente);
	ItemPedidoResponse itemCriado = itemPedidoService.criaItem(idCliente, itemPedidoRequest);
	log.info("[finish] ItemPedidoController - postItemPedido");
		return itemCriado;
	}

	@Override
	public List<ItemPedidoDetalhadoResponse> getTodosItemPedido(UUID idCliente) {
		log.info("[start] ItemPedidoController - getTodosItemPedido");
		log.info("[idCliente] {}", idCliente);
		log.info("[finish] ItemPedidoController - getTodosItemPedido");
		return null;
	}
}