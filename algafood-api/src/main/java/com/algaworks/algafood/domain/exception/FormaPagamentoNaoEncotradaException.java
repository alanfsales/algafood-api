package com.algaworks.algafood.domain.exception;

public class FormaPagamentoNaoEncotradaException extends EntidadeNaoEncontradaException {

	private static final long serialVersionUID = 1L;

	public FormaPagamentoNaoEncotradaException(String mensagem) {
		super(mensagem);
	}
	
	public FormaPagamentoNaoEncotradaException(Long formaPagamentoId) {
		this(String.format("Não Existe um cadastro de Forma de Pagamento como o código %d.", formaPagamentoId));
	}

}
