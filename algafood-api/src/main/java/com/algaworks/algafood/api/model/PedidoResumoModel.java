package com.algaworks.algafood.api.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.algaworks.algafood.domain.model.StatusPedido;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

//@JsonFilter("pedidoFilter")
@Getter
@Setter
public class PedidoResumoModel {

	@ApiModelProperty(example = "f9981ca4-5a5e-4da3-af04-933861df3e55", value = "Código do pedido")
	private String codigo;
	
	@ApiModelProperty(example = "298.90", value = "Valor sub total do pedido")
	private BigDecimal subTotal;
	
	@ApiModelProperty(example = "10.00", value = "Valor do frete do pedido")
	private BigDecimal taxaFrete;
	
	@ApiModelProperty(example = "308,90", value = "Valor total do pedido")
	private BigDecimal valorTotal;
	
	@ApiModelProperty(example = "CRIADO", value = "Status do pedido")
	private StatusPedido status;
	
	@ApiModelProperty(example = "2022-06-07T00:50:39Z", value = "Data da criação do pedido")
	private OffsetDateTime dataCriacao;
	
	
	private RestauranteResumoModel restaurante;
	
	
//	private UsuarioModel cliente;
	@ApiModelProperty(example = "Débora Mendonça", value = "Nome do Cliente")
	private String nomeCliente;
}
