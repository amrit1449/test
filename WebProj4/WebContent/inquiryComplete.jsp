<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>InquieyComplete!!</title>
</head>
<body>
	<h1>登録が完了しました</h1>

	<table>
		<tbody>
			<tr>
				<th>名前</th>
				<th>お問合せ種類</th>
				<th>お問合せ内容</th>
			</tr>

			<s:iterator value="inquiryDTOList">
			<tr>
				<td><s:property value="name" /></td>
				<s:if test='qtype=="company"'> <td>会社について</td></s:if>
				<s:if test='qtype=="product"'><td>製品について</td></s:if>
				<s:if test='qtype=="support"'><td>サポートについて</td></s:if>
				<td><s:property value="body" /></td>
			</tr>
			</s:iterator>
		</tbody>
	</table>
</body>
</html>