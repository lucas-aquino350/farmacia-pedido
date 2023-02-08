package br.com.farnaciaContinental.farmaciapedido.medicamento.application.infra;

import java.util.List;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.farnaciaContinental.farmaciapedido.handler.APIException;
import br.com.farnaciaContinental.farmaciapedido.medicamento.application.repository.MedicamentoRepository;
import br.com.farnaciaContinental.farmaciapedido.medicamento.domain.Medicamento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class MedicamentoInfraRepository implements MedicamentoRepository {

	private final MedicamentoSpringJPARepository medicamentoSpringDataJPARepository;

	@Override
	public Medicamento salva(Medicamento medicamento) {
	log.info("[start] MedicamentoInfraRepository - salva ");
	try {
		medicamentoSpringDataJPARepository.save(medicamento);
		} catch (DataIntegrityViolationException e) {
			throw APIException.build(HttpStatus.BAD_REQUEST,"Existem dados duplicados");
	    }
	log.info("[finish] MedicamentoInfraRepository - salva ");
		return medicamento;
	}

	@Override
	public List<Medicamento> buscaTodosMedicamentos() {
		log.info("[start] MedicamentoInfraRepository - buscaTodosMedicamentos ");
		log.info("[finish] MedicamentoInfraRepository - buscaTodosMedicamentos ");
		return null;
	}
}