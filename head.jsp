<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<script  src="<%=request.getContextPath() %>/jquery/jquery.js"></script>
<script  src="<%=request.getContextPath()%>/bootstrap3.3.7/js/bootstrap.js"></script>
<script  src="<%=request.getContextPath() %>/JS/Register.js"></script>
<link href="<%=request.getContextPath()%>/bootstrap3.3.7/css/bootstrap.min.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>导航栏</title>
</head>
<body>
<nav class="navbar navbar-default" role="navigation" >
	<div class="container-fluid" style="bgcolor:#2BD5D5">
	<div class="navbar-header">
		<a class="navbar-brand" href="#">网站主页</a>
	</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">图片</a></li>
			<li><a href="#">文档</a></li>
			<li><a href="#">视频</a></li>
			<li><a href="#">BT种子</a></li>
			<li><a href="#">应用</a></li>
			<li><a href="#">其他</a></li>
		</ul>
		  <ul class="nav navbar-nav" style="float: right">
			<li><a href="Login.jsp">登陆</a></li>
			<li class="dropdown">
			<a class= "dropdown-toggle" data-toggle="dropdown">
			注册
			<b class="caret"></b></a>			
			<ul class="dropdown-menu">
				<li><a href="StudentRegist.jsp">学生注册</a></li>
				<li><a href="TeacherRegist.jsp">老师注册</a></li>						
			</ul>
			</li>
		</ul>
	</div>
</nav>