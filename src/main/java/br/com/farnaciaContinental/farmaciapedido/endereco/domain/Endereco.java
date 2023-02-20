package br.com.farnaciaContinental.farmaciapedido.endereco.domain;

import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.farnaciaContinental.farmaciapedido.endereco.application.api.EnderecoRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collection = "Endereco")
public class Endereco {

	@Id
	private UUID idEndereco;
	@Indexed
	@NotNull
	private UUID idCliente;
	private Tipo tipoEndereco;
	@NotBlank
	private String rua;
	@NotBlank
	private String numeroDaCasa;
	private String complemento;
	@NotBlank
	private String bairro;
	@NotBlank
	private String cidade;
	
	public Endereco(EnderecoRequest enderecoRequest) {
		this.idEndereco = UUID.randomUUID();
		this.idCliente = enderecoRequest.getIdCliente();
		this.tipoEndereco = enderecoRequest.getTipoEndereco();
		this.rua = enderecoRequest.getRua();
		this.numeroDaCasa = enderecoRequest.getNumeroDaCasa();
		this.complemento = enderecoRequest.getComplemento();
		this.bairro = enderecoRequest.getBairro();
		this.cidade = enderecoRequest.getCidade();
	}
	
}
