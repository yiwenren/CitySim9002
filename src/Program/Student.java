package Program;

public class Student extends Visitor {

	public Student(int id) {
		super(id);
	}
	
	public void showType(){
		System.out.println("Visitor " + id + " is a Student.");
	}
	
	
	public boolean prefers(int loc){
		if(loc == LOC_CL)
			return false;
		else {
			return true;
		}
	}
}
