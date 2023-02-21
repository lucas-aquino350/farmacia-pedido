package br.com.farnaciaContinental.farmaciapedido.itemPedido.application.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class ItemPedidoController implements ItemPedidoApi {

	@Override
	public ItemPedidoResponse postItemPedido(@Valid ItemPedidoRequest itemPedidoRequest) {
	log.info("[start] ItemPedidoController - postItemPedido");
	log.info("[finish] ItemPedidoController - postItemPedido");
		return null;
	}
}