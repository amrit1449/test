<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>InquieyComplete!!</title>
</head>
<body>
	<h1>登録が完了しました</h1>
	名前：<s:property value="name" /><br>
	<s:if test="'qtype==company'">会社について</s:if><br>
	<s:if test="'qtype==product'">製品について</s:if><br>
	<s:if test="'qtype==support'">サポートについて</s:if><br>
	内容：<s:property value="body" />
</body>
</html>