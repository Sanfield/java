package TherdRelearn;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {
	public static void main(String[] args) {
		int[] a={98,65,84,51};
		int[] b={65,88,65};
	//	System.out.println(a);
		for(int i:a){
			System.out.print(i+" ");
		}
		int []c =Arrays.copyOf(a, a.length+b.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		Arrays.sort(c);
		System.out.println();
		for(int i:c){
			System.out.print(i+" ");
		}
	}
}