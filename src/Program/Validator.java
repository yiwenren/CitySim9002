package Program;

/**
*
* @author AsphaltPanthers
*/

public class Validator {
    public boolean validateArguments(String[] args) {
    	
        return validateNumberOfArguments(args) && validateArgumentType(args);
    }
    
    public boolean validateNumberOfArguments(String[] args) {
        return args.length == 1;
    }
    
    public boolean validateArgumentType(String[] args) {
        try {
            Integer.parseInt(args[0]);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}