package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class AverageTest {

	Average avg = new Average();
	
	@Test
	public void testEmptyArrayList() {
		
		int output = avg.average(0, new int[] {});
		assertEquals(0,output);
	}
	
	@Test
	public void testKEqualZero() {
		
		int output = avg.average(0, new int[] {2,4,6});
		assertEquals(0,output);
	}
	
	@Test
	public void testKLessThanLength() {
		
		int output = avg.average(2, new int[] {2,4,6,8});
		assertEquals(3,output);
	}
	
	@Test
	public void testKGreaterThanLength() {
		
		int output = avg.average(5, new int[] {2,4,6,8});
		assertEquals(5,output);
	}
	
	@Test
	public void testKEqualToLength() {
		
		int output = avg.average(2, new int[] {2,4});
		assertEquals(3,output);
	}
	
	
	
	

}
