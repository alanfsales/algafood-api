package com.algaworks.algafood.domain.filter;

import java.time.OffsetDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PedidoFilter {

	@Parameter(example = "1", description = "ID do cliente para filtro da perquisa")
	private Long clienteId;
	
	@Parameter(example = "1", description = "ID do restaurante para filtro da perquisa")
	private Long restauranteId;
	
	@Parameter(example = "2019-10-30T00:00:00Z",
	        description = "Data/hora de criação inicial para filtro da pesquisa")
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private OffsetDateTime dataCriacaoInicio;
	
    @Parameter(example = "2019-11-01T10:00:00Z",
	        description = "Data/hora de criação final para filtro da pesquisa")
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private OffsetDateTime dataCriacaoFim;
	
}
