package br.com.farnaciaContinental.farmaciapedido.medicamento.application.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class MedicamentoController implements MedicamentoApi {

	@Override
	public MedicamentoResponse postMedicamento(@Valid MedicamentoRequest MedicamentoRequest) {
		log.info("[inicia] MedicamentoController - postMedicamento");
		log.info("[finaliza] MedicamentoController - postMedicamento");
		return null;
	}
}