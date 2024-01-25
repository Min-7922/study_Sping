<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member-list.jsp</title>
<style>
	table {
		border-collapse: collapse;
		border: 2px solid black;
	}
	tr, td {
		border: 1px solid black;
		padding: 10px;
	}
</style>
</head>
<body>

<h1>member-list.jsp</h1>
<hr>

<form method="POST">
	<p>
		<select name="searchType" required>
			<option value="">==검색유형을 선택하세요==</option>
			<option ${param.searchType == 'userid' ? 'selected' : '' } value="userid">아이디</option>		
			<option ${param.searchType == 'userid' ? 'selected' : '' } value="username">사용자이름</option>		
		</select>
		<input type="search" name="searchKeyword" 
			   placeholder="검색어를 입력하세요"
			   value="${param.searchKeyword }">
		<input type="submit" value="검색">
	</p>
</form>
<table>
	<c:forEach var="dto" items="${list }">
	<tr>
		<td>${dto.idx }</td>
		<td>${dto.userid }</td>
		<td>${dto.userpw }</td>
		<td>${dto.username }</td>
		<td>${dto.email }</td>
		<td>${dto.gender }</td>
		<td><a href="${cpath }/member/delete/${dto.idx }"><button>삭제</button></a></td>
	</tr>
	</c:forEach>
</table>

<p>
<a href="${cpath }/member/add"><button>추가</button></a>
</p>

</body>
</html>