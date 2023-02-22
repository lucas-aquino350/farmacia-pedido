package br.com.farnaciaContinental.farmaciapedido.itemPedido.domain;

import java.util.UUID;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.farnaciaContinental.farmaciapedido.itemPedido.application.api.ItemPedidoRequest;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collection = "ItensDoPedido")
public class ItemDoPedido {

	@Id
	private UUID idItemPedido;
	private UUID idCliente;
	@NotNull
	private UUID idMedicamento;
	@NotNull
	private Integer quantidade;
	
	
	public ItemDoPedido(ItemPedidoRequest itemPedidoRequest) {
		this.idItemPedido = UUID.randomUUID();
		this.idMedicamento = itemPedidoRequest.getIdMedicamento();
		this.quantidade = itemPedidoRequest.getQuantidade();
	}
}