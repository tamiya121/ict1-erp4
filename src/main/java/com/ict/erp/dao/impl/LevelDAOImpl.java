package com.ict.erp.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ict.erp.dao.LevelDAO;
import com.ict.erp.vo.LevelInfo;



@Repository
public class LevelDAOImpl implements LevelDAO {
	
	@Autowired
	private SqlSessionTemplate ss;
	
	@Override
	public List<LevelInfo> getLevels() {
		return ss.selectList("SQL.LEVELINFO.selectLevelInfo");
		
	}

}
