package com.ict.erp.service;

import java.util.List;

import com.ict.erp.vo.UserInfo;



public interface UserInfoService {
	public List<UserInfo> getUserInfoList(UserInfo ui);
	public int insertUserInfo(UserInfo ui);
	public int deleteUserInfo(int uiNum);
	public UserInfo getUserInfo(Integer uiNum);
	public int updateUserInfo(UserInfo ui);
}
