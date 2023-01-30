package br.com.farnaciaContinental.farmaciapedido.cliente.application.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.farnaciaContinental.farmaciapedido.cliente.domain.Cliente;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID>{

}
