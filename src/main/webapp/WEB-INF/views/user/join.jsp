<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<link rel="stylesheet" href="${path }/resources/user/join/join.css">
<form id="join_form" method="POST">
	<h1>회원가입</h1>
	<section id="join_section">
		<table>
			<tr>
				<td>ID</td>
				<td><input name="id" autocomplete="off"></td>
				<td>
					<button id="id_check_btn">ID중복확인</button> <span id="id_permission">사용가능한 아이디입니다.</span>
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="password"></td>
				<td id="password_rule">영대문자 1자이상, 특수기호 1자이상을 포함시켜주세요</td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td colspan="2"><input type="password"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td colspan="2"><input name="name"></td>
			</tr>
			<tr>
				<td>로스트아크 서버</td>
				<td colspan="2"><input name="server"></td>
			</tr>
			<tr>
				<td colspan="3"><button id="join_btn">회원가입</button></td>
			</tr>
		</table>
	</section>
</form>
<script src="${path }/resources/user/join/join.js"></script>
<%@ include file="../footer.jsp"%>