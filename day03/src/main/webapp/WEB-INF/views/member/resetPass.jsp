<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<!-- id,email 입력하면 랜덤 pw를 만들어 이메일로 전송 -->
	<h3>비밀번호 재설정</h3>
	<form method="POST">
		<p><input type="text" name="userid" placeholder="ID" required autofocus></p>
		<p><input type="email" name="email" placeholder="email" required></p>
		<p><input type="submit" value="확인"></p>
	</form>
</section>

</body>
</html>