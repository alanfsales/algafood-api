package com.algaworks.algafood.domain.exception;

public class PedidoNaoEncotradoException extends EntidadeNaoEncontradaException {

	private static final long serialVersionUID = 1L;

	public PedidoNaoEncotradoException(String codigoPedido) {
		super(String.format("Não Existe um cadastro de pedido como o código %s", codigoPedido));
	}

}
