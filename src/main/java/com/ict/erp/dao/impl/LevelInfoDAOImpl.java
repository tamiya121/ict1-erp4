package com.ict.erp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ict.erp.dao.LevelInfoDAO;
import com.ict.erp.vo.LevelInfo;

@Repository
public class LevelInfoDAOImpl implements LevelInfoDAO {
	
	@Autowired
	private SqlSession ss;

	@Override
	public List<LevelInfo> getLevelInfoList(LevelInfo li) {
		// TODO Auto-generated method stub
		return ss.selectList("SQL.LEVELINFO.selectLevelInfo",li);
	}

	@Override
	public int insertLevelInfo(LevelInfo li) {
		// TODO Auto-generated method stub
		return ss.insert("SQL.LEVELINFO.insertLevelInfo",li);
	}

	@Override
	public int deleteLevelInfo(int linum) {
		// TODO Auto-generated method stub
		return ss.delete("SQL.LEVELINFO.deleteLevelInfo",linum);
	}

	@Override
	public LevelInfo getLevelInfoList(Integer linum) {
		// TODO Auto-generated method stub
		return ss.selectOne("SQL.LEVELINFO.selectLevelInfoOne",linum);
	}

	@Override
	public int updateLevelInfo(LevelInfo li) {
		return ss.update("SQL.LEVELINFO.updateLevelInfo", li);
	}

}
