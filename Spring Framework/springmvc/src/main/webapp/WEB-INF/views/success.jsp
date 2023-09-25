<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page isELIgnored="false" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3 class="text-center">${Header }</h3>
<h1 style="color:red">${msg }</h1>
<h6 class="text-center">${Desc }</h6>
<h1>welcome, ${user.userName }</h1>
<h1>your email is ${user.email }</h1>
<h1>you password is ${user.password } try to secure your password</h1>
</body>
</html>