package br.com.farnaciaContinental.farmaciapedido.endereco.application.api;

import java.util.UUID;

import br.com.farnaciaContinental.farmaciapedido.endereco.domain.Tipo;
import lombok.Value;

@Value
public class EnderecoDetalhadoResponse {

	private UUID idEndereco;
	private Tipo tipoEndereco;
	private String rua;
	private String numeroDaCasa;
	private String complemento;
	private String bairro;
	private String cidade;
}