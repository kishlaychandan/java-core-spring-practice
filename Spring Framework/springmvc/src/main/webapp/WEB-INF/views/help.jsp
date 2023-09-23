<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>This is help page</h1>

<%
/* String name=(String)request.getAttribute("name");
Integer Roll=(Integer)request.getAttribute("RollNo");
LocalDateTime time=(LocalDateTime)request.getAttribute("date"); */
%>
<%-- <h1>Hello my name is <%= name %></h1>
<h1>My Roll number is <%= Roll %></h1>
<h1>Todays date time is <%= time.toString() %></h1>
--%>
<h1>used</h1>
<h1>Hello my name is ${name}</h1>
<h1>My Roll number is ${RollNo}</h1>
<h1>Todays date time is ${date}</h1>
<hr>
${marks}

<c:forEach var="item" items="${marks }">
<h1>${item }</h1>
</c:forEach>

</body>
</html>