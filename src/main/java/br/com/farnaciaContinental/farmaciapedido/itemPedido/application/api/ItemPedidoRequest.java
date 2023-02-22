package br.com.farnaciaContinental.farmaciapedido.itemPedido.application.api;

import java.util.UUID;

import javax.validation.constraints.NotNull;

import lombok.Value;

@Value
public class ItemPedidoRequest {
	@NotNull
	private UUID idMedicamento;
	@NotNull
	private Integer quantidade;
}