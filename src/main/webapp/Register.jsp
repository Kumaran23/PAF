<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Register</title>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
<link
	href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<link href="assets/css/login.css" rel="stylesheet" />
</head>
<body>
	<div class="container">
		<header>
			<h1>SEllNBye</h1>

		</header>
		<section>
			<div id="container_demo">
				<div id="wrapper">
					<div id="register" class="animate form">
						<form action="/register" autocomplete="on" method="post">
							<h1>Sign up</h1>
							<p>
								<label for="firstNamesignup" class="firstName">Your first name</label>
								<input id="firstNamesignup" name="firstName" pattern="[A-Za-z]*"
									title="Type valid first name"
									required="required" type="text"
									placeholder="first name" />
							</p>
						
							<p>
								<label for="emailsignup" class="youmail"> Your email</label> <input
									id="emailsignup" name="email" required="required"
									type="email" placeholder="mysupermail@mail.com" />
							</p>
						
							<p>
								<label for="passwordsignup" class="youpasswd">Your
									password </label> <input id="passwordsignup" name="password"
									required="required" type="password" placeholder="eg. X8df!90EO" />
							</p>
							<p>
								<label for="passwordsignup_confirm" class="youpasswd">Please
									confirm your password </label> <input id="passwordsignup_confirm"
									name="cpassword" required="required"
									type="password" placeholder="eg. X8df!90EO" />
							</p>
							<%
								if(request.getAttribute("msg") != null) {
									%>
									<p style="color: rgb(61, 157, 179);"><%= request.getAttribute("msg") %></p>
									<%
							}
							%>
									
							<p class="signin button">
								<input type="submit" value="Sign up" />
							</p>
							<p class="change_link">
								Already a member ? <a href="SellNbye/Login.jsp" class="to_register">
									Go and log in </a>
							</p>
						</form>
					</div>

				</div>
			</div>
		</section>
	</div>


	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>