package com.chinasofti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.domain.Staff;
import com.chinasofti.util.ConnectionUtil;

public class StaffDao {
	public boolean addStaff(Staff staff){
		String sql = "insert into staff(p_id,p_name,sex,degree,department,position,state,user_name,user_password) values(?,?,?,?,?,?,?,?,?)";
		Object[] params = {
				staff.getP_id(),
				staff.getP_name(),
				staff.getSex(),
				staff.getDegree(),
				staff.getDepartment(),
				staff.getPosition(),
				staff.getState(),
				staff.getUser_name(),
				staff.getUser_password(),
				
		};
		return ConnectionUtil.executeUpdate(sql, params);
	}
	public Staff queryStaff(Staff staff){
		String sql = "select * from Staff where user_name = ?";
		Connection conn = ConnectionUtil.getConection();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setObject(1, staff.getUser_name());
			ResultSet rs = ps.executeQuery();
			Staff u = null;
			if(rs.next()){
				Integer p_id = rs.getInt("p_id");
				String p_name = rs.getString("p_name");
				String sex = rs.getString("sex");
				String degree = rs.getString("degree");
				String department = rs.getString("department");
				String position = rs.getString("position");
				String state = rs.getString("state");
				String user_name = rs.getString("user_name");
				String user_password = rs.getString("user_password");
				u = new Staff(p_id, p_name, sex, degree, department, position, state, user_name,user_password);
			}
			if(u.getUser_password().equals(staff.getUser_password())){
				return u;
			}else{
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<Staff> queryAllStaff(){
		String sql = "select * from staff";
		Connection conn = ConnectionUtil.getConection();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			 Staff u = null;
			List<Staff> staffs = new ArrayList<Staff>();
			while(rs.next()){
				int p_id = rs.getInt("p_id");
				String p_name = rs.getString("p_name");
				String sex = rs.getString("sex");
				String degree = rs.getString("degree");
				String department = rs.getString("department");
				String position = rs.getString("position");
				String state = rs.getString("state");
				String user_name = rs.getString("user_name");
				String user_password = rs.getString("user_password");
				u = new Staff(p_id, p_name, sex, degree, department, position, state, user_name,user_password);
				staffs.add(u);
			}
			return staffs;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	public boolean deleteStaff(Integer p_id){
		String sql = "delete from Staff where p_id = ?";
		Object[] params = {
				p_id
		};
		return ConnectionUtil.executeUpdate(sql, params);
	}
	public Staff queryStaff(Integer p_id){
		String sql = "select * from Staff where p_id = ?";
		Connection conn = ConnectionUtil.getConection();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, p_id);
			ResultSet rs = ps.executeQuery();
			Staff u = null;
			if(rs.next()){
				String p_name = rs.getString("p_name");
				String sex = rs.getString("sex");
				String degree = rs.getString("degree");
				String department = rs.getString("department");
				String position = rs.getString("position");
				String state = rs.getString("state");
				String user_name = rs.getString("user_name");
				String user_password = rs.getString("user_password");
				u = new Staff(p_id, p_name, sex, degree, department, position, state, user_name,user_password);
			}
			return u;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	public boolean updateStaff(Staff staff){
		String sql = "update Staff set p_name = ?,sex = ?,degree = ?,department = ?,position = ?,state=?,user_name=?,user_password=? where p_id = ?";
		Object[] params = {		
				staff.getP_name(),
				staff.getSex(),
				staff.getDegree(),
				staff.getDepartment(),
				staff.getPosition(),
				staff.getState(),
				staff.getUser_name(),
				staff.getUser_password(),
				staff.getP_id(),
				
		};
		return ConnectionUtil.executeUpdate(sql, params);
	}
}
