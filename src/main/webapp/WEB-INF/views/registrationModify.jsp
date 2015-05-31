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
			<button type="button" class="btn btn-default">(주)제주대학교님의 상품</button>
		</div>

		<div class="input-group">
			<span class="input-group-addon">상품 이미지</span>
			<input type="text" class="form-control" aria-label="Amount (to the nearest dollar)">
			<span class="input-group-addon">찾아보기</span>
		</div>

		<div class="input-group">
			<span class="input-group-addon" id="basic-addon1">상품명</span>
			<input type="text" class="form-control" placeholder="상품명 등록" aria-describedby="basic-addon1">
		</div>

		<div class="input-group">
			<span class="input-group-addon" id="basic-addon1">가격</span>
			<input type="text" class="form-control" placeholder="가격 등록" aria-describedby="basic-addon1">
		</div>

		<div class="input-group">
			<span class="input-group-addon" id="basic-addon1">상품 상세 설명</span>
			<input type="text" class="form-control" placeholder="상품 상세 설명 등록" aria-describedby="basic-addon1">
		</div>

		<div class="btn-group" role="group" aria-label="...">
			<button type="button" class="btn btn-default">등록</button>
			<button type="button" class="btn btn-default">취소</button>
		</div>
	</body>
</html>