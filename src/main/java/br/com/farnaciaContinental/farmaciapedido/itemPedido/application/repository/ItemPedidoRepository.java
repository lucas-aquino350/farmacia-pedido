package br.com.farnaciaContinental.farmaciapedido.itemPedido.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.farnaciaContinental.farmaciapedido.itemPedido.domain.ItemDoPedido;

public interface ItemPedidoRepository {

	ItemDoPedido salva(ItemDoPedido itemDoPedido);

	List<ItemDoPedido> buscaItensPedidoClienteComId(UUID idCliente);

	ItemDoPedido buscaItem(UUID idItemPedido);

	void deleta(ItemDoPedido item);

}