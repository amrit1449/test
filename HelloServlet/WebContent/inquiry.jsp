<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>お問い合わせフォーム</title>
</head>
<body>
	<form method='post' action='InquiryServlet'>
	<div>名前：<input type='text' name='name'></div>
	<div>
		お問い合わせの種類
		<select name='qtype'>
			<option value='company'>会社について</option>
			<option value='product'>製品について</option>
			<option value='support'>アフターサポートについて</option>
		</select>
	</div>
	<div>
		お問い合わせ内容：<br>
		<textarea name='body'></textarea>
	</div>
	<div><input type='submit' value='登録'></div>
	</form>
</body>
</html>