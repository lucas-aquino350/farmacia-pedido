package br.com.farnaciaContinental.farmaciapedido.endereco.application.infra;

import org.springframework.stereotype.Repository;

import br.com.farnaciaContinental.farmaciapedido.endereco.application.repository.EnderecoRepository;
import br.com.farnaciaContinental.farmaciapedido.endereco.domain.Endereco;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class EnderecoInfraRepository implements EnderecoRepository {

	private final EnderecoSpringMongoRepository enderecoSpringMongoRepository;

	@Override
	public Endereco salva(Endereco endereco) {
		log.info("[start] EnderecoInfraRepository - salva");
		enderecoSpringMongoRepository.save(endereco);
		log.info("[finish] EnderecoInfraRepository - salva");
		return endereco;
	}
}