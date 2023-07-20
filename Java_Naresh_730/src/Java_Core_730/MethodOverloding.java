package Java_Core_730;

public class MethodOverloding {
	
	public void Selenium(int a,String name)
	{
		System.out.println(a);
		System.out.println(name);
	}
	public void Selenium(String name3,String name4)
	{
		System.out.println(name3);
		System.out.println(name4);
	}
	public void Selenium(String name6,int g)
	{
		System.out.println(name6);
		System.out.println(g);
	}
	
	public void Selenium(int f,int h)
	{
		int c=f+h;
		System.out.println(c);
	}

	public static void main(String[] args) {
		MethodOverloding obj=new MethodOverloding();
		obj.Selenium(23, 34);
		obj.Selenium(45, "javawithSelenium");
		obj.Selenium("selenium easy", 67);
		obj.Selenium("python", "Ruby");
	
	}

}
