package br.com.farnaciaContinental.farmaciapedido.medicamento.application.infra;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.farnaciaContinental.farmaciapedido.medicamento.domain.Medicamento;

public interface MedicamentoMongoSpringRepository extends MongoRepository<Medicamento, UUID> {
}