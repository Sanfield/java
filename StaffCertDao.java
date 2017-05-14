package com.chinasofti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.domain.StaffCert;
import com.chinasofti.domain.TrainType;
import com.chinasofti.util.ConnectionUtil;

public class StaffCertDao {
	public boolean addStaffCert(StaffCert staffcert){
		String sql = "insert into StaffCert(cer_id,grade_id,cer_name,cer_date) values(?,?,?,?)";
		Object[] params = {
				staffcert.getCer_id(),
				staffcert.getGrade_id(),
				staffcert.getCer_name(),
				staffcert.getCer_date()
				

				
		};
		return ConnectionUtil.executeUpdate(sql, params);
	}
	/*public TrainType queryTrainType(TrainType trainType){

		String sql = "select * from trainType where type_code = ?";
		Connection conn = ConnectionUtil.getConection();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setObject(1, trainType.getType_code());
			ResultSet rs = ps.executeQuery();
			TrainType type = null;
			if(rs.next()){
				String type_code = rs.getString("type_code");
				String type_name = rs.getString("type_name");
				String type_info = rs.getString("type_info");

				type = new TrainType(type_code,type_name,type_info);
			}
			if(u.getPassword().equals(trainType.getPassword())){
				return u;
			}else{
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}*/

	public StaffCert queryStaffCert(Integer cer_id){
		String sql = "select * from StaffCert where cer_id = ?";
		Connection conn = ConnectionUtil.getConection();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, cer_id);
			ResultSet rs = ps.executeQuery();
			StaffCert cert = null;
			if(rs.next()){
				int grade_id = rs.getInt("grade_id");
				String cer_name = rs.getString("cer_name");
				String cer_date = rs.getString("cer_date");

				cert = new StaffCert(cer_id,grade_id,cer_name,cer_date);
			}
			return cert;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean deleteStaffCert(Integer cer_id){
		String sql = "delete from StaffCert where cer_id = ?";
		Object[] params = {
				cer_id
		};
		return ConnectionUtil.executeUpdate(sql, params);
	}

	public List<StaffCert> queryAllStaffCert(){
		String sql = "select * from StaffCert";
		Connection conn = ConnectionUtil.getConection();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			StaffCert cert = null;
			List<StaffCert> certs = new ArrayList<StaffCert>();
			while(rs.next()){
				int cer_id = rs.getInt("cer_id");
				int grade_id = rs.getInt("grade_id");
				String cer_name = rs.getString("cer_name");
				String cer_date = rs.getString("cer_date");

				cert = new StaffCert(cer_id,grade_id,cer_name,cer_date);
				certs.add(cert);
			}
			return certs;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	public boolean updateStaffCert(StaffCert staffcert){
		String sql = "update staffcert set cer_id=?,grade_id=?,cer_name=?,cer_date=? where cer_id=?";
		Object[] params = {
				staffcert.getCer_id(),
				staffcert.getGrade_id(),
				staffcert.getCer_name(),
				staffcert.getCer_date(),
				staffcert.getCer_id()
		
		
		};
		return ConnectionUtil.executeUpdate(sql, params);
	}
	
}
