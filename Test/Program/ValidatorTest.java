package Program;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
*
* @author AsphaltPanthers
*/
public class ValidatorTest {
	
	/*
	 * The program shall accept one and only one argument.
	 */
   @Test
   public void ifOneArgumentIsProvidedReturnTrue() {
       Assert.assertTrue(new Validator().validateNumberOfArguments(new String[] { "1" }));
   }
   
   /*
    * If the program is passed in any number of arguments other than 1, including 0, the function
    * should return false.
    */
   @Test
   public void ifOneArgumentIsNotProvidedReturnFalse() {
       Assert.assertFalse(new Validator().validateNumberOfArguments(new String[] { "1", "2" }));
   }
   
   /*
    * The program should accept an integer.
    */
   @Test
   public void ifArgumentIsAnIntegerReturnTrue() {
       Assert.assertTrue(new Validator().validateArgumentType(new String[] { "1" }));
   }
   
   /*
    * The program should only accept an integer. Otherwise, the function 
    * validateArgumentType will return false.
    */
   @Test
   public void ifArgumentIsNotAnIntegerReturnFalse() {
       Assert.assertFalse(new Validator().validateArgumentType(new String[] { "test" }));
   }
   
   /*
    * If the input is an integer, it satisfies the requirements. 
    * return true.
    */
   @Test
   public void ifArgumentsLengthAndArgumentTypesIsCorrect(){
       Validator mockValidator = mock(Validator.class);
       when(mockValidator.validateNumberOfArguments(any(String[].class))).thenReturn(true);
       when(mockValidator.validateArgumentType(any(String[].class))).thenReturn(true);
       when(mockValidator.validateArguments(any(String[].class))).thenCallRealMethod();
       Assert.assertTrue(mockValidator.validateArguments(new String[0]));
   }
}
