package com.algaworks.algafood.api.openapi.controller;

import java.util.List;

import com.algaworks.algafood.api.exceptionhandler.Problem;
import com.algaworks.algafood.api.model.UsuarioModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Restaurantes")
public interface RestauranteUsuarioResponsavelControllerOpenApi {

	@ApiOperation("Lista os usuários responsáveis associados a restaurante")
	@ApiResponses({
		@ApiResponse(code = 404, message = "Restaurante não encontrado", response = Problem.class) 
	})
	List<UsuarioModel> listar(
			@ApiParam(example = "1", value = "ID do restaurante", required = true) 
			Long restauranteId);

	@ApiOperation("Associação de restaurante com usuário responsável")
	@ApiResponses({ 
		@ApiResponse(code = 204, message = "Associaçao realizada com sucesso"),
		@ApiResponse(code = 404, message = "Restaurante ou usuário não encontrado", response = Problem.class)
	})
	void associar(
			@ApiParam(example = "1", value = "ID do restaurante", required = true)
			Long restauranteId,

			@ApiParam(example = "1", value = "ID do usuário", required = true) 
			Long usuarioId);

	@ApiOperation("Desassociação de restaurante com usuário responsável")
	@ApiResponses({ 
		@ApiResponse(code = 204, message = "desassociaçao realizada com sucesso"),
		@ApiResponse(code = 404, message = "Restaurante ou usuário não encontrado", response = Problem.class)
	})
	void deassociar(
			@ApiParam(example = "1", value = "ID do restaurante", required = true)
			Long restauranteId,

			@ApiParam(example = "1", value = "ID do usuário", required = true)
			Long usuarioId);
}
