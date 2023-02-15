package br.com.farnaciaContinental.farmaciapedido.cliente.application.infra;

import java.util.UUID;
import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.farnaciaContinental.farmaciapedido.cliente.domain.Cliente;

public interface ClienteMongoSpringRepository extends MongoRepository<Cliente, UUID>{

}
