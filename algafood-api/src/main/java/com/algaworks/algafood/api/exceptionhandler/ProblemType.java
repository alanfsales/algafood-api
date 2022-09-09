package com.algaworks.algafood.api.exceptionhandler;

import lombok.Getter;

@Getter
public enum ProblemType {

	DADOS_INVALIDOS("/dados-invalidos", "Dados inválidos"),
	MENSAGEM_INCOMPREENSIVEL("/mensagem-incompreesivel", "Mensagem incompreensível"),
	RECURSO_NAO_ENCONTRADO("/recurso-nao-encontrado", "Recurso não encontrado"),
	ENTIDADE_EM_USO("/entidade-em-uso", "Entidade em uso"),
	ERRO_NEGOCIO("/erro-negocio", "Violação de regra de negócio"),
	ERRO_DE_SISTEMA("/erro-de-sistema", "Erro de sistema"),
	PARAMETRO_INVALIDO("/parametro-invalido","Parâmetro inválido"),
	ACESSO_NEGADO("/acesso-negado", "Acesso negado");
	
	private String title;
	private String uri;
	
	private ProblemType(String path, String title) {
		this.uri = "http://algafood.bom.br" + path;
		this.title = title;
	}
	
	

	
}
