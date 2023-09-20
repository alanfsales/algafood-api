package com.algaworks.algafood.api.v1.openapi.controller;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotAcceptableException;

import com.algaworks.algafood.api.v1.model.FotoProdutoModel;
import com.algaworks.algafood.api.v1.model.input.FotoProdutoInput;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

//@Api(tags = "Produtos")
@SecurityRequirement(name = "security_auth")
public interface RestauranteProdutoFotoControllerOpenApi {

	@Operation(summary = "Atualiza a foto do produto de um restaurante")
	FotoProdutoModel atualizarFoto(
			@Parameter(description = "ID do restaurante", example = "1", required = true)
			Long restauranteId,
			@Parameter(description = "ID do produto", example = "1", required = true)
			Long produtoId,
			@RequestBody(required = true)
			FotoProdutoInput fotoProdutoInput) throws IOException;
	
	@Operation(summary = "Busca a foto do produto de um restaurante", responses = {
			@ApiResponse(responseCode = "200", content = {
					@Content(mediaType = "application/json", 
							schema = @Schema(implementation = FotoProdutoModel.class)),
					@Content(mediaType = "image/jpeg", schema = @Schema(type = "string", format = "binary")),
					@Content(mediaType = "image/png", schema = @Schema(type = "string", format = "binary"))
			})
	})
	FotoProdutoModel buscar(
			@Parameter(example = "1", description = "ID do restaurante", required = true)
			Long restauranteId, 
			
			@Parameter(example = "1", description = "ID do produto", required = true)
			Long produtoId);
	
	@Operation(hidden = true)
	ResponseEntity<?> servir(Long restauranteId, Long produtoId, String acceptHeader)throws HttpMediaTypeNotAcceptableException;
	
//	@ApiOperation("Exclui a foto do produto de um restaurante")
//	 @ApiResponses({
//	        @ApiResponse(code = 204, message = "Foto do produto excluída"),
//	        @ApiResponse(code = 400, message = "ID do restaurante ou produto inválido", response = Problem.class),
//	        @ApiResponse(code = 404, message = "Foto de produto não encontrada", response = Problem.class)
//	    })
	void exclui(
//			@ApiParam(example = "1", value = "ID do restaurante", required = true)
			Long restauranteId,
			
//			@ApiParam(example = "1", value = "ID do produto", required = true)
			Long produtoId);

}
