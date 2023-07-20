package Java_Core_730;

public class Encapslation_ClassA {
	private String Stu_name;
	private int Stu_id;
	private int Stu_age;
	private int Stu_batch;
	private String Stu_Section;
	public void Set_name(String name)
	{
		this.Stu_name=name;
	}
	public String getname()
	{
		return Stu_name;
	}
	public void Set_id(int id)
	{
		this.Stu_id=id;
	}
	public int getid()
	{
		return Stu_id;
	}
	public void set_age(int age)
	{
		this.Stu_age=age;
	}
	public int getage()
	{
		return Stu_age;
	}
    public static void main(String[] args) {
    	Encapslation_ClassA obj=new Encapslation_ClassA();
    	obj.Set_name("Selenium");
    	obj.Set_id(23);
    	obj.set_age(12);
    	System.out.println(obj.getname());
    	System.out.println(obj.getid());
    	System.out.println(obj.getage());
		

	}

}
