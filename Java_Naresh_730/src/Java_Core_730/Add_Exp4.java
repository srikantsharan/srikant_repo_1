package Java_Core_730;

public class Add_Exp4 {
	public void Add(int a, int b)
	{
		int c=a+b;
		System.out.println("the vaue is:"+c);
	}
	public void Mul(int d,int e)
	{
		int h=d*e;
		System.out.println("the vaue is:"+h);
	}
	public void Div(int r,int t)
	{
		int y=r/t;
		System.out.println("the vaue is:"+y);
	}
	public void Sub(int u,int o)
	{
		int j=u-o;
		System.out.println("the vaue is:"+j);
	}

	public static void main(String[] args) {
		Add_Exp4 obj=new Add_Exp4();
		obj.Add(250, 350);
		obj.Div(45, 5);
		obj.Mul(34, 78);
		obj.Sub(12, 56);
		

	}

}
