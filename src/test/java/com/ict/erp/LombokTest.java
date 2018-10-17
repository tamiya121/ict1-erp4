package com.ict.erp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j // log를 알아서 찾아줌
public class LombokTest {

	@Test
	public void test() {
		TestVO tvo = new TestVO();
		tvo.setTest("abc");
		tvo.setT1("t1");
		tvo.setT2("t2");
		tvo.setT3("t3");
		tvo.setT4("t4");
		log.info("tvo=>{}",tvo);
		assertEquals(tvo.getTest(), "abc");
		
	}

}
