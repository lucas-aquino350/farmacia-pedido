package br.com.farnaciaContinental.farmaciapedido.itemPedido.application.api;

import java.util.UUID;

import br.com.farnaciaContinental.farmaciapedido.itemPedido.domain.ItemDoPedido;
import lombok.Value;

@Value
public class ItemPedidoDetalhadoResponse {

	private UUID idMedicamento;
	private Integer quantidade;
	
	
	public ItemPedidoDetalhadoResponse(ItemDoPedido item) {
		this.idMedicamento = item.getIdMedicamento();
		this.quantidade = item.getQuantidade();
	}
}