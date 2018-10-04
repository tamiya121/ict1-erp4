package com.ict.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.erp.dao.LevelDAO1;
import com.ict.erp.service.LevelService1;
import com.ict.erp.vo.LevelInfo;


@Service
public class LevelServiceImpl1 implements LevelService1 {
	
	@Autowired
	private LevelDAO1 ldao;
	
	@Override
	public List<LevelInfo> getLevelInfoList(LevelInfo li) {
		return ldao.getLevelInfoList(li);
	}

	@Override
	public int insertLevel(LevelInfo li) {
		return ldao.insertLevel(li);
	}

}
