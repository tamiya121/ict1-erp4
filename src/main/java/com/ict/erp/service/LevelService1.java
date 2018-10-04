package com.ict.erp.service;

import java.util.List;

import com.ict.erp.vo.LevelInfo;



public interface LevelService1 {
	
	public List<LevelInfo> getLevelInfoList(LevelInfo li);
	public int insertLevel(LevelInfo li);

}
