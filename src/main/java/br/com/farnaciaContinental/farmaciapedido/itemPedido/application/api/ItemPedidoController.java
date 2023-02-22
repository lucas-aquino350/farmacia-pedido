package br.com.farnaciaContinental.farmaciapedido.itemPedido.application.api;

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
	public ItemPedidoResponse postItemPedido( UUID idCliente,UUID idMedicamento, ItemPedidoRequest itemPedidoRequest) {
	log.info("[start] ItemPedidoController - postItemPedido");
	log.info("[idCliente] {} - [idMedicamento] {}", idCliente, idMedicamento);
	ItemPedidoResponse itemCriado = itemPedidoService.criaItem(idCliente,idMedicamento, itemPedidoRequest);
	log.info("[finish] ItemPedidoController - postItemPedido");
		return itemCriado;
	}
}