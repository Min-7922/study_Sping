<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>


<c:if test="${row != 0}">
	<c:redirect url="/" />
</c:if>

<script>
	alert('실패')
	histroy.go(-1)
</script>

</body>
</html>