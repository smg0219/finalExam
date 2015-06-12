<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login</title>
		<link rel="stylesheet" href="/resources/css/signIn.css">
	</head>
	<body class="align">
		<div class="site__container">
			<div class="grid__container">
				<form action="certification" method="post" class="form form--login">
					<div class="form__field">
						<label class="fontawesome-user" for="login__username"><span class="hidden">Username</span></label>
						<input id="login__username" type="text" name="email" class="form__input" placeholder="Username" required>
					</div>
					<div class="form__field">
						<label class="fontawesome-lock" for="login__password"><span class="hidden">Password</span></label>
						<input id="login__password" type="password" name="password" class="form__input" placeholder="Password" required>
					</div>
					<div class="form__field">
						<input type="submit" value="Sign In">
					</div>
					<div class="form__field">
						<a href="./index">Cancel</a>
						<!-- input type="submit" value="Sign In" -->
					</div>
				</form>
			<p class="text--center">Not a member? <a href="./signUp">Sign up now</a> <span class="fontawesome-arrow-right"></span></p>
			</div>
		</div>
	</body>
</html>