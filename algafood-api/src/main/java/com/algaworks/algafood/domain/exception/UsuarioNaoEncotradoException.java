package com.algaworks.algafood.domain.exception;

public class UsuarioNaoEncotradoException extends EntidadeNaoEncontradaException {

	private static final long serialVersionUID = 1L;

	public UsuarioNaoEncotradoException(String mensagem) {
		super(mensagem);
	}
	
	public UsuarioNaoEncotradoException(Long usuarioId) {
		this(String.format("Não Existe um cadastro de Usuário como o código %d.", usuarioId));
	}

}
