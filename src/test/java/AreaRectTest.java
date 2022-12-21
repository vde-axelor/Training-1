package com.area;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.basic.AreaRect;

public class AreaRectTest{
	@Test
	public void testZeroValues(){
		int e=0;
		int g=new AreaRect().calRect(0,2);
		assertEquals("zero value test",e,g);
	}
}
