<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>


<section class="frame">
	<h3>항목 수정</h3>
	<form method="POST">
		<%-- 실행에 필요한 값이 전달되지 않는다면 hidden형태로 추가로 전달하면 된다 --%>
		<input type="hidden" name="idx" value="${dto.idx }">
		<p>
			<label><input type="radio" name="category" value="버거" ${dto.category == '버거' ? 'checked': '' } placeholder="버거" required >버거</label>
			<label><input type="radio" name="category" value="음료" ${dto.category == '음료' ? 'checked': '' } placeholder="음료" required>음료</label>
		</p>
		<p><input type="text" name="name" placeholder="상품이름" value="${dto.name }" required></p>
		<p><input type="number" name="price" placeholder="상품가격" value="${dto.price }" required></p>
		<p><input type="text" name="imgName" placeholder="그림 파일 이름" value="${dto.imgName }" required></p>
		<p><textarea name="memo" placeholder="상세 설명"  required>${dto.memo }</textarea></p>
		<p><input type="submit"></p>
	</form>
</section>

</body>
</html>