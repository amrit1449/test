<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello Servlet</title>
</head>
<body>

<!-- 新しくサーブレットを作成したらTomcatを再起動しないとPOST時にエラーになることがある。 -->

<!-- サーブレットの呼び出し -->
<input type="button" value="HelloServlet" onClick="location.href='HelloServlet'">

<!-- JSPの呼び出し -->
<input type="button" value="WelcomeServlet" onClick="location.href='welcome.jsp'">

<!-- 問い合わせの呼び出し -->
<input type='button' value='問い合わせ' onClick='location.href="inquiry.jsp"'>

<!-- MySQLと接続 -->
<input type='button' value='MySQLServlet' onClick='location.href="MySQLServlet"'>

<!-- GET&POSTの練習 -->
<div>
	<p>GET通信</p>
	<form method='get' action='TestServlet'>
		<input type='text' name='user_name'>
		<input type='password' name='password'>
		<input type='submit' value='GET送信'>
	</form>
</div>
<div>
	<p>POST通信</p>
	<form method='post' action='TestServlet'>
		<input type='text' name='user_name'>
		<input type='password' name='password'>
		<input type='submit' value='POST送信'>
	</form>
</div>

</body>
</html>