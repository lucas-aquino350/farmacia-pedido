package br.com.farnaciaContinental.farmaciapedido.cliente.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.farnaciaContinental.farmaciapedido.cliente.domain.Cliente;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String email;
	private String celular;
	private LocalDate dataDeNascimento;
	
	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.cpf = cliente.getCpf();
		this.email = cliente.getEmail();
		this.celular = cliente.getCelular();
		this.dataDeNascimento = cliente.getDataDeNascimento();
	}
	
	

}
