package br.com.farnaciaContinental.farmaciapedido.cliente.application.api;

import java.time.LocalDate;

import lombok.Value;

@Value
public class ClienteListResponse {
	private String nomeCompleto;
	private String cpf;
	private String email;
	private String celular;
	private LocalDate dataDeNascimento;
	}
