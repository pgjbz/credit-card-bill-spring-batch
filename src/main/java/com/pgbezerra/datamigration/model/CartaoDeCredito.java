package com.pgbezerra.datamigration.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartaoDeCredito implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer numero;
	private Cliente cliente;
	
}
