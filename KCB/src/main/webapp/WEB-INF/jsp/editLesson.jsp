<%@ page language="java" 
		 contentType="text/html; charset=UTF-8"
    	 pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    	 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
	<div class="container">
		<h1><spring:message code="${action}"/></h1>
		<form:form role="form" method="post" commandName="lesson">
			<div class="form-group">
			    <label for="id"><spring:message code="table.id"/>:</label>
				<form:input path="id" type="text" class="form-control" id="id"/>	
			</div>
			<div class="form-group">
			    <label for="group"><spring:message code="table.group"/>:</label>
				<form:input path="groupId" type="text" class="form-control" id="group"/>	
			</div>
			<div class="form-group">		
				<label for="room"><spring:message code="table.room"/>:</label>
				<form:input path="roomId" type="text" class="form-control" id="room"/>
			</div>
			<div class="form-group">
				<label for="tutor"><spring:message code="table.tutor"/>:</label>
				<form:input path="tutorId" type="text" class="form-control" id="tutor"/>
			</div>
			<div class="form-group">
				<label for="subject"><spring:message code="table.subject"/>:</label>
				<form:input path="subjectId" type="text" class="form-control" id="subject"/>
			</div>
			<div class="form-group">
				<label for="lecture"><spring:message code="table.lecture"/>:</label>
				<form:input path="lectureId" type="text" class="form-control" id="lecture"/>
			</div>			
			<button type="submit" class="btn btn-default">
				<spring:message code="go.save"/>
			</button>
		</form:form>	
	</div>
</body>
</html>