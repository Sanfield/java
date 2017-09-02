package com.math.demo;

import java.util.Scanner;

public class Min_Multiple {
	 public static void main(String[] args) {
		
	
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		long s;
		if(n%2==1){
			s=n*(n-1)*(n-2);
		}else{
			if(n%3==0){
				s=(n-1)*(n-2)*(n-3);
			}else{
				s=n*(n-1)*(n-3);
			}
		}
		System.out.println(s);

	}
}


