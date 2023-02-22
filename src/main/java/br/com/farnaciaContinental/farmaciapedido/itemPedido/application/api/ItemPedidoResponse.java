package br.com.farnaciaContinental.farmaciapedido.itemPedido.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ItemPedidoResponse {
	private UUID idItemPedido;
}
