package com.btk.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.btk.domain.Compte;

public class TestCompteRepositoryImpl_Hibernate {
	
	private ICompteRepository underTest;
	

	@Before
	public void setUp() throws Exception {
		
		underTest=new CompteRepositoryImpl_Hibernate();
		
	}

	@After
	public void tearDown() throws Exception {
		underTest=null;
	}

	@Test
	public final void testCreate() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testFindById() {
		
		
//arrange
	String id	="A1000";
		Compte expected =new Compte("A1000","NIZAR",new BigDecimal("1000.000"));
		//ACT
		
		Compte actual=underTest.findById(id);
		//ASSERT
		
		assertEquals(expected, actual);
	}

	@Test
	public final void testFindAll() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testUpdate() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testDelete() {
		fail("Not yet implemented"); // TODO
	}

}
