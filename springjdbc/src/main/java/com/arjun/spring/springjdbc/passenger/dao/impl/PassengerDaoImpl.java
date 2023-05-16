package com.arjun.spring.springjdbc.passenger.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.arjun.spring.springjdbc.passenger.dao.PassengerDao;
import com.arjun.spring.springjdbc.passenger.dao.rowmapper.PassengerRowMapper;
import com.arjun.spring.springjdbc.passenger.dto.Passenger;

@Component("passengerDao")
public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private int id;

	@Override
	public int create(Passenger passenger) {
		String sql = "insert into passenger values(?,?,?)";
		int res = jdbcTemplate.update(sql, passenger.getId(), passenger.getFirstName(), passenger.getLastName());
		return res;
	}

	@Override
	public int update(Passenger passenger) {
		String sql = "update passenger set firstname=?,lastname=? where id=?";
		int res = jdbcTemplate.update(sql, passenger.getFirstName(), passenger.getLastName(), passenger.getId());
		return res;
	}
	
	@Override
	public int delete(int id) {
		String sql = "delete from passenger where id=?";
		int res = jdbcTemplate.update(sql, id);
		return res;
	}

	@Override
	public Passenger read(int id) {
		String sql = "select * from passenger where id=?";
		PassengerRowMapper rowMapper=new PassengerRowMapper();
		Passenger p= jdbcTemplate.queryForObject(sql, rowMapper, id);
		return p;
	}
	
	@Override
	public List<Passenger> read() {
		String sql = "select * from passenger";
		PassengerRowMapper rowMapper = new PassengerRowMapper();
		List<Passenger> p= jdbcTemplate.query(sql, rowMapper);
		return p;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}






}
