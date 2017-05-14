package com.chinasofti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.domain.CertSelect;
import com.chinasofti.domain.StaffCert;
import com.chinasofti.util.ConnectionUtil;

public class CertSelectDao {
	public static List<CertSelect> queryAllCertSelect(){
		String sql = "select cer_id,traingrade.grade_id,cer_name,staff.p_id,p_name,cer_date from staffcert, traingrade,staff where staffcert.grade_id=traingrade.grade_id and traingrade.p_id=Staff.p_id";
		Connection conn = ConnectionUtil.getConection();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			CertSelect select = null;
			List<CertSelect> selects = new ArrayList<CertSelect>();
			while(rs.next()){
				int cer_id = rs.getInt("cer_id");
				int grade_id = rs.getInt("grade_id");
				String cer_name = rs.getString("cer_name");
				String cer_date = rs.getString("cer_date");
				int p_id =rs.getInt("p_id");
				String p_name =rs.getString("p_name");

				select = new CertSelect(cer_id, grade_id, cer_name, cer_date, p_id, p_name);
				selects.add(select);
			}
			return selects;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
