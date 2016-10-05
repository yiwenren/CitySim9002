package Program;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class StudentTest {

	/*
	 * Student dislikes the Cathedral of Learning.
	 * So prefers(Program.Visitor.LOC_CL) should return false.
	 */
	@Test
	public void studentDisPreCL() {
		Assert.assertFalse(new Student(1).prefers(Program.Visitor.LOC_CL));
	}
	
	/*
	 * Student likes all other locations.
	 * So for all other locations, the function prefers(int loc) 
	 * should return true.
	 */
	@Test
	public void studentPre(){
		for(int i = 2; i <= 4; i++){
			Assert.assertTrue(new Student(1).prefers(i));
		}
	}

}
