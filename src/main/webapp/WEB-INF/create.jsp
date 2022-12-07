<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Burger</title>
</head>
<body>
	<form:form action="/" method="post" modelAttribute="burger"> 
		<form:errors path="name" /><br/>
		<form:errors path="restaurantName" /><br/>
		<form:errors path="rating" /><br/>
		<form:errors path="notes" />
 		<div>
			<form:label path="name">Name</form:label>
			<form:input path="name" type="text"/>
		</div>
		<div>
			<form:label path="restaurantName">Restaurant Name</form:label>
			<form:input path="restaurantName" type="text"/>
		</div>
		<div>
			<form:label path="rating">Rating</form:label>
			<form:input path="rating" type="number"/>
		</div>
		<div>
			<form:label path="notes">Notes</form:label>
			<form:textarea rows="4" cols="20" path="notes"/>
		</div>
		<input type="submit" value="Submit"/>
	</form:form> 
</body>
</html>