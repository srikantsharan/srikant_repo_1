package Java_Core_730;

public class Single_Inheritance_ClassB extends Single_Inheritance_ClassA {

	public static void main(String[] args) {
		
		Single_Inheritance_ClassB obj=new Single_Inheritance_ClassB();
		obj.Add(23, 45);
		System.out.println(obj.Div());
		obj.Sub(34, 12);
		obj.Mul();
	}

}
