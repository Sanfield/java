<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<script type="text/javascript" src="<%=request.getContextPath() %>/JS/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/JS/Register.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
</head>
<body>
	<div align="center">
		<form>
			<table>
			<tr><td colspan="2" align="center">用户注册</td></tr>
			<tr><td>用户类型:</td><td><input type="radio" id="teacherridio" name="job" value="teacher">老师
								<input type="radio" id="studentridio" checked="checked" name="job" value="student">学生
								</td></tr>
			<tr><td>昵称:</td><td><input type="text" name="name"></td></tr>
			<tr><td>账号:</td><td><input type="text" name="number"></td></tr>
			<tr><td>密码:</td><td><input type="password" name="password1"></td></tr>
			<tr><td>确认密码:</td><td><input type="password" name="password2"></td></tr>		
			</table>
		</form>
	</div>
	<div id="teacherdiv" style="display:none" align="center">
		<form>
			<table>
			 <tr><td>老师职称:</td><td>
			 	<select name="teachertitle" size="1">
			 	 <option value="trofessor">教授</option>
			 	 <option value="aprofessor">副教授</option>
			 	 <option value="lecturer">讲师</option>
			 	</select>
			 </td></tr>
			 <tr><td>学院:</td><td><input type="text" name="teacherdepartment"></td></tr>
			 <tr><td>部门:</td><td><input type="text" name="teacherdepartment"></td></tr> 
			 <tr><td>办公室:</td><td><input type="text" name="office"></td></tr>
			 <tr><td>电话:</td><td><input type="text" name="teacherphone"></td></tr>
			 <tr><td>固定电话:</td><td><input type="text" name="teachertelephone"></td>
			 <tr><td>电子邮件:</td><td><input type="text" name="teacheremail"></td></tr>
			</table>
		</form>
	</div>
	<div id="studentdiv" align="center">
		<form>
			<table>
			<tr><td>电话:</td><td><input type="text" name="studentphone"></td></tr>
			<tr><td>电子邮箱:</td><td><input type="text" name="studentemail"></td></tr>
			<tr><td>Q Q:</td><td><input type="text" name="studentqq"></td></tr>
			<tr><td>微信:</td><td><input type="text" name="studentwechat"></td></tr>
			<tr><td>生日:</td><td><input type="date" name="brithday" value="2017-01-01" style="width:173px;"></td></tr>
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
		   </table>
		</form>
	</div>
	<div align="center">
		<table>
			<tr><td><input type="submit" value="提交"></td></tr>
		</table>
	</div>
</body>
</html>