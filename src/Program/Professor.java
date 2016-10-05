package Program;

public class Professor extends Visitor {
	public Professor(int id) {
		super(id);
	}

	public void showType(){
		System.out.println("Visitor " + this.id + " is a Professor.");
	}
	
	public boolean prefers(int loc){
		return true;
	}
}
