package Java_Core_730;

public class Odd_Even_Numbers_Java {

	public static void main(String[] args) {
		int[] a= {12,6,23,7,6,8,3,13,14};
		for(int c:a)
		{
			if(c%2!=0)
			{
				System.out.println(c);
			}
		}
		System.out.println("odd numbers...");
		 for(int c:a)
		 {
			 if(c%2==0)
			 {
				 System.out.println(c);
			 }
		 }
		 System.out.println("Even numbers....");
		  
		 

	}

}
