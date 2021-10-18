<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<c:set var="path" value="${pageContext.request.contextPath }"/>
	<c:set var="user" value="${user }"/>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LostArkManager</title>
    <link rel="stylesheet" href="${path }/resources/header.css">
    <link rel="stylesheet" href="${path }/resources/index.css">
</head>
<body>
    <header>
        <h1 id="logo"><a href="${path }">LostArkManager</a></h1>
        <div id="user_menu">
        	<c:if test="${empty user }">
	            <a href="${path }/user/login" class="user_menu_child">로그인</a>
    	        <a href="${path }/user/join" class="user_menu_child">회원가입</a>	
        	</c:if>
        	
        	<c:if test="${not empty user }">
	            <a href="${path }/user/login" class="user_menu_child">로그아웃</a>
    	        <a href="${path }/user/join" class="user_menu_child">마이페이지</a>	
        	</c:if>
        </div>
        <input id="path" type="hidden" value="${path }">
    </header>
    <hr>