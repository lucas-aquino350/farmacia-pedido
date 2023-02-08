package br.com.farnaciaContinental.farmaciapedido.medicamento.application.api;

import java.util.List;
import java.util.UUID;

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
		log.info("[start] MedicamentoController - postMedicamento");
		MedicamentoResponse medicamentoCriado = medicamentoService.criaMedicamento(medicamentoRequest);
		log.info("[finish] MedicamentoController - postMedicamento");
		return medicamentoCriado;
	}

	@Override
	public List<MedicamentoListResponse> getTodosMedicamento() {
		log.info("[start] MedicamentoController - getTodosMedicamento");
		List<MedicamentoListResponse> medicamentos = medicamentoService.buscaTodosClientes();
		log.info("[finish] MedicamentoController - getTodosMedicamento");
		return medicamentos;
	}

	@Override
	public MedicamentoDetalhadoResponse getMedicamentoAtravesId(UUID idMedicamento) {
		log.info("[start] MedicamentoController - getMedicamentoAtravesId");
		log.info("[idMedicamento] {}", idMedicamento);
		MedicamentoDetalhadoResponse medicamentoDetalhado = medicamentoService.buscaClienteAtravesId(idMedicamento);
		log.info("[finish] MedicamentoController - getMedicamentoAtravesId");
		return medicamentoDetalhado;
	}

	@Override
	public void deletatMedicamentoAtravesId(UUID idMedicamento) {
		log.info("[start] MedicamentoController - deletatMedicamentoAtravesId");
		log.info("[idMedicamento] {}", idMedicamento);
		medicamentoService.buscaClienteAtravesId(idMedicamento);
		log.info("[finish] MedicamentoController - deletatMedicamentoAtravesId");
	}
}