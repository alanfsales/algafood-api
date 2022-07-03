package com.algaworks.algafood.api.openapi.controller;

import org.springframework.hateoas.CollectionModel;

import com.algaworks.algafood.api.exceptionhandler.Problem;
import com.algaworks.algafood.api.model.ProdutoModel;
import com.algaworks.algafood.api.model.input.ProdutoInput;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Produtos")
public interface RestauranteProdutoControllerOpenApi {

	@ApiOperation("Lista os produtos de um restaurante")
	@ApiResponses({
		@ApiResponse(code = 400, message = "ID de restaurante inválido", response = Problem.class),
		@ApiResponse(code = 404, message = "Restaurante não encontrado", response = Problem.class)
	})
	CollectionModel<ProdutoModel> listar(
			@ApiParam(example = "1", value = "ID do restaurante", required = true)
			Long restauranteId,
			
			@ApiParam(value = "Indica se deve ou não incluir produtos inativos no resultado da listagem",
					example = "false", defaultValue = "false")
			Boolean incluirInativos);

	@ApiOperation("Busca um produtos de um restaurante")
	@ApiResponses({
		@ApiResponse(code = 400, message = "ID de restaurante ou produto inválido", response = Problem.class),
		@ApiResponse(code = 404, message = "Produto de restaurante não encontrado", response = Problem.class)
	})
	ProdutoModel buscar(
			@ApiParam(example = "1", value = "ID do restaurante", required = true)
			Long restauranteId, 
			
			@ApiParam(example = "1", value = "ID do produto", required = true)
			Long produtoId);
	
	@ApiOperation("Cadastra um produtos de um restaurante")
	@ApiResponses({
		@ApiResponse(code = 201, message = "Produto cadastrado"),
		@ApiResponse(code = 404, message = "Restaurante não encontrado", response = Problem.class)
	})
	ProdutoModel adicionar(
			@ApiParam(example = "1", value = "ID do restaurante", required = true)
			Long restauranteId, 
			
			@ApiParam(name = "corpo", value = "Representação de um novo produto", required = true)
			ProdutoInput produtoInput);
	
	@ApiOperation("Atualiza um produtos de um restaurante")
	@ApiResponses({
		@ApiResponse(code = 200, message = "Produto atualizado"),
		@ApiResponse(code = 404, message = "Restaurante ou produto não encontrado", response = Problem.class)
	})
	ProdutoModel atualizar(
			@ApiParam(example = "1", value = "ID do restaurante", required = true)
			Long restauranteId,
			
			@ApiParam(example = "1", value = "ID do produto", required = true)
			Long produtoId, 
			
			@ApiParam(name = "corpo", value = "Representação de produto com os novos dados", required = true)
			ProdutoInput produtoInput);
}
