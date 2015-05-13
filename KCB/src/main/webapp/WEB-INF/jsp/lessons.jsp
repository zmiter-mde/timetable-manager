<%@ page language="java" 
		 contentType="text/html; charset=UTF-8"
    	 pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    	 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	    	 
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Timetable</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="<c:url value="/css/bootstrap.min.css" />" rel="stylesheet">
</head>
<body>
	<div class="table-responsive"> 
		<a href="createLesson.html"><spring:message code="title.createLesson"/></a>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<td><spring:message code="table.id"/></td>
					<td><spring:message code="table.group"/></td>
					<td><spring:message code="table.room"/></td>
					<td><spring:message code="table.floor"/></td>
					<td><spring:message code="table.name"/></td>
					<td><spring:message code="table.surname"/></td>
					<td><spring:message code="table.patronymic"/></td>
					<td><spring:message code="table.title"/></td>
					<td><spring:message code="table.lecture"/></td>
					<td><spring:message code="table.faculty"/></td>
					<td><spring:message code="title.editLesson"/></td>
					<td><spring:message code="title.deleteLesson"/></td>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="lesson" items="${lessons}">  
					<tr>
						<td>${lesson.id}</td>
						<td>${lesson.group}</td>
						<td>${lesson.room}</td>
						<td>${lesson.floor}</td>
						<td>${lesson.name}</td>
						<td>${lesson.surname}</td>
						<td>${lesson.patronymic}</td>
						<td>${lesson.title}</td>	
						<td>${lesson.lectureNumber}</td>	
						<td>${lesson.faculty}</td>
						<td>
							<a href="editLesson.html?lessonId=${lesson.id}">
								<spring:message code="title.editLesson"/>
							</a>
						</td>	
						<td>
							<a href="deleteLesson.html?id=${lesson.id}">
								<spring:message code="title.deleteLesson"/>
							</a>
						</td>	
					</tr> 
				</c:forEach>
			</tbody>
		</table>
		
	</div>
</body>
</html>