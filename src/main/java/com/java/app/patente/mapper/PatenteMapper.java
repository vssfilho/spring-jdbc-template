package com.java.app.patente.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.java.app.patente.model.Patente;

public class PatenteMapper implements RowMapper<Patente>{

	@Override
	public Patente mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Patente patente = new Patente();
		patente.setID(resultSet.getInt("id"));
		patente.setNuPub(resultSet.getString("nu_pub"));
		patente.setNuPedidoInternacional(resultSet.getString("nu_pedido_intenacional"));
		patente.setDtPublicacao(resultSet.getDate("dt_publicacao"));
		return patente;
	}	
	
}
