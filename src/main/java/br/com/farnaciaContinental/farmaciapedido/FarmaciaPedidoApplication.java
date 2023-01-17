package br.com.farnaciaContinental.farmaciapedido;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
@RequestMapping("/")
public class FarmaciaPedidoApplication {
    @GetMapping
	public String getHomeTeste() {
		return "API FARMACIA-PEDIDO  - TESTE";
	}
	public static void main(String[] args) {
		SpringApplication.run(FarmaciaPedidoApplication.class, args);
	}
}
