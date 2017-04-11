package com.math.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class DP_Demo02 {
	public static void main(String[] args) throws IOException {
		StreamTokenizer st= new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		st.nextToken();
		int N=(int)st.nval;
		st.nextToken();
		int K=(int)st.nval;
		
		st.nextToken();
		Long M=(long)st.nval;
		String str=String.valueOf(M);
		long dp[][]=new long[K+1][N+1];
		for(int i=1;i<=N;i++){
			dp[0][i]=Long.parseUnsignedLong(str.substring(0,1));
		}
		for(int i=1;i<=K;i++){
			for(int j=1+i;j<=N;j++){
				for(int k=i;k<=N;k++){
					int font=0;
					for(int l=k;l<j;l++){
						font=str.charAt(l)-'0'+font*10;
					}
					if(dp[i][j]<dp[i-1][k]*font)
						dp[i][j]=dp[i-1][k]*font;
				}
			}
		}
	}

}
