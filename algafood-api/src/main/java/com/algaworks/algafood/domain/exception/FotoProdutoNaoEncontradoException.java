package com.algaworks.algafood.domain.exception;

public class FotoProdutoNaoEncontradoException extends EntidadeNaoEncontradaException {

	private static final long serialVersionUID = 1L;
	
	public FotoProdutoNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public FotoProdutoNaoEncontradoException(Long restauranteId, Long produtoId) {
		this(String.format("Não Existe um cadastro de foto do produto como o código %d para o restaurante de código %d", 
				produtoId, restauranteId));
	}

}
