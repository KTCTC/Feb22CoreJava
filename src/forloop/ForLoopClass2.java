package forloop;

public class ForLoopClass2 {

	public static void main(String[] args) {
		System.out.println("Before for loop");
		
		int arr[] = {2,5,45,23,67,4,56,445};
		
		AA :for (int i = arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("-------------------------------------------");

		for (int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		System.out.println("After for loop");
	}

}
