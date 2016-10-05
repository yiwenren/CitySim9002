package Program;

public class Visitor {
	int id;
	
	public static final int LOC_CL = 1;
	public static final int LOC_SH = 2;
	public static final int LOC_TP = 3;
	public static final int LOC_DT = 4;
	public static final int LOC_LEAVE = 5;
	
	
	public Visitor(int id){
		this.id = id;
	}
	
	public int getId(){
		return this.id;
	}
	
	//the subclasses could overwrite this method to show the visitor's type and id.
	public void showType(){}
	
	//showing where the visitor is going
	public void goTo(int loc){
		String goTo = "";
		if(loc == LOC_LEAVE) goTo = stop();
		else {
			goTo = "Visitor " + this.id + " is going to " + getLocName(loc) + "!";
		}	
		System.out.println(goTo);
	}
	
	//the other subclass could overwrite this method to show whether this visitor likes a certain location
	public boolean prefers(int loc){
		return false;
	}
	
	//print whether his visitor likes a certain location or not
	public String showPreference(int loc){
		if(this.prefers(loc)){
			return "Visitor " + this.getId() +  " did like " + this.getLocName(loc) + ".";
		} else {
			return "Visitor " + this.getId() +  " did not like " + this.getLocName(loc) + ".";
		}
	}
	
	//print the visitor has left this city
	public String stop(){
		return "Visitor " + this.getId() + " has left the city.";
	}

	//get a certain location's name
	public String getLocName(int loc){
		switch(loc){
			case LOC_CL: return "The Cathedral of Learning";
			case LOC_SH: return "Squirrel Hill";
			case LOC_TP: return "The Point";
			case LOC_DT: return "Downtown";
			default: return null;
		}
	}
	
}
