package Program;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class BusinessPersonTest {

	/*
	 * Business Person likes Squirrel Hill. 
	 * So the return value of prefers(LOC_SH) should be true.
	 */
	@Test
	public void bpPreSquirrelHill() {
		Assert.assertTrue(new BusinessPerson(1).prefers(Program.Visitor.LOC_SH));
	}
	
	/*
	 * Business Person likes DownTown. 
	 * So the return value of prefers(LOC_DT) should be true.
	 */
	@Test
	public void bpPreDownTown() {
		Assert.assertTrue(new BusinessPerson(1).prefers(Program.Visitor.LOC_DT));
	}
	
	/*
	 * Business Person dislikes The Cathedral of Learning. 
	 * So the return value of prefers(LOC_CL) should be false.
	 */
	@Test
	public void bpDisPreCL() {
		Assert.assertFalse(new BusinessPerson(1).prefers(Program.Visitor.LOC_CL));
	}
	
	/*
	 * Business Person dislikes The Point. 
	 * So the return value of prefers(LOC_TP) should be false.
	 */
	public void bpDisPreThePoint() {
		Assert.assertFalse(new BusinessPerson(1).prefers(Program.Visitor.LOC_TP));
	}
	
	
	

}
