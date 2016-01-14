<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<sec:authorize access="isAuthenticated()">
		<script type="text/javascript">
			location.href=${initParam.root}+'member_goMain.do';
		</script>
	</sec:authorize>
	<sec:authorize access="isAnoymous()">
		<script type="text/javascript">
			location.href=${initParam.root}+'login.do';
		</script>
	</sec:authorize>
</body>
</html>