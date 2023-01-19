package br.com.farnaciaContinental.farmaciapedido.cliente.application.api;

import java.time.LocalDate;
import java.util.UUID;

import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String email;
	private String celular;
	private LocalDate dataDeNascimento;

}
