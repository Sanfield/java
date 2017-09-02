package com.math.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion_Demo {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int number=Integer.valueOf(br.readLine());
		toString(Integer.toBinaryString(number));
	}
	private static void toString(String binary){
		char[] temp=binary.toCharArray();
		boolean control=false;
		for(int i=0;i<temp.length;i++){
			if(temp[i]=='1'){
				if(control)
					System.out.print("+");
				else
					control=true;
				System.out.print("2");
				int mi=temp.length-i-1;
				if(mi==0)
					System.out.print("(0)");
				else if(mi>1){
					System.out.print("(");
					toString(Integer.toBinaryString(mi));
					System.out.print(")");
				}
			}
		}
	}

}
