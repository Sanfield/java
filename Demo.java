package com.dg.www;

public class Demo {
//用递归打印0-n
//改递归的关键时发现相似性
// 不能忘记 递归的出口
	public static void f (int n){
		if (n>0){
			f(n-1);
		}
		System.out.println(n);
	}
	public  static void f2(int begin,int end){
		if(begin>end) return;
		System.out.println(begin);
		f2(begin+1,end);
	}
	public static void main(String[] args){
		//f(9);
		f2(5,10);
	}
}

