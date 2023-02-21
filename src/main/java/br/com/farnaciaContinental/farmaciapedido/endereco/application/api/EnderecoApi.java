package br.com.farnaciaContinental.farmaciapedido.endereco.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/{idCliente}/endereco")
public interface EnderecoApi {

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	EnderecoResponse postEndreco(@PathVariable UUID idCliente, @Valid @RequestBody EnderecoRequest EnderecoRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	List<EnderecoListResponse> getTodosEndrecoCliente(@PathVariable UUID idCliente);
	
	@GetMapping("/{idEndereco}")
	@ResponseStatus(code = HttpStatus.CREATED)
	EnderecoDetalhadoResponse getEnderecoComId(@PathVariable UUID idCliente, @PathVariable UUID idEndereco);
	
	@DeleteMapping("/{idEndereco}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaEnderecoAtravesId(@PathVariable UUID idCliente, @PathVariable UUID idEndereco);
	
	@PatchMapping("/{idEndereco}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void patchAlteraEndereco(@PathVariable UUID idCliente,@PathVariable UUID idEndereco,
			@Valid @RequestBody EnderecoAlteracaoRequest enderecoAlteracaoRequest);
}
