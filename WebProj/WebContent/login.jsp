<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN</title>
</head>
<body>
	<!-- 返り値でLoginActionから拾ったユーザー名を出力 -->
	ようこそ、<s:property value="username" />さん！
</body>
</html>