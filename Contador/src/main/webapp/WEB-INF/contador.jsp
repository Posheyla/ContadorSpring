<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>You have visited localhost:8080 <c:out value="${contador}"/></h1>
		<form action="/" method="GET">
			<button type="submit">
				Probar otra visita
			</button>
		</form>
	</body>
</html>