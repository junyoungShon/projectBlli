<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>이곳은 인덱스입니다 아무나 들어올 수 있죠.</h1>
	<sec:authorize access="isAuthenticated()">
		<sec:authentication property="name"/>님 환영해요
	</sec:authorize>
	<ul>
		<li><a href="${initParam.root}member_goMain.do">goMain.do</a>
		<li><a href="${initParam.root}admin_goAdminPage.do">goAdminPage.do</a>
	
	<sec:authorize access="isAuthenticated()">
		<li><a href="${initParam.root}j_spring_security_logout">로그아웃</a>
	</sec:authorize>
	</ul>
</body>
</html>