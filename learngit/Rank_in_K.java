package com.math.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Rank_in_K {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList alist = new ArrayList(n);
		int[]a = new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int m =sc.nextInt();
		int[] l = new int[m];
		int[] r= new int[m];
		int[] k = new int[m];
		for (int i =0;i<m;i++){
			l[i]=sc.nextInt();
			r[i]=sc.nextInt();
			k[i]=sc.nextInt();
		}
		for(int i =0;i<m;i++){
			for(int j=l[i]-1;j<=(r[i]-1);j++){//将a中l~r中的数据添加到list中
				alist.add(a[j]);
			}
			Collections.sort(alist);
			System.out.println(alist.get(r[i]-l[i]-k[i]+1));
			alist.clear();
		}
	}

}
