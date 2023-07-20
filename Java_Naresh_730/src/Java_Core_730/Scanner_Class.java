package Java_Core_730;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		//syntax of Scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Mr Anil please enter first value");
		int a=sc.nextInt();
		System.out.println("Mr Anil please provide Second Value");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("The value is:"+c);

	}

}
