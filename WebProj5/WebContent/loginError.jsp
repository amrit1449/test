<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>Error</title>
</head>
<body>
	<h1>Error</h1>
	<s:if test='(#session.loginDTOList.get(0).username)=="該当なし"'>
	<div>該当者はいませんでした。</div>
	</s:if>

	<table>
		<tbody>
			<tr>
				<th>USERNAME</th>
				<th>PASSWORD</th>
			</tr>
			<tr>
			<s:iterator value="#session.loginDTOList">
				<td><s:property value="username" /></td>
				<td><s:property value="password" /></td>
			</s:iterator>
			</tr>
		</tbody>
	</table>
</body>
</html>