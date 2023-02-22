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
	public List<ItemPedidoListResponse> getTodosItemPedidoCliente(UUID idCliente) {
		log.info("[start] ItemPedidoController - getTodosItemPedidoCliente");
		log.info("[idCliente] {}", idCliente);
		List<ItemPedidoListResponse> itensPedido = itemPedidoService.buscaItensPedidoClienteComId(idCliente);
		log.info("[finish] ItemPedidoController - getTodosItemPedidoCliente");
		return itensPedido;
	}

	@Override
	public ItemPedidoDetalhadoResponse getItemPedidoComId(UUID idCliente, UUID idItemPedido) {
		log.info("[start] ItemPedidoController -  getItemPedidoComId");
		log.info("[idCliente] {}", idCliente);
		ItemPedidoDetalhadoResponse item = itemPedidoService.buscaItemComId(idCliente, idItemPedido);
		log.info("[finish] ItemPedidoController -  getItemPedidoComId");
		return item;
	}

	@Override
	public void deletaItemPedidoAtravesId(UUID idCliente, UUID idItemPedido) {
		log.info("[start] ItemPedidoController -  deletaItemPedidoAtravesId");
		log.info("[idCliente] {} - [idItemPedido] {}", idCliente, idItemPedido);
		itemPedidoService.deletaItemPedido(idCliente, idItemPedido);
		log.info("[finish] ItemPedidoController -  deletaItemPedidoAtravesId");
	}
}