<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>删除吉他</title>
</head>
<body >
<div align="center">
	<h1>删除吉他</h1>
	<form method="post" action="DelServlet">
		<input type="text" name="serialNumber" placeholder="序列号" required="required" />
		<input type="submit"  value="删除" class="btn btn-primary btn-block btn-large">
	</form>
</div>
</body>
</html>
