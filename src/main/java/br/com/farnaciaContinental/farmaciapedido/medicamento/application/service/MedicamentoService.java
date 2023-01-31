package br.com.farnaciaContinental.farmaciapedido.medicamento.application.service;

import javax.validation.Valid;

import br.com.farnaciaContinental.farmaciapedido.medicamento.application.api.MedicamentoRequest;
import br.com.farnaciaContinental.farmaciapedido.medicamento.application.api.MedicamentoResponse;

public interface MedicamentoService {
	MedicamentoResponse criaMedicamento(@Valid MedicamentoRequest medicamentoRequest);
}