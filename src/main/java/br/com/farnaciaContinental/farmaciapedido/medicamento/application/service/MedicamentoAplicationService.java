package br.com.farnaciaContinental.farmaciapedido.medicamento.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.farnaciaContinental.farmaciapedido.medicamento.application.api.MedicamentoAlteracaoRequest;
import br.com.farnaciaContinental.farmaciapedido.medicamento.application.api.MedicamentoDetalhadoResponse;
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
		List<Medicamento> medicamentos = medicamentoRepository.buscaTodosMedicamentos();
		log.info("[finish] MedicamentoAplicationService - buscaTodosClientes ");
		return MedicamentoListResponse.converte(medicamentos);
	}

	@Override
	public MedicamentoDetalhadoResponse buscaClienteAtravesId(UUID idMedicamento) {
		log.info("[start] MedicamentoAplicationService - buscaClienteAtravesId ");
		Medicamento medicamento = medicamentoRepository.buscaMedicamentoAtravesId(idMedicamento);
		log.info("[finish] MedicamentoAplicationService - buscaClienteAtravesId ");
		return new MedicamentoDetalhadoResponse(medicamento);
	}

	@Override
	public void deletatMedicamentoAtravesId(UUID idMedicamento) {
		log.info("[start] MedicamentoAplicationService - deletatMedicamentoAtravesId ");
		Medicamento medicamento = medicamentoRepository.buscaMedicamentoAtravesId(idMedicamento);
		medicamentoRepository.deletaMedicamentoAtravesId(medicamento);
		log.info("[finish] MedicamentoAplicationService - deletatMedicamentoAtravesId ");
	}

	@Override
	public void patchAlteraMedicamento(UUID idMedicamento, MedicamentoAlteracaoRequest medicamentoAlteracaoRequest) {
		log.info("[start] MedicamentoAplicationService - patchAlteraMedicamento ");
		Medicamento medicamento = medicamentoRepository.buscaMedicamentoAtravesId(idMedicamento);
		medicamento.altera(medicamentoAlteracaoRequest);
		medicamentoRepository.salva(medicamento);
		log.info("[finish] MedicamentoAplicationService - patchAlteraMedicamento ");
	}
}