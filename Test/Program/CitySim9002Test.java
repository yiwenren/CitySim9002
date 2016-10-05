package Program;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Matchers.any;

public class CitySim9002Test {

	/*
	 * Test whether a student object generated belongs to student type. 
	 */
	@Test
	public void generateVisitorTypeCorrect() {
		CitySim9002 cs = new CitySim9002();
		Assert.assertEquals(cs.generateVisitor(1, 1).getClass().getSimpleName(), "Student");
	}
	
	/*
	 * Test whether the id of the Visitor object generated is correct.
	 */
	@Test
	public void generateVisitorIdCorrect() {
		CitySim9002 cs = new CitySim9002();
		Assert.assertEquals(cs.generateVisitor(1, 1).id, 1);
	} 
	
	/*
	 * Each number from one to four stands for different kinds of visitor.
	 * The return value should only be a int of 1-4.
	 * Returning 2 means the visitor type is professor. 
	 */
	@Test
	public void generateTypeCorrect() {
		Random mockRandom = mock(Random.class);
		CitySim9002 cs = new CitySim9002();
		when(mockRandom.nextInt(any(int.class))).thenReturn(1);
		Assert.assertEquals(cs.generateType(mockRandom), 2);
	} 
	
	/*
	 * Each number from one to four stands for different locations.
	 * The return value should only be a int of 1-4.
	 * Returning 2 means the location visitor visits first 
	 * is Squirrel Hill.
	 */
	@Test
	public void generateFirstLocCorrect() {
		Random mockRandom = mock(Random.class);
		CitySim9002 cs = new CitySim9002();
		when(mockRandom.nextInt(any(int.class))).thenReturn(1);
		Assert.assertEquals(cs.generateFirstLoc(mockRandom), 2);
	} 
	
	/* 
	 * After first visit, there will be five choices for visitors to go.
	 * Besides one to four, number five means the visitor will leave.
	 * In this case, returning 4 means the visitor is going to Downtown.
	 */
	@Test
	public void generateLocCorrect() {
		Random mockRandom = mock(Random.class);
		CitySim9002 cs = new CitySim9002();
		when(mockRandom.nextInt(any(int.class))).thenReturn(3);
		Assert.assertEquals(cs.generateLoc(mockRandom), 4);
	} 
	
	/*
	 * The return value could equal to five, which means the visitor has
	 * left this city.
	 */
	@Test
	public void generateLeaveCorrect(){
		Random mockRandom = mock(Random.class);
		CitySim9002 cs = new CitySim9002();
		when(mockRandom.nextInt(any(int.class))).thenReturn(4);
		Assert.assertFalse(cs.generateLoc(mockRandom) != 5);
	}
	

}
