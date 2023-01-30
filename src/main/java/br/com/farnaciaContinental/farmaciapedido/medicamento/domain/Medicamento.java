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
	@NotBlank
	private Grupo grupo;
	@NotBlank
	private String lote;
	@NotNull
	private LocalDate dataDeValidade;
	@NotNull
	private LocalDate dataDeFabricação;
	
	public Medicamento(String nomeComercial, @NotBlank String principioAtivo, @NotBlank String laboratorio,
			@NotBlank Grupo grupo, @NotBlank String lote, @NotNull LocalDate dataDeValidade,
			@NotNull LocalDate dataDeFabricação) {
		this.nomeComercial = nomeComercial;
		this.principioAtivo = principioAtivo;
		this.laboratorio = laboratorio;
		this.grupo = grupo;
		this.lote = lote;
		this.dataDeValidade = dataDeValidade;
		this.dataDeFabricação = dataDeFabricação;
	}
}