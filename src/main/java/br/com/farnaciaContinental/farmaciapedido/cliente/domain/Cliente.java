package br.com.farnaciaContinental.farmaciapedido.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import br.com.farnaciaContinental.farmaciapedido.cliente.application.api.ClienteAlteracaoRequest;
import br.com.farnaciaContinental.farmaciapedido.cliente.application.api.ClienteRequest;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collection = "Cliente")
public class Cliente {
	@Id
	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@CPF
	private String cpf;
	@Email	
	@NotBlank
	private String email;
	@NotBlank
	private String celular;
	@NotNull
	private LocalDate dataDeNascimento;
	private Sexo sexo;
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	public Cliente( ClienteRequest clienteRequest) {
		this.idCliente = UUID.randomUUID();
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.cpf = clienteRequest.getCpf();
		this.email = clienteRequest.getEmail();
		this.celular = clienteRequest.getCelular();
		this.dataDeNascimento = clienteRequest.getDataDeNascimento();
		this.sexo = clienteRequest.getSexo();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

	public void altera(ClienteAlteracaoRequest clienteAlteracaoRequest) {
		this.nomeCompleto = clienteAlteracaoRequest.getNomeCompleto();
		this.celular = clienteAlteracaoRequest.getCelular();
		this.dataDeNascimento = clienteAlteracaoRequest.getDataDeNascimento();
		this.sexo = clienteAlteracaoRequest.getSexo();
		this.dataHoraDaUltimaAlteracao = LocalDateTime.now();
	}
}