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
					<td>Name</td>
					<td>Patronymic</td>
					<td>Workload</td>
					<td>Expierence</td>					
				</tr>
			</thead>
			<tbody>
				<c:forEach var="tutor" items="${tutors}">  
					<tr>
						<td>${tutor.id}</td>
						<td>${tutor.surname}</td>
						<td>${tutor.name}</td>
						<td>${tutor.patronymic}</td>
						<td>${tutor.workload}</td>
						<td>${tutor.expierence}</td>	
					</tr> 
				</c:forEach>
			</tbody>
		</table>
		
	</div>
</body>
</html>