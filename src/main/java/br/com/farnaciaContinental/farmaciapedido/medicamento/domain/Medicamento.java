package br.com.farnaciaContinental.farmaciapedido.medicamento.domain;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.farnaciaContinental.farmaciapedido.medicamento.application.api.MedicamentoAlteracaoRequest;
import br.com.farnaciaContinental.farmaciapedido.medicamento.application.api.MedicamentoRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Medicamento {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name="idMedicamento",updatable=false,unique=true,nullable=false)
	private UUID idMedicamento;
	private String nomeComercial;
	@NotBlank
	private String principioAtivo;
	@NotBlank
    private String laboratorio;
	private Grupo grupo;
	@NotBlank
	@Column(unique = true)
	private String lote;
	@NotNull
	private LocalDate dataDeValidade;
	@NotNull
	private LocalDate dataDeFabricacao;
	
	public Medicamento(MedicamentoRequest medicamentoRequest) {
		this.nomeComercial = medicamentoRequest.getNomeComercial();
		this.principioAtivo = medicamentoRequest.getPrincipioAtivo();
		this.laboratorio = medicamentoRequest.getLaboratorio();
		this.grupo = medicamentoRequest.getGrupo();
		this.lote = medicamentoRequest.getLote();
		this.dataDeValidade = medicamentoRequest.getDataDeValidade();
		this.dataDeFabricacao = medicamentoRequest.getDataDeFabricacao();
	}

	public void altera(MedicamentoAlteracaoRequest medicamentoAlteracaoRequest) {
		this.nomeComercial = medicamentoAlteracaoRequest.getNomeComercial();
		this.principioAtivo = medicamentoAlteracaoRequest.getPrincipioAtivo();
		this.laboratorio = medicamentoAlteracaoRequest.getLaboratorio();
		this.grupo = medicamentoAlteracaoRequest.getGrupo();
		this.lote = medicamentoAlteracaoRequest.getLote();
		this.dataDeValidade = medicamentoAlteracaoRequest.getDataDeValidade();
		this.dataDeFabricacao = medicamentoAlteracaoRequest.getDataDeFabricacao();
	}
}