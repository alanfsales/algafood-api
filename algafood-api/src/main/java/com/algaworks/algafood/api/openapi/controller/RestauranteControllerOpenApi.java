package com.algaworks.algafood.api.openapi.controller;

import java.util.List;

import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;

import com.algaworks.algafood.api.exceptionhandler.Problem;
import com.algaworks.algafood.api.model.RestauranteApenasNomeModel;
import com.algaworks.algafood.api.model.RestauranteBasicoModel;
import com.algaworks.algafood.api.model.RestauranteModel;
import com.algaworks.algafood.api.model.input.RestauranteInput;
import com.algaworks.algafood.api.openapi.model.RestauranteBasicoModelOpenApi;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Restaurantes")
public interface RestauranteControllerOpenApi {

	@ApiOperation(value = "Lista restaurantes", response = RestauranteBasicoModelOpenApi.class)
	@ApiImplicitParams({
		@ApiImplicitParam(value = "Nome da projeção de pedidos", allowableValues = "apenas-nome",
				name = "projecao", paramType = "query", type = "string")
	})
	CollectionModel<RestauranteBasicoModel> listar();
	
	@ApiOperation(value = "Lista os restaurantes", hidden = true)
	 CollectionModel<RestauranteApenasNomeModel> listarApenasNomes();
	
	@ApiOperation("Busca um restaurante por ID")
	@ApiResponses({
		@ApiResponse(code = 400, message = "ID do restaurante inválido", response = Problem.class),
		@ApiResponse(code = 404, message = "Restaurante não encotrado", response = Problem.class)
	})
	RestauranteModel buscar(
			@ApiParam(example = "1", value = "ID de um restaurante", required = true)
			Long restauranteId);

	@ApiOperation("Cadastra um restaurante")
	@ApiResponses({
		@ApiResponse(code = 201, message = "Restaurante cadastrado")
	})
	RestauranteModel adicionar(
			@ApiParam(name = "corpo", value = "Representação de um novo restaurante", required = true)
			RestauranteInput restauranteInput);
	
	@ApiOperation("Atualiza um restaurante por ID")
	@ApiResponses({
		@ApiResponse(code = 200, message = "Restaurante atualizado"),
		@ApiResponse(code = 404, message = "Restaurante não encotrado", response = Problem.class)
	})
	RestauranteModel atualizar(
			@ApiParam(example = "1", value = "ID de um restaurante", required = true)
			Long restauranteId, 
			
			@ApiParam(name = "corpo", value = "Representação de restaurante com os novos dados", required = true)
			RestauranteInput restauranteInput);
	
	@ApiOperation("Ativa um restaurante por ID")
	@ApiResponses({
		@ApiResponse(code = 204, message = "Restaurante ativado com sucesso"),
		@ApiResponse(code = 404, message = "Restaurante não encotrado", response = Problem.class)
	})
	ResponseEntity<Void> ativar(
			@ApiParam(example = "1", value = "ID de um restaurante", required = true)
			Long restauranteId);
	
	@ApiOperation("Inativa um restaurante por ID")
	@ApiResponses({
		@ApiResponse(code = 204, message = "Restaurante inativado com sucesso"),
		@ApiResponse(code = 404, message = "Restaurante não encotrado", response = Problem.class)
	})
	ResponseEntity<Void> inativar(
			@ApiParam(example = "1", value = "ID de um restaurante", required = true)
			Long restauranteId);
	
	@ApiOperation("Ativa múltiplos restaurantes")
	@ApiResponses({
		@ApiResponse(code = 204, message = "Restaurantes ativos com sucesso"),
	})
	void ativarMultiplos(
			@ApiParam(name = "corpo", value = "IDs de restaurantes", required = true)
			List<Long> restuaranteIds);
	
	@ApiOperation("Inativa múltiplos restaurantes")
	@ApiResponses({
		@ApiResponse(code = 204, message = "Restaurantes inativos com sucesso"),
	})
	void inativarMultiplos(
			@ApiParam(name = "corpo", value = "IDs de restaurantes", required = true)
			List<Long> restuaranteIds);
	
	@ApiOperation("Fecha um restaurante por ID")
	@ApiResponses({
		@ApiResponse(code = 204, message = "Restaurante fechado com sucesso"),
		@ApiResponse(code = 404, message = "Restaurante não encotrado", response = Problem.class)
	})
	ResponseEntity<Void> fechar(
			@ApiParam(example = "1", value = "ID de um restaurante", required = true)
			Long restauranteId);
	
	@ApiOperation("Abre um restaurante por ID")
	@ApiResponses({
		@ApiResponse(code = 204, message = "Restaurante aberto com sucesso"),
		@ApiResponse(code = 404, message = "Restaurante não encotrado", response = Problem.class)
	})
	ResponseEntity<Void> abrir(
			@ApiParam(example = "1", value = "ID de um restaurante", required = true)
			Long restauranteId);
}