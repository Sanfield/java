package com.imn.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.imn.entity.ProductInfo;
import com.imn.util.MyBatis;

public interface ProductMapper {
// /**
// */
//	 * 增加
//	 * @param product
//	 * @return
//	 */
//	public static int InsertInfoDept(ProductInfo product){
//		SqlSession sqlSession = MyBatis.getSqlSession();
//		int flag=0;
//		try{
//			flag= sqlSession.insert("InsertInfoDept",product);
//			sqlSession.commit();
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally{
//			MyBatis.clossSession(sqlSession);
//		}
//		return flag;
//	}
//	/**
//	 * 删除
//	 * @param did
//	 * @return
//	 */
//	public static int delectProduct(Integer	 did){
//		SqlSession sqlSession = MyBatis.getSqlSession();
//		int flag=0;
//		try{
//			flag= sqlSession.delete("delProduct",did);
//			sqlSession.commit();
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally{
//			MyBatis.clossSession(sqlSession);
//		}
//		return flag;
//	}
//	/**
//	 * 更新
//	 * @param Product
//	 * @return
//	 */
//	public static int updateProduct(ProductInfo Product){
//		SqlSession sqlSession = MyBatis.getSqlSession();
//		int flag=0;
//		try{
//			flag= sqlSession.update("updateProduct",Product);
//			sqlSession.commit();
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally{
//			MyBatis.clossSession(sqlSession);
//		}
//		return flag;
//	}
//	/**
//	 * 查找
//	 * @param did
//	 * @return
//	 */
//	public static ProductInfo findProductById(Integer did){
//		SqlSession sqlSession = MyBatis.getSqlSession();
//		//int flag=0;
//		ProductInfo product=null;
//		try{
//			product= sqlSession.selectOne("findProductById",did);
//			//sqlSession.commit();
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally{
//			MyBatis.clossSession(sqlSession);
//		}
//		return product;
//	}
//
//	public static List<ProductInfo> findProductwithPage(Map<String,Object> map){
//		SqlSession sqlSession = MyBatis.getSqlSession();
//		List<ProductInfo> list= new ArrayList<ProductInfo>();
//		try{
//			list= sqlSession.selectOne("findProductWithPage",map);
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally{
//			MyBatis.clossSession(sqlSession);
//		}
//		return list;
//	}	
	int InsertInfoDept(ProductInfo product);
	int delectProduct(Integer did);
	int updateProduct(ProductInfo Product);
	ProductInfo findProductById(Integer did);
	List<ProductInfo> findProductwithPage(Map<String,Object> map);

}

