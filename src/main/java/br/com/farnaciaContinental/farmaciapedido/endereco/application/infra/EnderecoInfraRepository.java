package br.com.farnaciaContinental.farmaciapedido.endereco.application.infra;

import java.util.List;
import java.util.UUID;

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

	@Override
	public List<Endereco> buscaEnderecosDoClienteComId(UUID idCliente) {
		log.info("[start] EnderecoInfraRepository - salva");
		var enderecos = enderecoSpringMongoRepository.findByIdCliente(idCliente);
		log.info("[finish] EnderecoInfraRepository - salva");
		return enderecos;
	}
}