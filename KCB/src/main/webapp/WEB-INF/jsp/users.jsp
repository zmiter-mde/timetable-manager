<%@ page language="java" 
		 contentType="text/html; charset=UTF-8"
    	 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	    	 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${greeting}</h1>
	<div>
		<table>
			<thead>
				<tr>
					<td>Id</td>
					<td>Surname</td>
					<td>Patronymic</td>
					<td>Username</td>
					<td>Password</td>					
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${users}">  
					<tr>
						<td>${user.id}</td>
						<td>${user.surname}</td>
						<td>${user.patronymic}</td>
						<td>${user.username}</td>
						<td>${user.pass}</td>	
					</tr> 
				</c:forEach>
			</tbody>
		</table>
		
	</div>
</body>
</html>