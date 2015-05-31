<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>DaumKakao</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, user-scalable=no">
		<!-- JQuery -->
		<script src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
		<!-- Bootstrap -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
		<!-- Bootstrap end -->
	</head>
	<body>
		<div class="btn-group" role="group" aria-label="...">
			<button type="button" class="btn btn-default">서민기님 안녕하세요.</button>
			<button type="button" class="btn btn-default">상품등록</button>
			<button type="button" class="btn btn-default">로그아웃</button>
		</div>
		<div id="contents" class="panel panel-default">
			<div class="panel-heading"></div>
			<table class="table">
				<tr>
					<td>상품이미지</td>
					<td>상품명</td>
					<td>가격</td>
					<td>판매자</td>
				</tr>
				<tr>
					<td>상품이미지</td>
					<td>품질 좋은 상품 A 20% 할인 판매</td>
					<td>15,000</td>
					<td>(주)제주대학교</td>
				</tr>
			</table>
		</div>
	</body>
</html>