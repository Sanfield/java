package com.math.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Fond_Tree {
	public static void main(String[] args) throws Exception, IOException {
		Scanner input= new Scanner(System.in);
		while(input.hasNext()){
			String str1=input.nextLine();
			String str2=input.nextLine();
			
		}
		
	}
	private static void showResult(String str1,String str2){
		char ch1=str2.charAt(str2.length()-1);
		
		
		
		System.out.print(ch1);
		
		int index=str1.indexOf(ch1);
		if(index>0){
			showResult(str1.substring(0, index),str2.substring(0, index));
		}
		if(index<str1.length()-1){
			showResult(str1.substring(index+1),str2.substring(index,str2.length()-1));
		}
		
	}
}
