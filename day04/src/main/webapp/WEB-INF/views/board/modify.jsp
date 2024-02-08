<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<style>
	section {
		margin: 20px auto;
	}
</style>

<section>
<h3>게시글 수정</h3>
<form method="POST">
	<table>
		<tr>
			<td><input type="text" name="title" value="${dto.title }" placeholder="제목"></td>
		</tr>
		<tr>
			<td><input type="text" name="writer" value="${login.userid }" readonly></td>
		</tr>
		<tr>
			<td><textarea name="content" placeholder="내용을 작성하세요"
						  style="resize: none; width: 600px; height: 200px;">
			${dto.content }
			</textarea></td>
		</tr>
		<c:if test="${login.userid == 'admin' }">
		<tr>
			<td>
				<label>
					<input type="checkbox" name="isNotice" value="1" ${dto.isNotice == 1 ? 'checked':'' }>
				 공지로 등록하기
				</label>
			</td>
		</tr>
		</c:if>
	</table>
	
	<input type="submit" value="수정완료">
</form>
</section>

</body>
</html>