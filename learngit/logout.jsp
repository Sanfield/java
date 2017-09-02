<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<head>
<title>退出系统</title>
</head>

<body>
  <%
     session.invalidate();
     String _url = "";
     
     if(_url==null){
     	_url = request.getContextPath() + "/portal/login.jsp";
     }
     response.sendRedirect(_url);
   %>
</body>
</html>