<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<s:form action="HelloStrutsAction">
		<s:submit value="HelloStruts" />
	</s:form>

	<s:form action="WelcomeAction">
		<s:submit value="Welcome" />
	</s:form>

	<s:form action="InquiryAction">
		<s:submit value="問い合わせ" />
	</s:form>

	<div>GET通信</div>
	<s:form method="get" action="TestAction">
	<s:textfield name="username" />
	<s:password name="password" />
	<s:submit value="通信" />
	</s:form>

	<div>POST通信</div>
	<s:form method="post" action="TestAction">
	<s:textfield name="username" />
	<s:password name="password" />
	<s:submit value="通信" />
	</s:form>

</body>
</html>