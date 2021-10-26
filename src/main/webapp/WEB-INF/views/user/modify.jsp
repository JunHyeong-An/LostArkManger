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
                <form method="post" id="modify_user_form">
                    <table>
                        <tr>
                            <td>ID</td>
                            <td><input id="modify_id" name="id" autocomplete="off" value="${user.id }"></td>
                        </tr>
                        <tr>
                            <td>이름</td>
                            <td colspan="2"><input id="modify_name" name="name" value="${user.name }" required></td>
                        </tr>
                        <tr>
                            <td>로스트아크 서버</td>
                            <td colspan="2"><input id="modify_server" name="server" value="${user.server }" required></td>
                        </tr>
                        <tr>
                            <td colspan="3"><button id="modify_btn">회원 정보 수정</button></td>
                        </tr>
                    </table>
                    <input type="hidden" name="password" value="${user.password }">
                </form>
            </div>

            <div id="my_character_modify">
                
            </div>
        </main>
    </div>
<%@ include file="../footer.jsp"%>