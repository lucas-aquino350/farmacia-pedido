package br.com.farnaciaContinental.farmaciapedido.cliente.domain;

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
	private LocalDateTime dataDeNascimento;
	private Sexo sexo;
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	public Cliente(@NotBlank String nomeCompleto, @NotBlank @CPF String cpf, @Email @NotBlank String email,
			@NotBlank String celular, @NotNull LocalDateTime dataDeNascimento, Sexo sexo,
			LocalDateTime dataHoraDoCadastro) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.email = email;
		this.celular = celular;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
}
