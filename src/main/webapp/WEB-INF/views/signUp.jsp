<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600' rel='stylesheet' type='text/css'>
		<link href="//netdna.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css" rel="stylesheet">
		<link href="/resources/css/signUp.css" rel='stylesheet' type='text/css'>
	</head>
	<body>
		<div class="testbox">
			<h1>Sign Up</h1>

			<form action="insert" method="post">
				<hr>
					<div class="accounttype">
						<input type="radio" value="personal" id="radioOne" name="authority" checked/>
						<label for="radioOne" class="radio">Personal</label>
						<input type="radio" value="company" id="radioTwo" name="authority" />
						<label for="radioTwo" class="radio">Company</label>
					</div>
				<hr>
					<label id="icon" for="name"><i class="icon-envelope "></i></label>
					<input type="text" name="email" id="name" placeholder="Email" required/>
					<label id="icon" for="name"><i class="icon-user"></i></label>
					<input type="text" name="name" id="name" placeholder="Name" required/>
					<label id="icon" for="name"><i class="icon-shield"></i></label>
					<input type="password" name="password" id="name" placeholder="Password" required/>
					<div class="gender">
						<input type="radio" value="male" id="male" name="gender" checked/>
						<label for="male" class="radio">Male</label>
						<input type="radio" value="female" id="female" name="gender" />
						<label for="female" class="radio">Female</label>
					</div> 
				<p>By clicking Register, you agree on our <a href="#">terms and condition</a>.</p>
				<input type="submit" class="button" value="SignUp">
				<!-- a href="./insert" class="button">SignUp</a -->
			</form>
		</div>
	</body>
</html>