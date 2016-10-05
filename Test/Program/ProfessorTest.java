package Program;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ProfessorTest {

	/*
	 * Professor shall like all locations, which means the return values
	 * of prefers(int loc) should be true.
	 */
	@Test
	public void professorPrefers() {
		for(int i = 1; i <= 4; i++){
			Assert.assertTrue(new Professor(1).prefers(i));
		}
	}
}
