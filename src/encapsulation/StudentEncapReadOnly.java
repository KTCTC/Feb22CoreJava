package encapsulation;

public class StudentEncapReadOnly {
	private int rollNum =56;
	private String name = "Ajay";
	private float marks = 89.55f;
	
	
	public int getRollNum() {
		return rollNum;
	}
	
	public String getName() {
		return name;
	}
	
	public float getMarks() {		
		
		return marks;
	}
	

}
