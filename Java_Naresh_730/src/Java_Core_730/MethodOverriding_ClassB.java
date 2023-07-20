package Java_Core_730;

public class MethodOverriding_ClassB extends MethodOverriding_ClassA{
	public void Automation(int x,int p)
	{
		int z=x+p;
		System.out.println(z);
	}
	public void Automation(String n1,String n3)
	{
		System.out.println(n1);
		System.out.println(n3);
	}
	public void Automation(String name5,int y)
	{
		System.out.println(name5);
		System.out.println(y);
	}

	public static void main(String[] args) {
		MethodOverriding_ClassB obj=new MethodOverriding_ClassB();
		obj.Automation(34, 12);
		obj.Automation("JavawithSelenium", 12);
		obj.Automation("Automation", "JAva");
		

	}

}
