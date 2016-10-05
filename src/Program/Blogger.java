package Program;

public class Blogger extends Visitor{

	public Blogger(int id) {
		super(id);
	}
	
	public void showType(){
		System.out.println("Visitor " + this.id + " is a Blogger.");
	}
	
	public boolean prefers(int loc){
		return false;
	}
	
}
