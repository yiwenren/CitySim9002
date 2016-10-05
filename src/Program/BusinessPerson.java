package Program;

public class BusinessPerson extends Visitor {
	public BusinessPerson(int id) {
		super(id);
	}

	public void showType(){
		System.out.println("Visitor " + this.id + " is a Business Person.");
	}
	
	public boolean prefers(int loc){
		if(loc == LOC_SH || loc == LOC_DT){
			return true;
		} else {
			return false;
		}
	}
}