package encapsulation;

public class StudentEncap {
	private int rollNum;
	private String name;
	private float marks;
	
	
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		
		
		return marks;
	}
	public void setMarks(float marks) {
		
		if (marks<0)
		{
			this.marks = 0;
		}
		else if(marks>100)
		{
			this.marks = 100;
		}
		else
		{
			this.marks = marks;
		}
		
	}

}
