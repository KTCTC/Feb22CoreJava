package object.classs;

public class HumanBeing {
	
	int height =89;
	String name;
	float weight = 33.44f;
	
	public void canTalk()
	{
		System.out.println("Human can talk");
		System.out.println("Human can talk 2");
		System.out.println("Human can talk 3");
		System.out.println("Human can talk 4");
		
	}
	
	public void eatsFood()
	{
		System.out.println("Human consumes food");
	}
	
	public static void main(String[] args) {
		
		byte bt = 0;
		byte aa = bt;
		HumanBeing oi = new HumanBeing();
		HumanBeing obj = new HumanBeing();
		HumanBeing oo = new HumanBeing();		
		HumanBeing obb = oo;
		
		
		System.out.println(obj.name);
		
		oo.eatsFood();
		
		obj.height = 5;
		obj.name = "Ganesh";
		obj.weight = 55.67f;
		
		oo.height = 6;
		oo.weight = 89;
		oo.name = "Sameer";	
		
		obb.height = 777;
		
		int abcd = obj.height;		
		System.out.println(abcd);
		System.out.println(obj.height);		
		System.out.println(obj.weight);
		System.out.println(obj.name);
		
		System.out.println(oo.height);		
		System.out.println(oo.weight);
		System.out.println(oo.name);
		
		System.out.println(obb.height);		
		System.out.println(obb.weight);
		System.out.println(obb.name);
		
		obj.canTalk();
		
		
	}
	

}
