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
			<button type="button" class="btn btn-default">품질 좋은 상품 A 20% 할인 판매</button>
			<button type="button" class="btn btn-default">목록</button>
			<button type="button" class="btn btn-default">수정</button>
		</div>
		<div class="row">
			<div class="col-sm-6 col-md-4">
				<div class="thumbnail">
					<img src="#" alt="상품이미지">
					<div class="caption">
						<h3>상품 상세 설명</h3>
						<p>상품 A는 품질이 좋습니다.</p>
						<p>상품 A는 가격이저렴합니다.</p>
						<p>상품 A는 20% 할인 가격으로 제공됩니다.</p>
					</div>
				</div>
			</div>
		</div>
		<span>가격 : 15,000원</span><br/>
		<span>판매자 : (주)제주대학교</span><br/>
		<button type="button" class="btn btn-default">구매</button>
	</body>
</html>