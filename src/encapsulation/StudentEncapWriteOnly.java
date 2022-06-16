package encapsulation;

public class StudentEncapWriteOnly {
	private int rollNum;
	private String name;
	private float marks;
	
	
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	
	public void setName(String name) {
		this.name = name;
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
