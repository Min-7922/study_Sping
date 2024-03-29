<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section class="frame">
	<div>
		<a href="${cpath }/add"><button>추가</button></a>
	</div>
	
	<div class="box">
		<c:forEach var="dto" items="${list }">
		<div class="item">
			<div class="img">
				<a href="${cpath }/view/${dto.idx}">
					<img src="${cpath }/resources/image/${dto.imgName}" height="120">
				</a>
			</div>
			<div class="name">
				${dto.name }
			</div>
			<div class="price">
				${dto.price }원
			</div>
		</div>
		</c:forEach>
	</div>
</section>

</body>
</html>