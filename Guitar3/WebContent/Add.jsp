<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加吉他</title>
</head>
<body bgcolor="#8B636C">
<div align="center">
	<h1>添加吉他</h1>
	<form method="post" action="AddServlet">
		产品序号：<input type="text" name="serialNumber" />
		<br>
		<br>
		产品价格：<input type="text" name="price" />
		<br>
		<br>
		产品产商：<input type="text" name="builder" />
		<br>
		<br>
		产品模式：<input type="text" name="model" />
		<br>
		<br>
		产品种类：<input type="text" name="type"  />
		<br>
		<br>
		产品前木：<input type="text" name="backWood"/>
		<br>
		<br>
		产品后木：<input type="text" name="topWood"  />
		<br>
		<br>
		<input type="submit"  value="提交">
	</form>
</div>
</body>
</html>
