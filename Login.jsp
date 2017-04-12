<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆页面</title>
<style type="text/css">
	td{width:200px;height:30px}
</style>
<script type="text/javascript" >
	function CheckForm(){
		var userId = document.getElementById("userId").value;
		var password=document.getElementById("password").value;
		if(userId ==""){
			alert("账号不能为空");
			document.getElementById("userId").focus();
			return false;
		}
		if(password ==""){
			alert("密码不能为空");
			document.getElementById("password").focus();
			return false;
		}
		return true;
	}

</script>
</head>
<body>
	<div align="center">
	<!-- 提交时目标为action的servlet                                                    当接受到的返回为true时才会继续执行action -->
    <form action= "" method="POST" name="loginForm" onSubmit="javascript:return CheckForm();">
	<table border='1'>
		<tr><td colspan='2' rowspan='5'><img src="./Image/Login.jpg"></td><td colspan='2' align="center">"互联网+工作室"用户登录</td></tr>
		<tr><td align="center">登陆账号：</td><td align="center"><input type="text" id="userId" name="userId"></td></tr>
		<tr><td align="center">登陆密码：</td><td align="center"><input type="password" id="password" name="password"></td></tr>
		<tr><td align="center" colspan='2'>老师:<input type="radio" id="teacherridio" name="job" value="teacher">
							 学生:<input type="radio" id="studentridio"  name="job" value="student">
							管理员:<input type="radio" id="managerridio"  name="job" value="mamager"></td></tr>
		<tr><td colspan="2" align="center"><input type="submit" value="登陆">&nbsp;&nbsp;&nbsp;<input type="reset" value="重置">
					&nbsp;&nbsp;&nbsp;<a href="Register.jsp" target="_blank">新用户点击注册</a></td></tr>
	</table>
	</form>
	</div>
</body>
</html>
