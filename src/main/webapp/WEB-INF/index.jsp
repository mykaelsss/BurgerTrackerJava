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
	<table>
		<thead>
			<tr>
				<td>Burger Name</td>
				<td>Restaurant Name</td>
				<td>Rating (out of 5)</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="burger" items="${burgers}">
				<tr>
					<td><c:out value="${burger.name}"/></td>
					<td><c:out value="${burger.restaurantName}"/></td>
					<td><c:out value="${burger.rating}"/></td>
				</tr>
			</c:forEach>
		</tbody>	
	</table>
	<a href="/create">Add Burger</a>
</body>
</html>