package com.dg.www;

public class Demo {
//�õݹ��ӡ0-n
//�ĵݹ�Ĺؼ�ʱ����������
// �������� �ݹ�ĳ���
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

