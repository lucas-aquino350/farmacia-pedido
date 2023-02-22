package br.com.farnaciaContinental.farmaciapedido.itemPedido.application.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.farnaciaContinental.farmaciapedido.itemPedido.application.repository.ItemPedidoRepository;
import br.com.farnaciaContinental.farmaciapedido.itemPedido.domain.ItemDoPedido;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ItemPedidoInfraRepository implements ItemPedidoRepository {

	private final ItemPedidoSpringMongoRepository itemPedidoSpringMongoRepository;

	@Override
	public ItemDoPedido salva(ItemDoPedido itemDoPedido) {
		log.info("[start]  ItemPedidoInfraRepository - salva");
		itemPedidoSpringMongoRepository.save(itemDoPedido);
		log.info("[finish]  ItemPedidoInfraRepository - salva");
		return itemDoPedido;
	}

	@Override
	public List<ItemDoPedido> buscaItensPedidoClienteComId(UUID idCliente) {
		log.info("[start]  ItemPedidoInfraRepository - buscaItensPedidoClienteComId");
		var itens = itemPedidoSpringMongoRepository.findByIdCliente(idCliente);
		log.info("[finish]  ItemPedidoInfraRepository - buscaItensPedidoClienteComId");
		return itens;
	}

}