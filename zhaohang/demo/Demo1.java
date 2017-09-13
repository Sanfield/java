package com.zhaohang.demo;

import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		int n=sc.nextInt();
		int num=gongbei(a,b);
		int count=0;
		System.out.println(n/num);
	}
	//最大公约数
	public static int gongyue(int x,int y){
		if(x>y){
			int t=x;
			x=y;
			y=t;
		}
		while(x!=0){
			int temp=y%x;
			y=x;
			x=temp;
		}
		return y;
	}
	//最小公倍数
	public static int gongbei(int x,int y){
		int a=x,b=y;
		int g=gongyue(a,b);
		return x*y/g;
	}
}
