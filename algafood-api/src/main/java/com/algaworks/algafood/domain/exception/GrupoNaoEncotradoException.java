package com.algaworks.algafood.domain.exception;

public class GrupoNaoEncotradoException extends EntidadeNaoEncontradaException {

	private static final long serialVersionUID = 1L;

	public GrupoNaoEncotradoException(String mensagem) {
		super(mensagem);
	}
	
	public GrupoNaoEncotradoException(Long grupoId) {
		this(String.format("Não Existe um cadastro de Grupo como o código %d.", grupoId));
	}

}
