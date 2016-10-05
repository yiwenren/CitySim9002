package Program;

import java.util.Random;

public class CitySim9002 {
    public static String errorMessage = "Please enter one integer argument, seed";
    
    public static void main(String[] args) {
    	
    	//check if the input is one integer. If not, quit the system.
        if (! new Validator().validateArguments(args)) {
        	System.out.println(errorMessage);
        	System.exit(0);
        }
        
        Random random = new Random(Integer.parseInt(args[0]));
 
        //start the game
        System.out.println("Welcome to CitySim!  Your seed is " + Integer.parseInt(args[0]) + ".");
        CitySim9002 cs = new CitySim9002();
        Visitor visitor = null; //generate visitor
        
        //generate information about these five visitors and trip 
        for(int i = 1; i <= 5; i++){
        	visitor = cs.generateVisitor(cs.generateType(random), i); //give the visitor a type
	        visitor.showType(); //show type
	        int loc = cs.generateFirstLoc(random); //choose a location for first visit
	        while(loc != 5){ //go around the city until the visit leaves
	        	visitor.goTo(loc); // visit the location
	        	System.out.println(visitor.showPreference(loc)); //print whether like it
	            loc = cs.generateLoc(random); //choose next location
	        }
	        visitor.goTo(loc); 
	        System.out.println("***");
        }
    }
    
    //generate different visitors according to different types
    public Visitor generateVisitor(int type, int id){
    	Visitor visitor = null;
    	switch(type){
    	case 1: visitor = new Student(id);
    			break;
    	case 2: visitor = new Professor(id);
    			break;
    	case 3: visitor = new BusinessPerson(id);
    			break;
    	case 4: visitor = new Blogger(id);
    			break;
    	}
    	return visitor;
    }
    
    //generate different visitor types 
    public int generateType(Random random){
		return random.nextInt(4) + 1;
	}
    
    //generate different locations for first visit
    public int generateFirstLoc(Random random){
		return random.nextInt(4) + 1;
	}
    
    //generate different locations for rest visit
    public int generateLoc(Random random){
		return random.nextInt(5) + 1;
	}
}
