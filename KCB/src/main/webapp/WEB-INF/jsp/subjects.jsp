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
					<td>Title</td>
					<td>Need PC</td>
					<td>Need lab</td>			
				</tr>
			</thead>
			<tbody>
				<c:forEach var="subject" items="${subjects}">  
					<tr>
						<td>${subject.id}</td>
						<td>${subject.title}</td>
						<td>${subject.needPc}</td>
						<td>${subject.needLab}</td>
					</tr> 
				</c:forEach>
			</tbody>
		</table>
		
	</div>
</body>
</html>