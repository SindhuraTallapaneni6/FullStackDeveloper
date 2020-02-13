package com.cts.training.spring.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.training.spring.dao.DataDAO;
import com.cts.training.spring.model.Data;
@Repository(value = "dataDAOImpl")
public class DataDAOImpl implements DataDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public boolean addData(Data data) {
		String query = "insert into data values(?,?,?,?,?)";

		try {
			jdbcTemplate.update(query, data.getId(), data.getName(), data.getUsername(), data.getPassword(),
					data.getPhone());
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean updateData(Data data) {
		
		String query = "update data set  Name=?, UserName=?,Password=?,phone=? where id =?";
				try {
				
				jdbcTemplate.update(query,  data.getName(),
				data.getUsername(),data.getPassword(), data.getPhone(),data.getId());
				return true;
				}
				catch (DataAccessException e) {
				e.printStackTrace();
				
				return false;
				}
	}

	public boolean deleteData(Data data) {
		String query = "delete from data where id =?";
		try {
		jdbcTemplate.update(query, data.getId());
		return true;
		} catch (DataAccessException e) {
		e.printStackTrace();
		return false;
		}
	}

	public Data getDataById(int id) {
		
		String query = "select * from data where id =?";
		RowMapper<Data> rowMapper = new BeanPropertyRowMapper<Data>(Data.class);
		return jdbcTemplate.queryForObject(query, rowMapper, id);
	}

	public List<Data> getAllData() {
		return jdbcTemplate.query("select * from data", new RowMapper<Data>() {
			public Data mapRow(ResultSet rs, int rownumber) throws SQLException {
			Data data = new Data();
			data.setId(rs.getInt(1));
			data.setName(rs.getString(2));
			data.setUsername(rs.getString(3));
			data.setPassword(rs.getString(4));
			data.setPhone(rs.getLong(5));
			return data;
			}
			});
	}

}
