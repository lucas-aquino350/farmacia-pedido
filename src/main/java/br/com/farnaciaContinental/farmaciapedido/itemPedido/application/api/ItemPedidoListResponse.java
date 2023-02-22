package br.com.farnaciaContinental.farmaciapedido.itemPedido.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.farnaciaContinental.farmaciapedido.itemPedido.domain.ItemDoPedido;
import lombok.Value;

@Value
public class ItemPedidoListResponse {

	private UUID idMedicamento;
	private Integer quantidade;
	
	public ItemPedidoListResponse(ItemDoPedido itemDoPedido) {
		this.idMedicamento = itemDoPedido.getIdMedicamento();
		this.quantidade = itemDoPedido.getQuantidade();
	}
	
	public static List<ItemPedidoListResponse> converte(List<ItemDoPedido> itens) {
		return itens.stream().map(ItemPedidoListResponse::new).collect(Collectors.toList());
	}	
}