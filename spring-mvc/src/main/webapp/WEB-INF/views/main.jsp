<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>메인 페이지</h1>
	
	<p>홈페이지 방문을 환영합니다.</p>
	<p>${message }</p>
	
	<h3>검색어 순위</h3>
	<ol>
		<c:forEach var="keyword" items="${rankings }">
			<li>${keyword }</li>
		</c:forEach>
	</ol>
</body>
</html>