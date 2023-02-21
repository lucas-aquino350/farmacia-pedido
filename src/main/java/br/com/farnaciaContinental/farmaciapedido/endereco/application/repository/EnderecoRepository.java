package br.com.farnaciaContinental.farmaciapedido.endereco.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.farnaciaContinental.farmaciapedido.endereco.domain.Endereco;

public interface EnderecoRepository {

	Endereco salva(Endereco endereco);

	List<Endereco> buscaEnderecosDoClienteComId(UUID idCliente);

	Endereco buscaEndereco(UUID idEndereco);

}
