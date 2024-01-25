package com.itbank.repository;

import java.sql.Date;
import java.text.SimpleDateFormat;

//import java.sql.ResultSet;
//import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAO {
	
	@Autowired private JdbcTemplate jdbcTemplate;

	public String selectBanner() {
		String sql = "select banner from v$version";
		
//		RowMapper<String> rowMapper = new RowMapper<String>() {
//			@Override
//			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
//				return rs.getString("banner");
//			}
//		};
		
		RowMapper<String> rowMapper = (rs, rownum) -> rs.getString("banner");
		// 위 주석처리한 부분을 한 줄로 처리!
		
		String version = jdbcTemplate.queryForObject(sql, rowMapper);
		return version;
	}

	public Date getDate() {
		String sql = "select sysdate from dual";
		RowMapper<Date> rowMapper = (rs, rownum) -> rs.getDate("sysdate");
		Date sysdate = jdbcTemplate.queryForObject(sql, rowMapper);
		
		return sysdate;
	}

}
