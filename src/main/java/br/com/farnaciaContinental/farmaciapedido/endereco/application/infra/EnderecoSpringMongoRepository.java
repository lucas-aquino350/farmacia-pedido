package br.com.farnaciaContinental.farmaciapedido.endereco.application.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.farnaciaContinental.farmaciapedido.endereco.domain.Endereco;

public interface EnderecoSpringMongoRepository extends MongoRepository<Endereco, UUID>{

	List<Endereco> findByIdCliente(UUID idCliente);
}
