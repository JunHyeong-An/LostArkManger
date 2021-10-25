<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<link rel="stylesheet" href="${path }/resources/user/modify/modify.css">
	<div id="container">
        <aside>
            <ul>
                <li>회원 정보 수정</li>
                <li>내 캐릭터 정보 수정</li>
            </ul>
        </aside>

        <main>
            <div id="modify_user_info">
                <form id="modify_user_form">
                    <table>
                        <tr>
                            <td>ID</td>
                            <td><input id="id" name="id" autocomplete="off"></td>
                        </tr>
                        <tr>
                            <td>비밀번호</td>
                            <td><input id="modify_password" type="password" name="password"></td>
                            <td id="password_rule">영대문자 1자이상, 특수기호 1자이상을 포함시켜주세요</td>
                        </tr>
                        <tr>
                            <td>비밀번호 확인</td>
                            <td colspan="2"><input id="modify_password_check" type="password"></td>
                        </tr>
                        <tr>
                            <td>이름</td>
                            <td colspan="2"><input id="modify_name" name="name"></td>
                        </tr>
                        <tr>
                            <td>로스트아크 서버</td>
                            <td colspan="2"><input id="modify_server" name="server"></td>
                        </tr>
                        <tr>
                            <td colspan="3"><button type="button" id="modify_btn">회원 정보 수정</button></td>
                        </tr>
                    </table>
                </form>
            </div>

            <div id="my_character_modify">
                
            </div>
        </main>
    </div>
<%@ include file="../footer.jsp"%>