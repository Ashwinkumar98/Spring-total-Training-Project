package com.cts.dummy.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cts.dummy.Service.Addtion;
import com.cts.dummy.Service.ArtithmeticService;

public class AdditionTest {

	@Test
	public void testAdd() {
		ArtithmeticService add=new Addtion();
		
		int res=add.add(10, 5);
		int expect=15;
		
		assertEquals(expect, res);
	}

}
