<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${student }</h1>
<h1>${student.id }</h1>
<h1>${student.name }</h1>
<h1>${student.dob }</h1>
<h1>${student.subjects }</h1>
<h1>${student.type }</h1>
<hr>
<h1>${student.address.street }</h1>
<h1>${student.address.city }</h1>

</body>
</html>