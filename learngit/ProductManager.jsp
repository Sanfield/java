<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="com.sxt.dao.*" %>
<%@page import="com.sxt.bean.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	List<Product> products= ProductDao.getAllProduct();
	request.setAttribute("products", products);
	
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
  <table align="center" border="1">
    <tr><th colspan="5">商品信息一览表</tr>
    <tr><td>编号</td><td>名字</td><td>数量</td><td>价格</td><td>产地</td></tr>
    <% //                                                         定义一个索引对象 %>
	<c:forEach var="product" items="${requestScope.products }" varStatus="status">
	<!-- 如果是偶数行，改行为蓝色 -->
	<tr<c:if test="${status.index % 2==1}">
	style="background-color:rgb(219,241,212)"
	</c:if>>
	<td>${product.product_id}</td>
	<td>${product.product_name}</td>	
	<td>${product.product_number}</td>
	<td>${product.product_price}</td>
	<td>${product.product_from}</td>
    </tr>
	</c:forEach>
  </table>
 </div>
</body>
</html>