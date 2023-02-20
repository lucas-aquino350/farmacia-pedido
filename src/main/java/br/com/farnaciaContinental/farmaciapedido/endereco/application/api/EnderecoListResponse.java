package br.com.farnaciaContinental.farmaciapedido.endereco.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.farnaciaContinental.farmaciapedido.endereco.domain.Endereco;
import br.com.farnaciaContinental.farmaciapedido.endereco.domain.Tipo;
import lombok.Value;

@Value
public class EnderecoListResponse {

	private UUID idEndereco;
	private Tipo tipoEndereco;
	private String rua;
	private String numeroDaCasa;
	private String complemento;
	private String bairro;
	private String cidade;
	
	public static List<EnderecoListResponse> converte(List<Endereco> enderecosDoCliente) {
		return enderecosDoCliente.stream().map(EnderecoListResponse::new).collect(Collectors.toList());
	}

	public EnderecoListResponse(Endereco endereco) {
		this.idEndereco = endereco.getIdEndereco();
		this.tipoEndereco = endereco.getTipoEndereco();
		this.rua = endereco.getRua();
		this.numeroDaCasa = endereco.getNumeroDaCasa();
		this.complemento = endereco.getComplemento();
		this.bairro = endereco.getBairro();
		this.cidade = endereco.getCidade();
	}
}