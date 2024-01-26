<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section class="frame">
	<div>${dto.idx }</div>
	<div>${dto.category }</div>
	<div>${dto.name }</div>
	<div>${dto.price }</div>
	<div>
		<img src="${cpath }/resources/image/${dto.imgName}" height="200">
	</div>
	<div>${dto.memo }</div>
	
	<div>
		<a href="${cpath }/delete/${dto.idx }"><button>삭제</button></a>
	</div>
	<div>
		<a href="${cpath }/modify/${dto.idx }"><button>수정</button></a>
	</div>
</section>

</body>
</html>