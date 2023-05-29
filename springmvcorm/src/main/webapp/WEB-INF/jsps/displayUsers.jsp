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
<%=request.getAttribute("items") %>
<p> ${items[0]}</p> <!-- Verify the array length -->

	<table>
		<tr>
			<th>id</th>
			<th>name</th>
			<th>email</th>
		</tr>
		<c:forEach var="user" items="${users}">
			<tr>
				<td> ${user.getId()} </td>
				<td> ${user.getName()} </td>
				<td> ${user.getEmail()} </td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>