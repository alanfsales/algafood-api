package com.algaworks.algafood.api.v1.openapi.controller;

import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;

import com.algaworks.algafood.api.exceptionhandler.Problem;
import com.algaworks.algafood.api.v1.model.FormaPagamentoModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Restaurantes")
public interface RestauranteFormaPagamentoControllerOpenApi {

	@ApiOperation("Lista  as formas de pagamento associadas a restaurante")
	@ApiResponses({
		@ApiResponse(code = 404, message = "Restautante não encontrado", response = Problem.class)
	})
	CollectionModel<FormaPagamentoModel> listar(
			@ApiParam(example = "1", value = "ID do restaurante", required = true)
			Long restauranteId);
	
	@ApiOperation("Desassociação realizada com sucesso")
	@ApiResponses({
		@ApiResponse(code = 204, message = "Forma de pagamento desassociada"),
		@ApiResponse(code = 404, message = "Restautante ou forma de pagamento não encontrado", response = Problem.class)
	})
	ResponseEntity<Void> desassociar(
			@ApiParam(example = "1", value = "ID do restaurante", required = true)
			Long restauranteId, 
			
			@ApiParam(example = "1", value = "ID da forma de pagamento", required = true)
			Long formaPagamentoId);
	
	@ApiOperation("Associação de um restaurante com forma de pagamento")
	@ApiResponses({
		@ApiResponse(code = 204, message = "Associação realizada com sucesso"),
		@ApiResponse(code = 404, message = "Restautante ou forma de pagamento não encontrado", response = Problem.class)
	})
	ResponseEntity<Void> associar(
			@ApiParam(example = "1", value = "ID do restaurante", required = true)
			Long restauranteId, 
			
			@ApiParam(example = "1", value = "ID de forma de pagamento", required = true)
			Long formaPagamentoId);
}
