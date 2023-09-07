package com.algaworks.algafood.api.v1.openapi.controller;

import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;

import com.algaworks.algafood.api.v1.model.PermissaoModel;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

//@Api(tags = "Grupos")
@SecurityRequirement(name = "security_auth")
public interface GrupoPermissaoControllerOpenApi {

//	@ApiOperation("Lista as permissões associada a um grupo")
//	@ApiResponses({
//		@ApiResponse(code = 400, message = "ID do grupo inválido", response = Problem.class),
//		@ApiResponse(code = 404, message = "Grupo não encontrado", response = Problem.class)
//	})
	CollectionModel<PermissaoModel> listar(
//			@ApiParam(example = "1", value = "ID do Grupo", required = true)
			Long grupoId);
	
//	@ApiOperation("Desassociação de permissões com grupo")
//	@ApiResponses({
//		@ApiResponse(code = 204, message = "Desassociação realizada com sucesso"),
//		@ApiResponse(code = 404, message = "Grupo ou permissão não encontrado", response = Problem.class)
//	})
	ResponseEntity<Void> desassociar(
//			@ApiParam(example = "1", value = "ID do Grupo", required = true)
			Long grupoId, 
			
//			@ApiParam(example = "1", value = "ID da permissão", required = true)
			Long permissaoId);
	
//	@ApiOperation("Associação de permissões com grupo")
//	@ApiResponses({
//		@ApiResponse(code = 204, message = "Associação de permissão com grupo"),
//		@ApiResponse(code = 404, message = "Grupo ou permissão não encontrado", response = Problem.class)
//	})
	ResponseEntity<Void> associar(
//			@ApiParam(example = "1", value = "ID do Grupo", required = true)
			Long grupoId, 
			
//			@ApiParam(example = "1", value = "ID da permissão", required = true)
			Long permissaoId);
}
