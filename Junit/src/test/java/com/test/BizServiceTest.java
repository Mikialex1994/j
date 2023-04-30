package com.test;


import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import jakarta.annotation.security.RunAs;



/*private Utils utils=new Utils();

public String magic(String name){
	String result=utils.genString(name);
	result=result+" THANK YOU";
	return result;
}*/



public class BizServiceTest {

	@Mock
	private Utils utils;
	
	
	
	@InjectMocks
	private BizService bizService;
	

	@Before
	public void beforeAll() {
		 MockitoAnnotations.initMocks(this);
	}

	@Test
	public void string() {
		
		
		when(utils.genString(any(String.class))).thenReturn("Miki");
		String x = bizService.magic("MM");
		assertEquals("Miki THANK YOU", x);
		
		
	}
	
	
	@Test
	public void trys() {
		
    when(utils.genString(any(String.class))).thenReturn("God");
    String x = bizService.magic("mm");
    assertEquals("God THANK YOU", x);
		
	}
	
	@Test
	public void yesSir() {
		
		when(utils.genString(any(String.class))).thenReturn("Yes Sir");
        String x = bizService.magic("dhfb");
        assertEquals("Yes Sir Thanks!!", x);
	}
	
}
