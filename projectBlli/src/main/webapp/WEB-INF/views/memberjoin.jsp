<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="memberJoin" action="joinMemberByEmail.do" method="post">
		회원아이디(이메일)<input type="text" name="memberId"><br>
		회원 비밀번호<input type="password" name="memberPassword"><br>
		회원 이름<input type="text" name="memberName"><br>
		아이 이름<input type="text" name="babyName"><br>
		아이 생일<input type="date" name="babyBirthday"><br>
		<input type="submit" value="가입!">
	</form>
</body>
</html>