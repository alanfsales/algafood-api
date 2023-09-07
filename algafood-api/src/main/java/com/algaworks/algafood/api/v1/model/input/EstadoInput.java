package com.algaworks.algafood.api.v1.model.input;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstadoInput {

//	@ApiModelProperty(example = "Minas Gerais", required = true)
	@NotBlank
	private String nome;
}
