<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>会员登录</title>
<link href="<%=request.getContextPath()%>/assets/css/common.css" rel="stylesheet" type="text/css"/>
<link href="<%=request.getContextPath()%>/assets/css/login.css" rel="stylesheet" type="text/css"/>
<script src="<%=request.getContextPath()%>/assets/js/jquery-1.8.3.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/assets/js/common.js" type="text/javascript"></script>
<script type="text/javascript" src="dwr/engine.js"></script>
<script type="text/javascript" src="dwr/util.js"></script>
<script type="text/javascript" src="dwr/interface/UserService.js"></script>
</head>
<body>
<div class="container header">
	<div class="span5">
		<div class="logo">
			<a href="http://localhost:8080/">
				<img src="<%=request.getContextPath()%>/assets/image/r___________renleipic_01/logo.gif" alt="宝宝商城">
			</a>
		</div>
	</div>
	<div class="span9">
<div class="headerAd">
					<img src="<%=request.getContextPath()%>/assets/image/header.jpg" width="320" height="50" alt="正品保障" title="正品保障">
</div>	</div>
	<div class="span10 last">
		<div class="topNav clearfix">
			<ul>
				<li id="headerLogin" class="headerLogin" style="display: list-item;">
					<a href="<%=request.getContextPath()%>/login.jsp">登录</a>|
				</li>
				<li id="headerRegister" class="headerRegister" style="display: list-item;">
					<a href="<%=request.getContextPath()%>/register.jsp">注册</a>|
				</li>
				<li id="headerUsername" class="headerUsername"></li>
				<li id="headerLogout" class="headerLogout">
					<a href="<%=request.getContextPath()%>/index.jsp">[退出]</a>|
				</li>
						<li>
							<a >会员中心</a>
							|
						</li>
						<li>
							<a >购物指南</a>
							|
						</li>
						<li>
							<a>关于我们</a>
							
						</li>
			</ul>
		</div>
		<div class="cart">
			<a href="<%=request.getContextPath()%>/assets/购物车.htm">购物车</a>
		</div>
			<div class="phone">
				客服热线:
				<strong>96008/53277764</strong>
			</div>
	</div>
	<div class="span24">
		<ul class="mainNav">
					<li>
						<a href="<%=request.getContextPath()%>/assets/index.htm">首页</a>
						|
					</li>
					<li>
						<a href="<%=request.getContextPath()%>/assets/蔬菜分类.htm">定制套餐</a>
						|
					</li>
					<li>
						<a >安全频道</a>
						|
					</li>
					<li>
						<a >亿家卡</a>
						|
					</li>
					<li>
						<a >蔬菜基地</a>
						|
					</li>
					<li>
						<a >节气养生</a>
						|
					</li>
					<li>
						<a>便民服务</a>
						|
					</li>
					
		</ul>
	</div>
	
</div>	<div class="container login">
		<div class="span12">
<div class="ad">
					<img src="<%=request.getContextPath()%>/assets/image/login.jpg" width="500" height="330" alt="会员登录" title="会员登录">
</div>		</div>
		<div class="span12 last">
			<div class="wrap">
				<div class="main">
					<div class="title">
						<strong>会员登录</strong>USER LOGIN 
					</div>
					<form id="loginForm"  method="post" action="<%=request.getContextPath()%>/UserLoginServlet" novalidate="novalidate">
						<table>
							<tbody><tr>
								<th>
										用户名/E-mail:
								</th>
								<td>
									<input type="text" id="userId" name="userId" class="text" maxlength="20" value="${data.userId}">
									
								</td>
							</tr>
							<tr>
								<th>
									密&nbsp;&nbsp;码:
								</th>
								<td>
									<input type="password" id="password" name="password" class="text" maxlength="20" autocomplete="off" value="${data.password}">
								</td>
							</tr>
								<tr>
									<th>
										验证码:
									</th>
									<td>
										<span class="fieldSet">
											<input type="text" id="captcha" name="captcha" class="text captcha" maxlength="4" autocomplete="off"><img id="codeImg" title="点击更换验证码">
										</span>
									</td>
								</tr>
							<tr>
								<th>&nbsp;
									
								</th>
								<td>
									<label>
										<input type="checkbox" id="isRememberUsername" name="isRememberUsername" value="true">记住用户名
									</label>
									<label>
										&nbsp;&nbsp;<a >找回密码</a>
									</label>
								</td>
							</tr>
							<tr>
								<th>&nbsp;
									
								</th>
								<td>
									<input id="btnSubmit" type="button" class="submit" value="登 录"><font color="red">${data.message}</font>
								</td>
							</tr>
							<tr class="register">
								<th>&nbsp;
									
								</th>
								<td>
									<dl>
										<dt>还没有注册账号？</dt>
										<dd>
											立即注册即可体验在线购物！
											<a href="<%=request.getContextPath()%>/register.jsp">立即注册</a>
										</dd>
									</dl>
								</td>
							</tr>
						</tbody></table>
					</form>
				</div>
			</div>
		</div>
	</div>
