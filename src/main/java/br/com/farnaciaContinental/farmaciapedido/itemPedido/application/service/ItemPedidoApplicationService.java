package br.com.farnaciaContinental.farmaciapedido.itemPedido.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.farnaciaContinental.farmaciapedido.cliente.application.service.ClienteService;
import br.com.farnaciaContinental.farmaciapedido.itemPedido.application.api.ItemPedidoListResponse;
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
	private final ClienteService clienteService;

	@Override
	public ItemPedidoResponse criaItem(UUID idCliente, ItemPedidoRequest itemPedidoRequest) {
		log.info("[start] ItemPedidoApplicationService - criaItem");
		clienteService.buscaClienteAtravesId(idCliente);
		ItemDoPedido  item = itemPedidoRepository.salva(new ItemDoPedido(idCliente,itemPedidoRequest));
		log.info("[finish] ItemPedidoApplicationService - criaItem");
		return ItemPedidoResponse.builder().idItemPedido(item.getIdItemPedido()).build();
	}

	@Override
	public List<ItemPedidoListResponse> buscaItensPedidoClienteComId(UUID idCliente) {
		log.info("[start] ItemPedidoApplicationService - buscaItensPedidoClienteComId");
		clienteService.buscaClienteAtravesId(idCliente);
		List<ItemDoPedido> itensDoPedido = itemPedidoRepository.buscaItensPedidoClienteComId(idCliente);
		log.info("[finish] ItemPedidoApplicationService - buscaItensPedidoClienteComId");
		return ItemPedidoListResponse.converte(itensDoPedido);
	}
}