<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<table border="1" align="center"> 
	<tr><td align="center">欢迎光临我们个人主页</td></tr>
	<tr><td align="center">当前在线人数:${onLineNum}</td></tr>
	<tr><td align="center"><img id="myphoto" src="<%=request.getContextPath()%>/img/Login.jpg" ></td></tr>
</table>
</div>
</body>
</html>