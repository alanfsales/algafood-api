package com.algaworks.algafood.api.openapi.controller;

import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;

import com.algaworks.algafood.api.exceptionhandler.Problem;
import com.algaworks.algafood.api.model.PermissaoModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Grupos")
public interface GrupoPermissaoControllerOpenApi {

	@ApiOperation("Lista as permissões associada a um grupo")
	@ApiResponses({
		@ApiResponse(code = 400, message = "ID do grupo inválido", response = Problem.class),
		@ApiResponse(code = 404, message = "Grupo não encontrado", response = Problem.class)
	})
	CollectionModel<PermissaoModel> listar(
			@ApiParam(example = "1", value = "ID do Grupo", required = true)
			Long grupoId);
	
	@ApiOperation("Desassociação de permissões com grupo")
	@ApiResponses({
		@ApiResponse(code = 204, message = "Desassociação realizada com sucesso"),
		@ApiResponse(code = 404, message = "Grupo ou permissão não encontrado", response = Problem.class)
	})
	ResponseEntity<Void> desassociar(
			@ApiParam(example = "1", value = "ID do Grupo", required = true)
			Long grupoId, 
			
			@ApiParam(example = "1", value = "ID da permissão", required = true)
			Long permissaoId);
	
	@ApiOperation("Associação de permissões com grupo")
	@ApiResponses({
		@ApiResponse(code = 204, message = "Associação de permissão com grupo"),
		@ApiResponse(code = 404, message = "Grupo ou permissão não encontrado", response = Problem.class)
	})
	ResponseEntity<Void> associar(
			@ApiParam(example = "1", value = "ID do Grupo", required = true)
			Long grupoId, 
			
			@ApiParam(example = "1", value = "ID da permissão", required = true)
			Long permissaoId);
}
