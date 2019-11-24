<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>
</head>
<body>
	<h1>Error</h1>
	<s:if test='(loginDTOList.get(0).username)=="該当なし"'>
	該当者はいませんでした。
	</s:if>
</body>
</html>