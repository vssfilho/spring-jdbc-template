package com.java.app.patente.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.java.app.interfaces.GenericDao;
import com.java.app.patente.mapper.PatenteMapper;
import com.java.app.patente.model.Patente;

@Component
public class PatenteDao implements GenericDao<Patente> {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public PatenteDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public Patente getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patente> getAll() {
		return jdbcTemplate.query("select * from tb_patente", new PatenteMapper());
	}

	@Override
	public boolean delete(Patente ojbect) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Patente ojbect) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean create(Patente ojbect) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	
	
}
