package com.algaworks.algafood.api.v1.model;

import java.math.BigDecimal;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import lombok.Getter;
import lombok.Setter;

@Relation(collectionRelation = "restaurantes")
@Getter
@Setter
public class RestauranteModel extends RepresentationModel<RestauranteModel> {

//	@ApiModelProperty(example = "1")
//	@JsonView({RestauranteView.Resumo.class, RestauranteView.ApenasNome.class})
	private Long id;
	
//	@ApiModelProperty(example = "Tai Gourmat")
//	@JsonView({RestauranteView.Resumo.class, RestauranteView.ApenasNome.class})
	private String nome;
	
//	@ApiModelProperty(example = "12.00")
//	@JsonView(RestauranteView.Resumo.class)
	private BigDecimal taxaFrete;
	
//	@JsonView(RestauranteView.Resumo.class)
	private CozinhaModel cozinha;
	
	private Boolean ativo;
	
	private Boolean aberto;
	
	private EnderecoModel endereco;
	
}
