package br.com.farnaciaContinental.farmaciapedido.medicamento.application.api;

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
@RequestMapping("v1/medicamento")
public interface MedicamentoApi {

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	MedicamentoResponse postMedicamento(@Valid @RequestBody MedicamentoRequest medicamentoRequest);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<MedicamentoListResponse> getTodosMedicamento();

	@GetMapping("/{idMedicamento}")
	@ResponseStatus(code = HttpStatus.OK)
	MedicamentoDetalhadoResponse getMedicamentoAtravesId(@PathVariable UUID idMedicamento);

	@DeleteMapping("/{idMedicamento}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletatMedicamentoAtravesId(@PathVariable UUID idMedicamento);

	@PatchMapping("/{idMedicamento}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void patchAlteraMedicamento(@PathVariable UUID idMedicamento,
			@Valid @RequestBody MedicamentoAlteracaoRequest medicamentoAlteracaoRequest);
}