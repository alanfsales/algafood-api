package com.algaworks.algafood.domain.exception;

public class ProdutoNaoEncontradoException extends EntidadeNaoEncontradaException {

	private static final long serialVersionUID = 1L;
	
	public ProdutoNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public ProdutoNaoEncontradoException(Long restauranteId, Long produtoId) {
		this(String.format("Não Existe um cadastro de produto como o código %d para o restaurante de código %d", 
				produtoId, restauranteId));
	}

}
