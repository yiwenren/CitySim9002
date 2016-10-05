package Program;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BloggerTest {

	/*
	 * Bloggers dislike all locations. 
	 * So the return value of prefers(int loc) should all be false 
	 */
	@Test
	public void bloggerPrefers() {
		for(int i = 1; i <= 4; i++){
			Assert.assertFalse(new Blogger(1).prefers(i));
		}
	}
}
