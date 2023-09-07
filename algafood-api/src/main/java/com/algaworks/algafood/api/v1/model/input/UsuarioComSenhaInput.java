package com.algaworks.algafood.api.v1.model.input;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioComSenhaInput extends UsuarioInput{

//	@ApiModelProperty(example = "123", required = true)
	@NotBlank
	private String senha;
	
}
