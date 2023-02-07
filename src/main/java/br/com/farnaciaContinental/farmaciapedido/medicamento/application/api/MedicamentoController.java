package br.com.farnaciaContinental.farmaciapedido.medicamento.application.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.farnaciaContinental.farmaciapedido.medicamento.application.service.MedicamentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class MedicamentoController implements MedicamentoApi {

	private final MedicamentoService medicamentoService;

	@Override
	public MedicamentoResponse postMedicamento(@Valid MedicamentoRequest medicamentoRequest) {
		log.info("[inicia] MedicamentoController - postMedicamento");
		MedicamentoResponse medicamentoCriado = medicamentoService.criaMedicamento(medicamentoRequest);
		log.info("[finaliza] MedicamentoController - postMedicamento");
		return medicamentoCriado;
	}

	@Override
	public List<MedicamentoListResponse> getTodosMedicamento() {
		log.info("[inicia] MedicamentoController - getTodosMedicamento");
		log.info("[finaliza] MedicamentoController - getTodosMedicamento");
		return null;
	}
}