package com.itbank.repository;

import java.sql.Date;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Test2DAO {
	
	@Autowired private SqlSessionTemplate sst;

	public String selectBanner() {
//		String sql = "select banner from v$version";
//						sst.selectOne("namespace.id");
		String version = sst.selectOne("test2.selectVersion");
		return version;
	}

	public Date selectSysDate() {
		Date sysdate = sst.selectOne("test2.selectSysdate");
		return sysdate;
	}
	
	

}