<div class="container footer">
	<div class="span24">
	  <div class="footerAd"><img src="<%=request.getContextPath()%>/assets/image/footer.jpg" width="950" height="52" alt="我们的优势" title="我们的优势" /></div>	
	</div>
	<div class="span24">
		<ul class="bottomNav">
					<li>
						<a >关于我们</a>
						|
					</li>
					<li>
						<a>联系我们</a>
						|
					</li>
					<li>
						<a>招贤纳士</a>
						|
					</li>
					<li>
						<a>法律声明</a>
						|
					</li>
					<li>
						<a>友情链接</a>
						|
					</li>
					<li>
						<a target="_blank">支付方式</a>
						|
					</li>
					<li>
						<a  target="_blank">配送方式</a>
						|
					</li>
					<li>
						<a>服务声明</a>
						|
					</li>
					<li>
						<a>广告声明</a>
						
					</li>
		</ul>
	</div>
	<div class="span24">
		<div class="copyright">Copyright © 2005-2015 网上商城 版权所有</div>
	</div>
</div>
<script type="text/javascript">
$(document).ready(function() {
	Common.changeCode();
	$("#codeImg").bind("click", Common.changeCode);
	
	$("#captcha").bind("blur", checkSecCode);
	//$("#loginForm").bind("submit",checkForm);
	$("#btnSubmit").bind("click",formSubmit);
});

var userObj;
/**
 * 校验用户注册信息是否符合规则要求函数
 */
function checkForm(){
	$("#login_alert").remove();
	$("#userId_alert").remove();
	$("#pw_alert").remove();
	$("#cap_alert").remove();
	
	userObj = new Object();
	userObj.userId = $("#userId").val().trim();
	userObj.password = $("#password").val().trim();
	userObj.captcha = $("#captcha").val().trim();
	
	if(userObj.userId == ""){
		$("#userId").focus();
		$("#userId").after("<font color='red' id='userId_alert'>请输入用户账号！</font>")
		return false;
	}
	
	if(userObj.password == ""){
		$("#password").focus();
		$("#password").after("<font color='red' id='pw_alert'>请输入用户密码！</font>")
		return false;
	}
	
	if(userObj.captcha == ""){
		$("#captcha").focus();
		$("#codeImg").after("<font color='red' id='cap_alert'>请输入验证码！</font>")
		return false;
	}
	
	return true;
}
/*
 * 校验验证码
 */
function checkSecCode(){
	var result = false;
	$("#cap_alert").remove();
	UserService.getCode(function(msg){
		if($("#captcha").val().toUpperCase() != msg.sessionSecCode){
			$("#codeImg").after("<font color='red' id='cap_alert'>验证码输入有误！</font>");
			$("#captcha").focus();
			result = false;
		}else{
			result = true;
		}
	})
	return result;
}
/**
 * DWR登录方式
 */
function formSubmit(){
	if(!checkForm()){
		return;
	}
	if(!checkSecCode()){
		return;
	}
	UserService.loginByDWR(userObj,function(msg){
		if(msg.result==1){
			document.location = "index.jsp";
		}else if(msg.result==-1){//如果返回用户账号信息则提示账号已被占用
			$("#btnSubmit").after("<font color='red' id='login_alert'>用户账号不存在！</a>");
		}else if(msg.result==-2){//否则提示账号可用信息
			$("#btnSubmit").after("<font color='red' id='login_alert'>用户密码错误！</font>");
		}else{//否则提示账号可用信息
			$("#btnSubmit").after("<font color='red' id='login_alert'>登录失败，请联系管理员！</font>");
		}
	})
}
</script>
</body>
</html>