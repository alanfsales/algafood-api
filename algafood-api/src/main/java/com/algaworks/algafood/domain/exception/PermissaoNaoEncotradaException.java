package com.algaworks.algafood.domain.exception;

public class PermissaoNaoEncotradaException extends EntidadeNaoEncontradaException {

	private static final long serialVersionUID = 1L;

	public PermissaoNaoEncotradaException(String mensagem) {
		super(mensagem);
	}
	
	public PermissaoNaoEncotradaException(Long permissaoId) {
		this(String.format("Não Existe um cadastro de Permissão como o código %d", permissaoId));
	}

}
