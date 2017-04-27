<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>老师注册</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/dwr/engine.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/dwr/util.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/dwr/interface/TeacherService.js"></script>
<script  src="<%=request.getContextPath() %>/jquery/jquery.js"></script>
<!-- <script  src="<%=request.getContextPath() %>/JS/TeacherRegister.js"></script>
 --><script type="text/javascript">
$(document).ready(function(){
	alert("haha");
	$("#tnumber").blur(function(){
		$("#stnumber_alert").remove();
		var  user_id = $("#tnumber").val().trim();
		if(user_id=="") $("#tnumber").focus();
		$("#tnumber").after("");
		TeacherService.getTeacherById(user_id,function(data){
			if(data.result== undefined){
			$("#tnumber").after("<font color='green' id='snumber_alert'>恭喜你，此账号可用</font>");
			}else{
				$("#tnumber").after("<font color='red' id='snumber_alert'>此账号已经被注册</font>");
				$("#tnumber").focus();
			}
		})
	}) 	
	/**
	*校验密码长度
	*/
	$("#tpassword1").blur(function(){
		$("#tpassword_alert").remove();
		if(($("#tpassword1").val().length)<6){
			$("#tpassword1").after("<font color='red' id='tpassword_alert'>密码长度不能小于6</font>");
			$("#tpassword1").focus();
		} 		
	})
	/**
	*校验密码两次是否一致
	*/
	$("#tpassword2").blur(function(){
		$("#tpassword2_alert").remove();
		if($("#tpassword2").val() != $("#tpassword1").val()){
			$("#tpassword2").after("<font color='red' id='tpassword2_alert'>两次密码不一致</font>");
			$("#tpassword2").focus();
		}
	})
	/***
	*验证邮箱
	*/
	$("#temail").blur(function(){
		$("#temail_alert").remove();
		var str=$("#temail").val();
		var re = /^(\w-*\.*)+@(\w-?)+(\.\w{2,})+$/
		    if(!re.test(str)){
		    	$("#temail").after("<font color='red' id='temail_alert'>请输入正确邮箱</font>");	
		    }
	})
	 	    
})


</script>
</head>
<body>
<body>
	<div style="height: 20%">
		<jsp:include page="../part/head.jsp"></jsp:include>
	</div> 
	<div align="center" style="width: 40%" class="container">
		<form action="<%=request.getContextPath() %>/TeacherRegist" method="POST">
			<table class="table table-hover">
				<thead><h2>老师注册</h2></thead>
				<tbody>
					<tr><td>姓名:</td><td><input type="text"  id="tname" name="tname"></td></tr>
					<tr><td>账号:</td><td><input type="text" id="tnumber" name="tnumber"></td></tr>
					<tr><td>密码:</td><td><input type="password" id="tpassword1" name="tpassword1"></td></tr>
					<tr><td>确认密码:</td><td><input type="password" id="tpassword2" name="tpassword2"></td></tr>
					<tr><td>电话:</td><td><input type="text" id="tphone" name="tphone"></td></tr>
					<tr><td>学院:</td><td><input tyoe="text" id="tacademy" name="tacademy"></td></tr>
					<tr><td>办公室:</td><td><input type="text" id="toffice" name="toffice"></td></tr>
					<tr><td>办公司电话:</td><td><input type="text" id="ttelephone" name="ttelephone"></td></tr>
					<tr><td>邮箱:</td><td><input type="text" id="temail" name="temail"></td></tr>
					<tr><td>职称:</td><td><select name="ttitle" id="ttitle">
					<option value="teacher">讲师</option>
					<option value="aprofessor">副教授</option>
					<option value="professor">教授</option>
					</select></td></tr>
					<tr><td>部门:</td><td><input type="text" id="tdepartment" name="tdepartment"></td></tr>	
					<tr><td align="center"><input class="btn btn_lg btn-primary" type="submit" value="提交"/>
					</td><td>
					<input class="btn btn_lg btn-warning" type="reset" value="重置" />
					</td></tr>								
				</tbody>
			</table>
		</form>
	</div>
</body>
</html>