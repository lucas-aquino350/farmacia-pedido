package br.com.farnaciaContinental.farmaciapedido.itemPedido.application.api;

import java.util.List;
import java.util.UUID;

import br.com.farnaciaContinental.farmaciapedido.itemPedido.domain.ItemDoPedido;
import lombok.Value;

@Value
public class ItemPedidoListResponse {

	private UUID idMedicamento;
	private Integer quantidade;
	
	public static List<ItemPedidoListResponse> converte(List<ItemDoPedido> itens) {
		return null;
	}
}