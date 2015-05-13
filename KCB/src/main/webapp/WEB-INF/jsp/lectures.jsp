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
					<td>Number</td>
					<td>Day of week</td>				
				</tr>
			</thead>
			<tbody>
				<c:forEach var="lecture" items="${lectures}">  
					<tr>
						<td>${lecture.id}</td>
						<td>${lecture.number}</td>
						<td>${lecture.dayOfWeek}</td>	
					</tr> 
				</c:forEach>
			</tbody>
		</table>
		
	</div>
</body>
</html>