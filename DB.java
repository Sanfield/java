package com.dean.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DB {
  
	public static Connection getconn(String url){
		Connection conn= null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	} 
	public static Statement getstmt(Connection conn){
		Statement stmt = null;
		try {
			stmt=conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stmt;
	}
	public static ResultSet getrs(Statement stmt,String sql){
		ResultSet rs= null;
		try {
			rs=stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	public static void closeRS(ResultSet rs){
			try {
			     if(rs!=null){			
					rs.close();
					rs=null;
				} 		
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void closeStmt(Statement stmt){
		try{
			if(stmt!=null){
				stmt.close();
				stmt=null;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public static void closeConn(Connection conn){
		try{
			if(conn!=null){
				conn.close();
				conn=null;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public void closeDB(ResultSet rs,Statement stmt,Connection conn){
		closeRS(rs);
		closeStmt(stmt);
		closeConn(conn);
	}

}
