package br.com.farnaciaContinental.farmaciapedido.medicamento.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.farnaciaContinental.farmaciapedido.medicamento.domain.Medicamento;

public interface MedicamentoRepository {
	Medicamento salva(Medicamento medicamento);
	List<Medicamento> buscaTodosMedicamentos();
	Medicamento buscaMedicamentoAtravesId(UUID idMedicamento);
	void deletaMedicamentoAtravesId(Medicamento medicamento);
}