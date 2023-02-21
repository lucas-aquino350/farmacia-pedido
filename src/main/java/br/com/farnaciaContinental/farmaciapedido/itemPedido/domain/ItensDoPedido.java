package br.com.farnaciaContinental.farmaciapedido.itemPedido.domain;

import java.util.UUID;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collection = "ItensDoPedido")
public class ItensDoPedido {

	@Id
	private UUID idItemPedido;
	@NotNull
	private UUID idMedicamento;
	@NotNull
	private Integer quantidade;
	
	
	public ItensDoPedido(UUID idPedido, UUID idMedicamento, @NotNull Integer quantidade) {
		this.idItemPedido = UUID.randomUUID();
		this.idMedicamento = idMedicamento;
		this.quantidade = quantidade;
	}
}