package com.dg.www;

public class Pluss {
	/*利用递归求数组元素之和
	 * 
	 */
	public static int f(int[] a,int begin){
		if(begin==a.length)
			return 0;
		int x= f(a,begin+1);
		return x+ a[begin];
	}
	public static void main(String[] args) {
		int[] a={5,5,3,1,4,6,7,5};
		int sum=f(a,0);
		System.out.println(sum);
	}

}
