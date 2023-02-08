package br.com.farnaciaContinental.farmaciapedido.medicamento.application.api;

import java.time.LocalDate;
import br.com.farnaciaContinental.farmaciapedido.medicamento.domain.Grupo;
import lombok.Value;

@Value
public class MedicamentoAlteracaoRequest {
	private String nomeComercial;
	private String principioAtivo;
    private String laboratorio;
	private Grupo grupo;
	private String lote;
	private LocalDate dataDeValidade;
	private LocalDate dataDeFabricacao;
}