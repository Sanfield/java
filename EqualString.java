package com.dg.www;
/*利用递归比较两个字符串
 * */

public class EqualString {
	public static boolean isSameString(String s1,String s2){
		return s1.equals(s2);
	}
	public static boolean f(String s1,String s2) {
		if(s1.length() !=s2.length()) return false;
		if(s1.length()==0) return true;
		if(s1.charAt(0) != s2.charAt(0)) return false;
		return f(s1.substring(1),s2.substring(1));//截取字符串
	}
	public static void main(String[] args) {
		System.out.println(isSameString("qwe","qweds"));
		System.out.println(f("asdf","feadsc"));
		System.out.println(f("asd","asd"));
	}
}
