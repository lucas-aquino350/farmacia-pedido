package br.com.farnaciaContinental.farmaciapedido.medicamento.application.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.farnaciaContinental.farmaciapedido.medicamento.application.api.MedicamentoListResponse;
import br.com.farnaciaContinental.farmaciapedido.medicamento.application.api.MedicamentoRequest;
import br.com.farnaciaContinental.farmaciapedido.medicamento.application.api.MedicamentoResponse;
import br.com.farnaciaContinental.farmaciapedido.medicamento.application.repository.MedicamentoRepository;
import br.com.farnaciaContinental.farmaciapedido.medicamento.domain.Medicamento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class MedicamentoAplicationService implements MedicamentoService {

	private final MedicamentoRepository medicamentoRepository;

	@Override
	public MedicamentoResponse criaMedicamento(@Valid MedicamentoRequest medicamentoRequest) {
		log.info("[start] MedicamentoAplicationService - criaMedicamento ");
		Medicamento medicamento = medicamentoRepository.salva(new Medicamento(medicamentoRequest));
		log.info("[finish] MedicamentoAplicationService - criaMedicamento ");
		return MedicamentoResponse.builder().idMedicamento(medicamento.getIdMedicamento()).build();
	}

	@Override
	public List<MedicamentoListResponse> buscaTodosClientes() {
		log.info("[start] MedicamentoAplicationService - buscaTodosClientes ");
		log.info("[finish] MedicamentoAplicationService - buscaTodosClientes ");
		return null;
	}
}