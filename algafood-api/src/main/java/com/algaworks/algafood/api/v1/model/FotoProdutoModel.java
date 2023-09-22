package com.algaworks.algafood.api.v1.model;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Relation(collectionRelation = "fotos")
@Getter
@Setter
public class FotoProdutoModel extends RepresentationModel<FotoProdutoModel> {

	@Schema(example = "5b963856-5188-4be2-8154-b7d70230bc99_Prime-Rib.jpg")
	private String nomeArquivo;
	
	@Schema(example = "Prime Rib ao ponto")
	private String descricao;
	
	@Schema(example = "image/jpeg")
	private String contentType;
	
	@Schema(example = "11118")
	private Long tamanho;
}
