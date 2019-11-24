<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>受付完了</title>
</head>
<body>
	<s:property value="name" />さん、お問い合わせありがとうございます。<br>
	お問合せ内容<br>
	<s:if test='qtype == "company"'>会社について</s:if>
	<s:if test='qtype == "product"'>製品について</s:if>
	<s:if test='qtype == "support"'>サポートについて</s:if><br>
	本文<br>
	<s:property value="body" />
</body>
</html>