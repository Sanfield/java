package com.math.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo_2115 {
	public static void main(String[] args)  throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr=new int[n];
		String st[]=br.readLine().split(" ");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(st[i]);
		}
		Arrays.sort(arr);
		
		int m = Integer.parseInt(br.readLine());
		int[] tag=new int[m];
		String str[]=br.readLine().split(" ");
		for(int i=0;i<tag.length;i++){
			tag[i]=Integer.parseInt(str[i]);
			
		}
		Arrays.sort(tag);
		func(arr,tag);
		
		
	}
	public static void func(int[] arr,int[]tag){
		int x;
		for(int i=0;i<arr.length;i++){
			x=Arrays.binarySearch(tag, arr[i]);
			if(x>=0){
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		Set<Integer> set= new HashSet<Integer>();
		for(int i=0;i<arr.length;i++){
			set.add(arr[i]);
		}
		for(int i=0;i<tag.length;i++){
			set.add(tag[i]);
		}
		int[] sor=new int[set.size()];
		Iterator<Integer> it= set.iterator();
		while(it.hasNext()){
			for(int i=0;i<sor.length;i++){
				sor[i]=it.next();
			}
		}
		Arrays.sort(sor);
		for(int i=0;i<sor.length;i++){
			System.out.print(sor[i]+" ");
		}
		System.out.println();
		
		int y;
		for(int i=0;i<arr.length;i++){
		 y=Arrays.binarySearch(tag, arr[i]);
		 if(y<0){
			 System.out.print(arr[i]+" ");
		 }
		}
		System.out.println();
		}
		
	}
	


