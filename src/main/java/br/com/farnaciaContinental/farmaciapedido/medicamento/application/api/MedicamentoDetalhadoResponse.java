package br.com.farnaciaContinental.farmaciapedido.medicamento.application.api;

import java.time.LocalDate;
import java.util.UUID;
import br.com.farnaciaContinental.farmaciapedido.medicamento.domain.Grupo;
import br.com.farnaciaContinental.farmaciapedido.medicamento.domain.Medicamento;
import lombok.Value;

@Value
public class MedicamentoDetalhadoResponse {
	
	private UUID idMedicamento;
	private String nomeComercial;
	private String principioAtivo;
    private String laboratorio;
	private Grupo grupo;
	private String lote;
	private LocalDate dataDeValidade;
	private LocalDate dataDeFabricacao;
	
	public MedicamentoDetalhadoResponse(Medicamento medicamento) {
		this.idMedicamento = medicamento.getIdMedicamento();
		this.nomeComercial = medicamento.getNomeComercial();
		this.principioAtivo = medicamento.getPrincipioAtivo();
		this.laboratorio = medicamento.getLaboratorio();
		this.grupo = medicamento.getGrupo();
		this.lote = medicamento.getLote();
		this.dataDeValidade = medicamento.getDataDeValidade();
		this.dataDeFabricacao = medicamento.getDataDeFabricacao();
	}
}