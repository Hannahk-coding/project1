<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<meta charset="UTF-8">
<title>UserList</title>
<body>
	<div class="container">
		<h2>게시판 목록</h2>
		<table class="user_list">
			<colgroup>
				<col width="15%"/>
				<col width="*"/>
				<col width="15%"/>
				<col width="20%"/>
			</colgroup>
			<thead>
				<tr>
					<th scope="col">번호</th>
					<th scope="col">아이디</th>
					<th scope="col">이름</th>
					<th scope="col">이메일</th>
					<th scope="col">등록일</th>
				</tr>										
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${fn:length(list) != 0} ">
						<tr>
							<td>${list.userIdx }</td>
							<td>${list.id }</td>
							<td>${list.name }</td>
							<td>${list.email }</td>
							<td></td>
						</tr>	
					</c:when>
					<c:otherwise>
						<tr>
							<td colspan="5">조회된 결과가 없습니다.</td>
						</tr>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>
	</div>
</body>
