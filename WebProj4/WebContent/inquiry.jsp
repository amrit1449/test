<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inquiey</title>
</head>
<body>
	<s:form action="InquiryCompleteAction" method="post">
		<input type="text" name="name" placeholder="名前" />
		<select name="qtype">
			<option value="company">会社について</option>
			<option value="product">製品について</option>
			<option value="support">サポートについて</option>
		</select>
		<s:textarea name="body" />
		<s:submit value="登録" />
	</s:form>
</body>
</html>