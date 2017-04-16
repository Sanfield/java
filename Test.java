package com.sfjdbc.www;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test extends DBuitl2{
	public static void main(String[] args) throws SQLException {
	Test ts = new Test();
//		ts.psexample(); 
//	  ts.psexample2();
	  ts.psdemo();
		
	}
	public void psdemo() throws SQLException{
	//	String sql = "INSERT INTO student(sno,sname)VALUES (?,?)";
	//     	String sql = "delete from student where sno = ?";
		String sql = "UPDATE student SET sname =?,ssex = ? WHERE  sno = ? ";
		getprepareStatement(sql);
		ps.setString(1, "¶öËÀ¹í");
		ps.setString(2, "Å®");
		ps.setString(3, "2");
		int i = ps.executeUpdate();
		if(i>0){
			System.out.println("successful!"+i);
		}else{
			System.out.println("lose");
		}
	}
	
	 public void psexample2() throws SQLException{
		 String sql = "SELECT *FROM student WHERE sno = ?";
		 excuteQuery(sql,"2");
		 rs = ps.executeQuery();
			while(rs.next()){
				
				System.out.print(rs.getString(1)+'\t');
				System.out.print(rs.getString(2)+'\t');
				System.out.print(rs.getString(3)+'\t');
				System.out.print(rs.getString(4)+'\t');
				System.out.print(rs.getString(5)+'\n');
			}
		 close( conn,ps, rs);
		 }
	public void psexample() throws SQLException{
		String sql = "SELECT *FROM student WHERE sno = ?";
		//conn = getConnection();
		getprepareStatement(sql);
		ps.setString(1, "2");
		rs = ps.executeQuery();
		while(rs.next()){
			
			System.out.print(rs.getString(1)+'\t');
			System.out.print(rs.getString(2)+'\t');
			System.out.print(rs.getString(3)+'\t');
			System.out.print(rs.getString(4)+'\t');
			System.out.print(rs.getString(5)+'\n');
		}
		close( conn,ps, rs);
		
	}

}
