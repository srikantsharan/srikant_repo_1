package Java_Core_730;

abstract class minili
{
	abstract void kanili();
	abstract void jimili();
}
class nimili extends minili
{
	public void kanili()
	{
		System.out.println("Hi");
	}
	public void jimili()
	{
		System.out.println("Hello");
	}
}
public class abstractiExp {

	public static void main(String[] args) {
		nimili obj=new nimili();
		obj.kanili();
		obj.jimili();
				

	}

}
