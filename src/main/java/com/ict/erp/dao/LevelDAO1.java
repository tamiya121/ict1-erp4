package com.ict.erp.dao;

import java.util.List;

import com.ict.erp.vo.LevelInfo;

public interface LevelDAO1 {

	public List<LevelInfo> getLevelInfoList(LevelInfo li);
	public int insertLevel(LevelInfo li);
}
