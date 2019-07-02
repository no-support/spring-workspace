<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>등록 폼</h1>
	<form method="post" action="register.do">
		<p><label>이름 : </label> <input type="text" name="name">
		<p><label>아이디 : </label> <input type="text" name="id">
		<p><label>비밀번호 : </label> <input type="text" name="password">
		<p><label>이메일 : </label> <input type="text" name="email">
		<p><button type="submit">등록</button>
	</form>
</body>
</html>