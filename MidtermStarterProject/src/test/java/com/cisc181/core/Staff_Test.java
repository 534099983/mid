package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	
	private static Staff ss;
	private static double ave;
	private static eTitle Title;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ArrayList ss=new ArrayList(5);
		ss.add(Staff("jim","ss","ss",new Date(),"1st","333-908-9000","gmail","1-2",2,1011.1,new Date(),Title));
		ss.add(Staff("roy","ss","ss",new Date(),"1st","333-908-9000","gmail","1-2",2,2011.1,new Date(),Title));
		ss.add(Staff("alxe","ss","ss",new Date(),"1st","333-908-9000","gmail","1-2",2,3011.1,new Date(),Title));
		ss.add(Staff("bob","ss","ss",new Date(),"1st","333-908-9000","gmail","1-2",2,4011.1,new Date(),Title));
		ss.add(Staff("kike","ss","ss",new Date(),"1st","333-908-9000","gmail","1-2",2,5011.1,new Date(),Title));
		
		
	}

	
	

	private static Object Staff(String string, String string2, String string3, Date date, String string4,
			String string5, String string6, String string7, int i, double d, Date date2, eTitle title2) {
		// TODO Auto-generated method stub
		return null;
	}




	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
