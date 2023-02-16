package br.com.farnaciaContinental.farmaciapedido.endereco.domain;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collection = "Endereco")
public class Endereco {

	@Id
	private UUID idEndreco;
	@Indexed
	private UUID idCliente;
	private Tipo tipoEndreco;
	@NotBlank
	private String rua;
	@NotBlank
	private String numeroDaCasa;
	private String complemento;
	@NotBlank
	private String bairro;
	@NotBlank
	private String cidade;
	
	public Endereco(UUID idEndreco, UUID idCliente, Tipo tipoEndreco, @NotBlank String rua,
			@NotBlank String numeroDaCasa, String complemento, @NotBlank String bairro, @NotBlank String cidade) {
		this.idEndreco = UUID.randomUUID();
		this.idCliente = idCliente;
		this.tipoEndreco = tipoEndreco;
		this.rua = rua;
		this.numeroDaCasa = numeroDaCasa;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	
}
