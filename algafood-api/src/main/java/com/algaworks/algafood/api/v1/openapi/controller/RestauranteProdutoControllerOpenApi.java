package com.algaworks.algafood.api.v1.openapi.controller;

import org.springframework.hateoas.CollectionModel;

import com.algaworks.algafood.api.v1.model.ProdutoModel;
import com.algaworks.algafood.api.v1.model.input.ProdutoInput;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Produtos")
@SecurityRequirement(name = "security_auth")
public interface RestauranteProdutoControllerOpenApi {

	@Operation(summary = "Lista os produtos de um restaurante" ,responses = {
			@ApiResponse(responseCode = "200"),
			@ApiResponse(responseCode = "400", description = "ID de restaurante inválido",
					content = @Content(schema = @Schema(ref = "Problema"))),
			@ApiResponse(responseCode = "404", description = "Restaurante não encontrado",
				content = @Content(schema = @Schema(ref = "Problema")))
	})
	CollectionModel<ProdutoModel> listar(
			@Parameter(description  = "ID do restaurante", example = "1", required = true)
			Long restauranteId,
			
			@Parameter(description = "Indica se deve ou não incluir produtos inativos no resultado da listagem", 
				example = "false", required = false)
			Boolean incluirInativos);

	@Operation(summary = "Busca um produtos de um restaurante",responses = {
			@ApiResponse(responseCode = "200"),
			@ApiResponse(responseCode = "400", description = "ID de restaurante ou produto inválido",
					content = @Content(schema = @Schema(ref = "Problema"))),
			@ApiResponse(responseCode = "404", description = "Produto de restaurante não encontrado",
					content = @Content(schema = @Schema(ref = "Problema")))
	})
	ProdutoModel buscar(
			@Parameter(description = "ID do restaurante", example = "1", required = true)
			Long restauranteId, 
			
			@Parameter(description = "ID do produto", example = "1", required = true)
			Long produtoId);
	
	@Operation(summary = "Cadastra um produtos de um restaurante", responses = {
			@ApiResponse(responseCode = "201", description = "Produto cadastrado"),
			@ApiResponse(responseCode = "404", description = "Restaurante não encontrado",
				content = @Content(schema = @Schema(ref = "Problema")))
	})
	ProdutoModel adicionar(
			@Parameter(description = "ID do restaurante", example = "1", required = true)
			Long restauranteId, 
			
			@RequestBody(description = "Representação de um novo produto", required = true)
			ProdutoInput produtoInput);
	
	@Operation(summary = "Atualiza um produtos de um restaurante", responses = {
			@ApiResponse(responseCode = "200", description = "Produto atualizado"),
			@ApiResponse(responseCode = "404", description = "Restaurante ou produto não encontrado",
				content = @Content(schema = @Schema(ref = "Problema")))
	})
	ProdutoModel atualizar(
			@Parameter(description = "ID do restaurante", example = "1", required = true)
			Long restauranteId,
			
			@Parameter(description = "ID do produto", example = "1", required = true)
			Long produtoId, 
			
			@RequestBody(description = "Representação de produto com os novos dados", required = true)
			ProdutoInput produtoInput);
}
