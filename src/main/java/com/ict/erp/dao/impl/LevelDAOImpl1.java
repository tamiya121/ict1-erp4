package com.ict.erp.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ict.erp.dao.LevelDAO1;
import com.ict.erp.vo.LevelInfo;



@Repository
public class LevelDAOImpl1 implements LevelDAO1 {
	
	@Autowired
	private SqlSessionTemplate ss;
	
	@Override
	public List<LevelInfo> getLevelInfoList(LevelInfo li) {
		return ss.selectList("SQL.LEVELINFO.selectLevelInfo",li);
		
	}

	@Override
	public int insertLevel(LevelInfo li) {
		return ss.insert("SQL.LEVELINFO.insertLevelInfo",li);
	}

}
