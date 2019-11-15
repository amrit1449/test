<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>こんにちは！</p>

	<!-- スクリプトレット(出力処理) -->
	<% out.println(new java.util.Date()); %>

	<!-- 宣言文 -->
	<%!
		int add(int a, int b) {
			return a + b;
	}
	%>

	<!-- 式出力 -->
	<p>1 + 2 = <%= add(1, 2) %></p>
	<p>3 + 4 = <%= add(3, 4) %></p>

	<!-- 宣言された変数データは保存格納されている -->
	<%! int countA = 0; %>
	<%
		int countB = 0;
		countA++;
		countB++;
	%>
	<p>宣言による変数countA = <%= countA %></p>
	<p>スクリプトレットによる変数countB = <%= countB %></p>

	<!-- どちらで処理しても同じ？ -->
	<p><% out.println(Math.random()); %></p>
	<p><%= Math.random() %></p>

	<!-- 2ちゃんねる掲示板もJAVA使ってた気がする -->
	<p>お名前を入力してください。</p>
	<form method='post' action='greeting-out.jsp'>
		<input type='text' name='user'>
		<input type='submit' value='確定'>
	</form>

	<!-- 計算も同じ感じで -->
	<form method='post' action='total-out.jsp'>
		<input type='text' name='price'> 円 x
		<input type='text' name='count'> 個 + 送料
		<input type='text' name='delivery'>円 =
		<input type='submit' value='計算'>
	</form>
</body>
</html>