package br.com.caelum.livraria.rest;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import br.com.caelum.livraria.modelo.Pagamento;
import br.com.caelum.livraria.modelo.Transacao;

@Component
public class ClienteRest implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private static final String SERVER_URI = "http://localhost:8080/fj36-webservice";
	private static final String ENTRY_POINT = "/pagamento/";

	public Pagamento criarPagamento(Transacao transacao) {
		return null;
	}

	public Pagamento confirmarPagamento(Pagamento pagamento) {
		return null;
	}

}
