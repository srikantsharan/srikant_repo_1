package Java_Core_730;

public class Primenumber_Exp {

	public static void main(String[] args) {
		int num=100;//i want print 
		for(int i=2;i<=num;i++)
		{
			int count=0;//4+1=5=6/1/2/3/4/5/6/7
			for(int j=2;j<i;j++)
			{
				if(i%j==0)//4=0
				{
					count++;//0-100
				}
			}
			if(count==0)
			{
				System.out.println(i+" ");
			}
		}

	}

}
