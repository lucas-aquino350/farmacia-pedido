package br.com.farnaciaContinental.farmaciapedido.cliente.application.api;

import java.time.LocalDate;
import java.util.List;

import lombok.Value;

@Value
public class ClienteListResponse {
	private String nomeCompleto;
	private String cpf;
	private String email;
	private String celular;
	private LocalDate dataDeNascimento;
	public static List<ClienteListResponse> converte(List<ClienteListResponse> clientes) {
		
		return null;
	}
	}
