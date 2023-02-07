package br.com.farnaciaContinental.farmaciapedido.medicamento.application.api;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/medicamento")
public interface MedicamentoApi {

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	MedicamentoResponse postMedicamento(@Valid @RequestBody MedicamentoRequest medicamentoRequest);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<MedicamentoListResponse> getTodosMedicamento();
}