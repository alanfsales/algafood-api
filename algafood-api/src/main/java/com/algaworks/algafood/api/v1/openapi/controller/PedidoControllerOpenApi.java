package com.algaworks.algafood.api.v1.openapi.controller;

import com.algaworks.algafood.api.v1.model.PedidoModel;
import com.algaworks.algafood.api.v1.model.input.PedidoInput;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

//@Api(tags = "Pedidos")
@SecurityRequirement(name = "security_auth")
public interface PedidoControllerOpenApi {

//	@ApiImplicitParams({
//		@ApiImplicitParam(value = "Nome das propriedades para filtrar na resposta, separados por vírgula",
//				name = "campos", paramType = "query", type = "string")
//	})
//	@ApiOperation("Pesquisa os pedidos")
//	PagedModel<PedidoResumoModel> pesquisar(PedidoFilter filtro, Pageable pageable);
	
//	@ApiOperation("Registra um pedido")
//	@ApiResponses({
//		@ApiResponse(code = 201, message = "Pedido registrado")
//	})
	PedidoModel adicionar(
//			@ApiParam(name = "corpo", value = "Representaçao de um novo pedido", required = true)
			PedidoInput pedidoInput);
	
//	@ApiImplicitParams({
//		@ApiImplicitParam(value = "Nome das propriedades para filtrar na resposta, separados por vírgula",
//				name = "campos", paramType = "query", type = "string")
//	})
//	@ApiOperation("Busca um pedido por código")
//	@ApiResponses({
//		@ApiResponse(code = 404, message = "Pedido não encontrado", response = Problem.class)
//	})
	PedidoModel buscar(
//			@ApiParam(example = "f9981ca4-5a5e-4da3-af04-933861df3e55", value = "Código de um pedido", required = true)
			String codigoPedido);
	
}
