package com.algaworks.algafood.api.v1.openapi.controller;

import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;

import com.algaworks.algafood.api.v1.model.UsuarioModel;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

//@Api(tags = "Restaurantes")
@SecurityRequirement(name = "security_auth")
public interface RestauranteUsuarioResponsavelControllerOpenApi {

//	@ApiOperation("Lista os usuários responsáveis associados a restaurante")
//	@ApiResponses({
//		@ApiResponse(code = 404, message = "Restaurante não encontrado", response = Problem.class) 
//	})
	CollectionModel<UsuarioModel> listar(
//			@ApiParam(example = "1", value = "ID do restaurante", required = true) 
			Long restauranteId);

//	@ApiOperation("Associação de restaurante com usuário responsável")
//	@ApiResponses({ 
//		@ApiResponse(code = 204, message = "Associaçao realizada com sucesso"),
//		@ApiResponse(code = 404, message = "Restaurante ou usuário não encontrado", response = Problem.class)
//	})
	ResponseEntity<Void> associar(
//			@ApiParam(example = "1", value = "ID do restaurante", required = true)
			Long restauranteId,

//			@ApiParam(example = "1", value = "ID do usuário", required = true) 
			Long usuarioId);

//	@ApiOperation("Desassociação de restaurante com usuário responsável")
//	@ApiResponses({ 
//		@ApiResponse(code = 204, message = "desassociaçao realizada com sucesso"),
//		@ApiResponse(code = 404, message = "Restaurante ou usuário não encontrado", response = Problem.class)
//	})
	ResponseEntity<Void> deassociar(
//			@ApiParam(example = "1", value = "ID do restaurante", required = true)
			Long restauranteId,

//			@ApiParam(example = "1", value = "ID do usuário", required = true)
			Long usuarioId);
}
