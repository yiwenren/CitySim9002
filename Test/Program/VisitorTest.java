package Program;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;

public class VisitorTest {

	/*
	 * LOC_CL, LOC_SH, LOC_TO and LOC_DT stand for four locations respectively.
	 * If input LOC_DT, we will get "Downtown" return.
	 */
	@Test
	public void getLocNameCorrect() {
		Visitor visitor = new Visitor(1);
		Assert.assertEquals("Downtown", visitor.getLocName(Visitor.LOC_DT));
	}
	
	/*
	 * If the input doesn't belong to  LOC_CL, LOC_SH, LOC_TO, LOC_DT.
	 * Null will be returned.
	 */
	@Test
	public void getLocNameNull(){
		Assert.assertNull(new Visitor(1).getLocName(0));
	}
	
	/*
	 * Check whether the showPreference(int loc) could function successfully.
	 * In this case, student with id equaling to 1 likes the point, so return 
	 * "Visitor 1 did like The Point."
	 */
	@Test
	public void showPreferenceCorrect(){
		Student mockStudent = mock(Student.class);
		when(mockStudent.prefers(Visitor.LOC_TP)).thenReturn(true);
		when(mockStudent.getId()).thenReturn(1);
		when(mockStudent.getLocName(Visitor.LOC_TP)).thenReturn("The Point");
		when(mockStudent.showPreference(Visitor.LOC_TP)).thenCallRealMethod();
		System.out.println(mockStudent.showPreference(Visitor.LOC_TP));
		Assert.assertEquals("Visitor 1 did like The Point.", mockStudent.showPreference(Visitor.LOC_TP));
	}
	
	/*
	 * For a visitor whose id is two, the getId() function should return 2.
	 * return true.
	 */
	@Test
	public void getIdCorrect(){
		Visitor visitor = new Visitor(2);
		Assert.assertTrue(visitor.getId() == 2);
	}
	
	/*
	 * For a student whose id is two, after calling stop() function, "Visitor 1 has
	 * left the city" should be returned.
	 */
	@Test
	public void visitorLeave(){
		Student mockStudent = mock(Student.class);
		when(mockStudent.getId()).thenReturn(1);
		when(mockStudent.stop()).thenCallRealMethod();
		Assert.assertEquals("Visitor 1 has left the city.", mockStudent.stop());
	}
	

}
