package br.com.farnaciaContinental.farmaciapedido.endereco.application.api;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

import br.com.farnaciaContinental.farmaciapedido.endereco.domain.Tipo;
import lombok.Value;

@Value
public class EnderecoRequest {
	
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
}