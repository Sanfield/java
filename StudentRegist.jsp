<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<%=request.getContextPath()%>/bootstrap3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script  src="<%=request.getContextPath() %>/jquery/jquery.js"></script>
<script  src="<%=request.getContextPath()%>/bootstrap3.3.7/js/bootstrap.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>student register</title>
</head>
<body>
	<div style="height: 20%">
		<jsp:include page="./part/head.jsp"></jsp:include>
	</div> 
		<div align="center" style="width: 35%" class="container">
		  <form>
			<table class="table table-hover">
			<thead><h2>学生注册</h2></thead>
			<tbody>
			<tr><td>昵称:</td><td><input type="text" name="name"></td></tr>
			<tr><td>账号:</td><td><input type="text" name="number"></td></tr>
			<tr><td>密码:</td><td><input type="password" name="password1"></td></tr>
			<tr><td>确认密码:</td><td><input type="password" name="password2"></td></tr>
			<tr><td>移动电话:</td><td><input type="text" name="studentphone"></td></tr>
			<tr><td>电子邮箱:</td><td><input type="text" name="studentemail"></td></tr>
			<tr><td>Q Q:</td><td><input type="text" name="studentqq"></td></tr>
			<tr><td>微信:</td><td><input type="text" name="studentwechat"></td></tr>
			<tr><td>出生日期:</td><td><input type="date" name="brithday" value="2017-01-01" style="width:178px;"></td></tr>
			<tr><td>学院:</td><td><input type="text" name="academy"></td></tr>
			<tr><td>特长:</td><td>
				   <input type = 'checkbox' name = "studentlike" name = 'C'/>C
	       		   <input type = 'checkbox' name = "studentlike" name = 'JAVA'/>JAVA
				   <input type = 'checkbox' name = "studentlike" name = 'PHP'/>PHP
				   <input type = 'checkbox' name = "studentlike" name = 'HTML/CSS'/>HTML/CSS<br/>
				   <input type = 'checkbox' name = "studentlike" name = 'JavaScript'/>JavaScript
				   <input type = 'checkbox' name = "studentlike" name = 'Python'/>Python
				   <input type = 'checkbox' name = "studentlike" name = 'SQL'/>SQL
		    </td></tr>
		    <tr><td><input class="btn btn_lg btn-primary" type="button" value="提交" onclick="" />
					</td><td>
					<input class="btn btn_lg btn-warning" type="reset" value="重置" />
			</td></tr>	
		  </tbody>
		</table>
	</form>
  </div>
</body>
</html>