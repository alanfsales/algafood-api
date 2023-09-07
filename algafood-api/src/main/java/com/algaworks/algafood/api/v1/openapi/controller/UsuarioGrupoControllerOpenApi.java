package com.algaworks.algafood.api.v1.openapi.controller;

import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;

import com.algaworks.algafood.api.v1.model.GrupoModel;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

//@Api(tags = "Usuários")
@SecurityRequirement(name = "security_auth")
public interface UsuarioGrupoControllerOpenApi {

//	@ApiOperation("Lista os grupos associados a um usuário")
//	@ApiResponses({
//		@ApiResponse(code = 404, message = "Usuário não encontrado", response = Problem.class)
//	})
	CollectionModel<GrupoModel> listar(
//			@ApiParam(example = "1", value = "ID do usuário", required = true)
			Long usuarioId);
	
//	@ApiOperation("Associação de grupo com usuário")
//	@ApiResponses({
//		@ApiResponse(code = 204, message = "Associação realizada com sucesso"),
//		@ApiResponse(code = 404, message = "Usuário ou grupo não encontrado", response = Problem.class)
//	})
	ResponseEntity<Void> associar(
//			@ApiParam(example = "1", value = "ID do usuário", required = true)
			Long usuarioId,
			
//			@ApiParam(example = "1", value = "ID do grupo", required = true)
			Long grupoId);
	
//	@ApiOperation("Desassociação de grupo com usuário")
//	@ApiResponses({
//		@ApiResponse(code = 204, message = "Desassociação realizada com sucesso"),
//		@ApiResponse(code = 404, message = "Usuário ou grupo não encontrado", response = Problem.class)
//	})
	ResponseEntity<Void> desassociar(
//			@ApiParam(example = "1", value = "ID do usuário", required = true)
			Long usuarioId, 
			
//			@ApiParam(example = "1", value = "ID do grupo", required = true)
			Long grupoId);
}
