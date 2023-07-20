package Java_Core_730;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BobbleSort_Exp {

	public static void main(String[] args) {
		Integer[] a= {20,10,80,40,60,50};
		System.out.println("Before sorting ...:"+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Descending sorting ...:"+Arrays.toString(a));
		
	}

}
