package br.com.farnaciaContinental.farmaciapedido.itemPedido.application.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.farnaciaContinental.farmaciapedido.itemPedido.domain.ItemDoPedido;

public interface ItemPedidoSpringMongoRepository extends MongoRepository<ItemDoPedido, UUID> {

List<ItemDoPedido> findByIdCliente(UUID idCliente);
	
}