package com.algaworks.algafood.api.v1.model;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import lombok.Getter;
import lombok.Setter;

@Relation(collectionRelation = "cidades")
@Getter
@Setter
public class CidadeModel extends RepresentationModel<CidadeModel> {
	
//	@ApiModelProperty(example = "1")
	private Long id;
	
//	@ApiModelProperty(example = "Caucaia")
	private String nome;
	
	private EstadoModel estado;

}
