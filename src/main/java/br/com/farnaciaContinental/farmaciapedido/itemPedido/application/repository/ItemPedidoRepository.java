package br.com.farnaciaContinental.farmaciapedido.itemPedido.application.repository;

import java.util.List;

import br.com.farnaciaContinental.farmaciapedido.itemPedido.domain.ItemDoPedido;

public interface ItemPedidoRepository {

	ItemDoPedido salva(ItemDoPedido itemDoPedido);

	List<ItemDoPedido> buscaTodosItens();

}
