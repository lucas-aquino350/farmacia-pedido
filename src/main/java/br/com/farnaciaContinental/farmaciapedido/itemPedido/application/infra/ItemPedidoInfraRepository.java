package br.com.farnaciaContinental.farmaciapedido.itemPedido.application.infra;

import org.springframework.stereotype.Repository;

import br.com.farnaciaContinental.farmaciapedido.itemPedido.application.repository.ItemPedidoRepository;
import br.com.farnaciaContinental.farmaciapedido.itemPedido.domain.ItemDoPedido;

@Repository
public class ItemPedidoInfraRepository implements ItemPedidoRepository {

	@Override
	public ItemDoPedido salva(ItemDoPedido itemDoPedido) {
		return null;
	}
}