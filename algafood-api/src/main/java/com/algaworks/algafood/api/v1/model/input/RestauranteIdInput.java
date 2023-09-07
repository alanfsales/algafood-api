package com.algaworks.algafood.api.v1.model.input;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RestauranteIdInput {

//	@ApiModelProperty(example = "1", required = true)
	@NotNull
	private Long id;
}
