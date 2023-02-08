package br.com.farnaciaContinental.farmaciapedido.medicamento.application.repository;

import java.util.List;

import br.com.farnaciaContinental.farmaciapedido.medicamento.domain.Medicamento;

public interface MedicamentoRepository {
	Medicamento salva(Medicamento medicamento);
	List<Medicamento> buscaTodosMedicamentos();
}