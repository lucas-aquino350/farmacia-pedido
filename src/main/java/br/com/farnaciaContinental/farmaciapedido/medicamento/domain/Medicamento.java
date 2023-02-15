package br.com.farnaciaContinental.farmaciapedido.medicamento.domain;

import java.time.LocalDate;
import java.util.UUID;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import br.com.farnaciaContinental.farmaciapedido.medicamento.application.api.MedicamentoAlteracaoRequest;
import br.com.farnaciaContinental.farmaciapedido.medicamento.application.api.MedicamentoRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collection = "Medicamento")
public class Medicamento {
	@Id
	private UUID idMedicamento;
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
	
	public Medicamento(MedicamentoRequest medicamentoRequest) {
		this.idMedicamento = UUID.randomUUID();
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