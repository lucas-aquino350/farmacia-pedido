package br.com.farnaciaContinental.farmaciapedido.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import br.com.farnaciaContinental.farmaciapedido.cliente.application.api.ClienteRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id",updatable=false,unique=true,nullable=false)
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
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.cpf = clienteRequest.getCpf();
		this.email = clienteRequest.getEmail();
		this.celular = clienteRequest.getCelular();
		this.dataDeNascimento = clienteRequest.getDataDeNascimento();
		this.sexo = clienteRequest.getSexo();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
}
