<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- PHPと一緒でname値で拾う -->
	<% request.setCharacterEncoding("UTF-8"); %>
	<p>ようこそ、<%= request.getParameter("user") %>さん！</p>
</body>
</html>