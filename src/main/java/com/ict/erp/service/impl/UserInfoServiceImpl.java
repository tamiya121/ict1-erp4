package com.ict.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.erp.dao.UserInfoDAO;
import com.ict.erp.service.UserInfoService;
import com.ict.erp.vo.UserInfo;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoDAO lidao;
	
	@Override
	public List<UserInfo> getUserInfoList(UserInfo ui) {
		return lidao.getUserInfoList(ui);
	}

	@Override
	public int insertUserInfo(UserInfo ui) {
		return lidao.insertUserInfo(ui);
	}

	@Override
	public int deleteUserInfo(int uiNum) {
		return lidao.deleteUserInfo(uiNum);
	}

	@Override
	public UserInfo getUserInfo(Integer uiNum) {
		return lidao.getUserInfoList(uiNum);
	}

	@Override
	public int updateUserInfo(UserInfo ui) {
		return lidao.updateUserInfo(ui);
	}

}
