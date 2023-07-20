package Java_Core_730;

public class Multilevel_Inheritance_ClassB extends Multilevel_Inheritance_ClassA {
     public void Java()
     {
    	String name="selenium very easy tool";
    	System.out.println(name);
     }
     public void selenium()
     {
    	 String name2="without practice it's very difficult";
    	 System.out.println(name2);
     }
	public static void main(String[] args) {
		Multilevel_Inheritance_ClassB obj=new Multilevel_Inheritance_ClassB();
		//total 3 methods
		System.out.println(obj.Add());
		obj.Sub();
		obj.Java();
	//	System.out.println(obj.name);
		
	}

}
