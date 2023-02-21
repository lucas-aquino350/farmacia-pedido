package br.com.farnaciaContinental.farmaciapedido.endereco.application.api;

import java.util.UUID;

import br.com.farnaciaContinental.farmaciapedido.endereco.domain.Endereco;
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
	
	public EnderecoDetalhadoResponse(Endereco endereco) {
		this.idEndereco = endereco.getIdEndereco();
		this.tipoEndereco = endereco.getTipoEndereco();
		this.rua = endereco.getRua();
		this.numeroDaCasa = endereco.getNumeroDaCasa();
		this.complemento = endereco.getComplemento();
		this.bairro = endereco.getBairro();
		this.cidade = endereco.getCidade();
	}
}