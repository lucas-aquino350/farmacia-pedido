package br.com.farnaciaContinental.farmaciapedido.medicamento.application.infra;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.farnaciaContinental.farmaciapedido.medicamento.domain.Medicamento;

public interface MedicamentoSpringJPARepository extends JpaRepository<Medicamento, UUID> {
}