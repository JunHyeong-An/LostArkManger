<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="header.jsp" %>
    <main>
        <aside id="index_side_menu">
            <div id="calc"><a href="">각인계산기</a></div>
            <div id="manage"><a href="">배럭관리</a></div>
        </aside>
        
        <section id="my_characters">
            <c:if test="${empty user }">
            	로그인후 이용 가능합니다.
            </c:if>
            <c:if test="${not empty user and empty characterList }">
            	캐릭터명을 입력해주세요
            	<form action="${path }/getCharacter" method="get">
            		<input name="character_name">
            		<button>검색</button>
            	</form>
            </c:if>
            <c:if test="${not empty user and not empty characterList }">
            	<table>
            		<tr>
            			<td>케릭터명</td><td>아이템 레벨</td>
            		</tr>
            		<c:forEach var="ch" items="${characterList }">
            			<tr>
            				<td>${ch.charName }</td><td>${ch.charLevel }</td>
            			</tr>
            		</c:forEach>
            	</table>
            </c:if>
        </section>
    </main>
	<%@ include file="footer.jsp" %>
