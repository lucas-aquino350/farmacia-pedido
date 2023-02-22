package br.com.farnaciaContinental.farmaciapedido.itemPedido.application.service;

import java.util.List;
import java.util.UUID;

import br.com.farnaciaContinental.farmaciapedido.itemPedido.application.api.ItemPedidoDetalhadoResponse;
import br.com.farnaciaContinental.farmaciapedido.itemPedido.application.api.ItemPedidoRequest;
import br.com.farnaciaContinental.farmaciapedido.itemPedido.application.api.ItemPedidoResponse;

public interface ItemPedidoService {

	ItemPedidoResponse criaItem(UUID idCliente, ItemPedidoRequest itemPedidoRequest);

	List<ItemPedidoDetalhadoResponse> buscaTodosItemPedido(UUID idCliente);

}
