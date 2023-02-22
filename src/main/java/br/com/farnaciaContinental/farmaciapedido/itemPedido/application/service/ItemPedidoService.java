package br.com.farnaciaContinental.farmaciapedido.itemPedido.application.service;

import java.util.UUID;

import br.com.farnaciaContinental.farmaciapedido.itemPedido.application.api.ItemPedidoRequest;
import br.com.farnaciaContinental.farmaciapedido.itemPedido.application.api.ItemPedidoResponse;

public interface ItemPedidoService {

	ItemPedidoResponse criaItem(UUID idCliente,UUID idMedicamento, ItemPedidoRequest itemPedidoRequest);

}
