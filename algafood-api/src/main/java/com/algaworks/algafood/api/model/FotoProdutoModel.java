package com.algaworks.algafood.api.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FotoProdutoModel {

	@ApiModelProperty(example = "5b963856-5188-4be2-8154-b7d70230bc99_Prime-Rib.jpg")
	private String nomeArquivo;
	
	@ApiModelProperty(example = "Prime Rib ao ponto")
	private String descricao;
	
	@ApiModelProperty(example = "image/jpeg")
	private String contentType;
	
	@ApiModelProperty(example = "11118")
	private Long tamanho;
}
