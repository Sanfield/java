<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/servlet/UploadHandleServlet"
 enctype="multipart/form-data" method="POST">
	<div>
		<table>
		 <tr><td colspan="2" align="center">上传文件</td></tr>
		 <tr><td>上传用户:</td><td><input type="text" name="username"/></td></tr>
		 <tr><td>上传图片文件:</td><td><input type="file" name="file1"></td></tr>
		 <tr><td>上传其他文件:</td><td><input type="file" name="file2"></td></tr>	
		 <tr><td colspan="2"><input type="submit" value="提交"></td></tr>	
		</table>
	</div>
</form>
</body>
</html>