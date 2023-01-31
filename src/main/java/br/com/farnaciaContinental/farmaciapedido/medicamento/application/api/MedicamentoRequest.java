package br.com.farnaciaContinental.farmaciapedido.medicamento.application.api;

import java.time.LocalDate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import br.com.farnaciaContinental.farmaciapedido.medicamento.domain.Grupo;
import lombok.Value;

@Value
public class MedicamentoRequest {
	private String nomeComercial;
	@NotBlank
	private String principioAtivo;
	@NotBlank
    private String laboratorio;
	private Grupo grupo;
	@NotBlank
	private String lote;
	@NotNull
	private LocalDate dataDeValidade;
	@NotNull
	private LocalDate dataDeFabricacao;
}