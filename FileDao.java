package com.chinasofti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.domain.File;
import com.chinasofti.util.ConnectionUtil;


public class FileDao {
	public boolean addFile(File file){
		String sql = "insert into stafffile(file_id,p_id,file_name,file_abstract,reward_note,experience) values(?,?,?,?,?,?)";
		Object[] params = {
				file.getFile_id(),
				file.getP_id(),
				file.getFile_name(),
				file.getFile_abstract(),
				file.getReward_note(),
				file.getExperience(),
				
		};
		return ConnectionUtil.executeUpdate(sql, params);
	}
	public List<File> queryAllFile(){
		String sql = "select * from stafffile";
		Connection conn = ConnectionUtil.getConection();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			 File u = null;
			List<File> files = new ArrayList<File>();
			while(rs.next()){
				int file_id = rs.getInt("file_id");
				int p_id = rs.getInt("p_id");
				String file_name = rs.getString("file_name");
				String file_abstract = rs.getString("file_abstract");
				String reward_note = rs.getString("reward_note");
				String experience = rs.getString("experience");
				u = new File(file_id, p_id, file_name, file_abstract, reward_note, experience);
				files.add(u);
			}
			return files;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	public boolean deleteFile(Integer file_id){
		String sql = "delete from stafffile where file_id = ?";
		Object[] params = {
				file_id
		};
		return ConnectionUtil.executeUpdate(sql, params);
	}
	public File queryFile(Integer file_id){
		String sql = "select * from stafffile where file_id = ?";
		Connection conn = ConnectionUtil.getConection();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, file_id);
			ResultSet rs = ps.executeQuery();
			File u = null;
			if(rs.next()){
				int p_id = rs.getInt("p_id");
				String file_name = rs.getString("file_name");
				String file_abstract = rs.getString("file_abstract");
				String reward_note = rs.getString("reward_note");
				String experience = rs.getString("experience");
				u = new File(file_id, p_id, file_name, file_abstract, reward_note, experience);
			}
			return u;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	public boolean updateFile(File file){
		String sql = "update stafffile set p_id = ?,file_name = ?,file_abstract = ?,reward_note = ?,experience = ?where file_id = ?";
		Object[] params = {		
				file.getP_id(),
				file.getFile_name(),
				file.getFile_abstract(),
				file.getReward_note(),
				file.getExperience(),
				file.getFile_id(),
				
		};
		return ConnectionUtil.executeUpdate(sql, params);
	}
}
