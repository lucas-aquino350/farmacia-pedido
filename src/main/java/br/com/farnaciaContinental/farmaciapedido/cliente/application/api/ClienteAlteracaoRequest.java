package br.com.farnaciaContinental.farmaciapedido.cliente.application.api;

import java.time.LocalDate;
import br.com.farnaciaContinental.farmaciapedido.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteAlteracaoRequest {
	private String nomeCompleto;
	private String celular;
	private LocalDate dataDeNascimento;
	private Sexo sexo;
}