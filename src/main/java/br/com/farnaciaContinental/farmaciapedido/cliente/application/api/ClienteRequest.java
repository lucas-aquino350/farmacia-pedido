package br.com.farnaciaContinental.farmaciapedido.cliente.application.api;

import java.time.LocalDateTime;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;
import br.com.farnaciaContinental.farmaciapedido.cliente.domain.Sexo;
import lombok.Value;
@Value
public class ClienteRequest {
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
}
