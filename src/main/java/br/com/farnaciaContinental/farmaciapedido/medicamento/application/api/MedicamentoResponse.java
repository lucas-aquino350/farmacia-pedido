package br.com.farnaciaContinental.farmaciapedido.medicamento.application.api;

import java.util.UUID;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class MedicamentoResponse {
	private UUID idMedicamento;
}