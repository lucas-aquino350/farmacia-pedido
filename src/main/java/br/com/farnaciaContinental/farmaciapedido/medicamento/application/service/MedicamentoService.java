package br.com.farnaciaContinental.farmaciapedido.medicamento.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.farnaciaContinental.farmaciapedido.medicamento.application.api.MedicamentoDetalhadoResponse;
import br.com.farnaciaContinental.farmaciapedido.medicamento.application.api.MedicamentoListResponse;
import br.com.farnaciaContinental.farmaciapedido.medicamento.application.api.MedicamentoRequest;
import br.com.farnaciaContinental.farmaciapedido.medicamento.application.api.MedicamentoResponse;

public interface MedicamentoService {
	MedicamentoResponse criaMedicamento(@Valid MedicamentoRequest medicamentoRequest);
	List<MedicamentoListResponse> buscaTodosClientes();
	MedicamentoDetalhadoResponse buscaClienteAtravesId(UUID idMedicamento);
	void deletatMedicamentoAtravesId(UUID idMedicamento);
}