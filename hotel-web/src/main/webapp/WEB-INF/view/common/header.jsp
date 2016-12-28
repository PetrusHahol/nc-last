<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<style>
			p{
				color: yellow;
				margin: 0;
				opacity: 1;
			}
		</style>
	</head>
	<body >
	<div>

		<c:choose>
			<c:when test="${user != null}">
				<p>
					<c:out value="${user.getLogin()} | ${user.getName()} ${user.getSurname()}"/>
				</p>
				<form action="/j_spring_security_logout">
				<input type="submit" value="LOGOUT">
			</form>
			</c:when>
		</c:choose>
	</div>
	</body>
</html>