<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Welcome</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>${greeting}</h1>
				<p>${tagline}</p>
				<p class="pull-right">
					<security:authorize access="isAuthenticated()">
	  					Welcome  <security:authentication property="principal.username" />
	  					<a href="<c:url value="/logout" />">Logout</a>
					</security:authorize>
				</p>
			</div>
			<div class="container">
				<security:authorize access="isAnonymous()">
					<a href="<spring:url value='/login' />"
						class="btn btn-default pull-right"> Login </a>
				</security:authorize>
			</div>
		</div>
	</section>
	
</body>
</html>
