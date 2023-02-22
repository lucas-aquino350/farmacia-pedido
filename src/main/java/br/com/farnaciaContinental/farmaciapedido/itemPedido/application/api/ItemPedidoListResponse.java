package br.com.farnaciaContinental.farmaciapedido.itemPedido.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.farnaciaContinental.farmaciapedido.itemPedido.domain.ItemDoPedido;
import lombok.Value;

@Value
public class ItemPedidoListResponse {
	
	private UUID idItemPedido;
	private UUID idMedicamento;
	private Integer quantidade;

	public static List<ItemPedidoListResponse> converte(List<ItemDoPedido> itensDoPedido) {
		return itensDoPedido.stream().map(ItemPedidoListResponse::new).collect(Collectors.toList());
	}

	public ItemPedidoListResponse(ItemDoPedido itemDoPedido) {
		this.idItemPedido = itemDoPedido.getIdItemPedido();
		this.idMedicamento = itemDoPedido.getIdMedicamento();
		this.quantidade = itemDoPedido.getQuantidade();
	}
}