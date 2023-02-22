package br.com.farnaciaContinental.farmaciapedido.itemPedido.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.farnaciaContinental.farmaciapedido.itemPedido.application.api.ItemPedidoRequest;
import br.com.farnaciaContinental.farmaciapedido.itemPedido.application.api.ItemPedidoResponse;
import br.com.farnaciaContinental.farmaciapedido.itemPedido.application.repository.ItemPedidoRepository;
import br.com.farnaciaContinental.farmaciapedido.itemPedido.domain.ItemDoPedido;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ItemPedidoApplicationService implements ItemPedidoService {

	private final ItemPedidoRepository itemPedidoRepository;

	@Override
	public ItemPedidoResponse criaItem(UUID idCliente,UUID idMedicamento, ItemPedidoRequest itemPedidoRequest) {
		log.info("[start] ItemPedidoApplicationService - criaItem");
		ItemDoPedido  item = itemPedidoRepository.salva(new ItemDoPedido(itemPedidoRequest));
		log.info("[finish] ItemPedidoApplicationService - criaItem");
		return ItemPedidoResponse.builder().idItemPedido(item.getIdItemPedido()).build();
	}
}