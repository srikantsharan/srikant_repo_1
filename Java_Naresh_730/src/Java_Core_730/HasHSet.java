package Java_Core_730;

import java.util.HashSet;

public class HasHSet {

	public static void main(String[] args) {
	//	syntax of HashSet
		HashSet<Integer> Empid=new HashSet<Integer>();
		
		//store the EmpId's
		Empid.add(34);
		Empid.add(12);
		Empid.add(65);
		Empid.add(87);
		Empid.add(34);
		Empid.add(98);
		System.out.println("The emp id's is:"+Empid.size());
		System.out.println("=======");
		
		//get all the Empids
		for(Integer id:Empid)
		{
			System.out.println(id);
			
		}
		System.out.println("=======");
		//remove the empid
		Empid.remove(87);
		
		//after remove the empid print remaing
		//this first verification,cross check
		for(Integer id:Empid)
		{
			System.out.println(id);
			
		}
		System.out.println("=======");
		//second verification,cross check
		if(Empid.contains(87))
		{
			System.out.println("is availble");
		}
		else
		{
			System.out.println("is not availble");
		}
		

	}

}
