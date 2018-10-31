/*package com.ict.erp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;


import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ict.erp.dao.UserInfoDAO;
import com.ict.erp.service.UserInfoService;
import com.ict.erp.vo.UserInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class Test1 {

	@Autowired
	private UserInfoService uis;
	@Autowired
	private UserInfoDAO uidao;
	@Test
	public void userInfoServiceTest() {
		List<UserInfo> uiList = uis.getUserInfoList(null);
		assertEquals(1, uiList.size());
	}
	@Test
	public void userInfoDAOTest() {
		
		List<UserInfo> uiList = uidao.getUserInfoList(null);
		assertEquals(1, uiList.size());
	}
	@Test
	public void userInfoServiceNotNullTest() {
		UserInfo ui = uis.getUserInfo(1);
		assertNotNull(ui);
	}
	@Test
	public void userInfoServiceNullTest() {
		UserInfo ui = uis.getUserInfo(0);
		assertNull(ui);
	}
	@Test
	public void userInfoDAONotNullTest() {
		UserInfo ui = uidao.getUserInfo(1);
		assertNotNull(ui);
	}
	@Test
	public void userInfoDAONullTest() {
		UserInfo ui = uidao.getUserInfo(0);
		assertNull(ui);
	}
}
*/