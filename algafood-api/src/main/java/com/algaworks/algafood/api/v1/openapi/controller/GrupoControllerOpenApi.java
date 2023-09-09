package com.algaworks.algafood.api.v1.openapi.controller;

import org.springframework.hateoas.CollectionModel;

import com.algaworks.algafood.api.v1.model.GrupoModel;
import com.algaworks.algafood.api.v1.model.input.GrupoInput;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

@SecurityRequirement(name = "security_auth")
@Tag(name = "Grupos")
public interface GrupoControllerOpenApi {
	
	@Operation(summary = "Lista os grupos")
	CollectionModel<GrupoModel> listar();
	
	@Operation(summary = "Busca um grupo porID", responses = {
			@ApiResponse(responseCode = "200"),
			@ApiResponse(responseCode = "400", description = "ID do grupo inválido",
				content = @Content(schema = @Schema(ref = "Problema"))),
			@ApiResponse(responseCode = "404", description = "Grupo não encontrado", 
				content = @Content(schema = @Schema(ref = "Problema")))
	})
	GrupoModel buscar(
			@Parameter(description = "ID do grupo", example = "1" ,required = true)
			Long grupoId);
	
	@Operation(summary = "Cadastra um grupo")
	GrupoModel adicionar(
			@RequestBody(description = "Representação de um novo grupo", required = true)
			GrupoInput grupoInput);
	
	@Operation(summary = "Atualiza um grupo por ID", responses = {
			@ApiResponse(responseCode = "200"),
			@ApiResponse(responseCode = "400", description = "ID do grupo inválido", 
				content = @Content(schema = @Schema(ref = "Problema"))),
			@ApiResponse(responseCode = "404", description = "Grupo não encontrado", 
					content = @Content(schema = @Schema(ref = "Problema")))
	})
	GrupoModel atualizar(
			@Parameter(description = "ID do grupo", example = "1", required = true)
			Long grupoId, 
			
			@RequestBody(description = "Representação de um grupo com os dados para atualizar", required = true)
			GrupoInput grupoInput) ;
	
	@Operation(summary = "Exclui um grupo por ID", responses = {
			@ApiResponse(responseCode = "204"),
			@ApiResponse(responseCode = "400", description = "ID do grupo inválido", 
				content = @Content(schema = @Schema(ref = "Problema"))),
			@ApiResponse(responseCode = "404", description = "Grupo não encontrado", 
					content = @Content(schema = @Schema(ref = "Problema")))
	})
	void remover(
			@Parameter(description = "ID do grupo", example = "1", required = true)
			Long grupoId) ;
}
