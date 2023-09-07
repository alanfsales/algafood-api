package com.algaworks.algafood.api.v1.openapi.controller;

import org.springframework.hateoas.CollectionModel;

import com.algaworks.algafood.api.v1.model.PermissaoModel;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

//@Api(tags = "Permissões")
@SecurityRequirement(name = "security_auth")
public interface PermissaoControllerOpenApi {

//	@ApiOperation("Lista as permissões")
	CollectionModel<PermissaoModel> listar();

}