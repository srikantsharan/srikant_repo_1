package Java_Core_730;

public class Addition_Exp2 {
	
	public static void Add()
	{
		int a=34;
		int b=56;
		int c=a+b;
		System.out.println(c);
	}
	public static void Div()
	{
		int d=55;
		int f=5;
		int g=d/f;
		System.out.println(g);
	}
	public void Mul()
	{
		int q=34;
		int t=23;
		int u=q*t;
		System.out.println(u);
	}
	public void Sub()
	{
		int x=234;
		int y=123;
		int z=x-y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		Addition_Exp2 obj=new Addition_Exp2();
		obj.Sub();
		obj.Div();
		obj.Add();
		obj.Mul();

	}

}
