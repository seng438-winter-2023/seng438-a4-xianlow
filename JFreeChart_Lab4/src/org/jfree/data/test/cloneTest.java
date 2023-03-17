package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.junit.Test;

public class cloneTest  extends DataUtilities{

	@Test
	public void test() {
		double[][] realArr = new double[][] {{1.2, 1.3}, {2.2, 2.3}};
		double[][] checkClone = DataUtilities.clone(realArr);
		assertArrayEquals(realArr, checkClone);
	}
	@Test(expected = IllegalArgumentException.class)
	 public void testNullVal() {
	     // setup
	     
	     // exercise
		 //Usage of the function with values stated above and using only column zero
		 
		 	
		double[][] checkClone = DataUtilities.clone(null);
	    	 
	    	 
	     
	     // tear-down: NONE in this test method
	 }

}
