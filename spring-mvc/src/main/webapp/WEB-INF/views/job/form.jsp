<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HR</title>
</head>
<body>
	<h1>직종 등록폼</h1>
	<form method="post" action="add.do">
		<p>아이디 : <input type="text" name="id"></p>
		<p>제목 : <input type="text" name="title"></p>
		<p>최소급여 : <input type="text" name="minSalary"></p>
		<p>최대급여 : <input type="text" name="maxSalary"></p>
		<button type="submit">등록</button>
	</form>
	
	
</body>
</html>