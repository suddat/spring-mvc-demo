<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Student Confirmation</title>
</head>

<body>

	The Student is Confirmed: ${student.firstName} ${student.lastName }
	<br>
	<br> Country: ${student.country}
	<br>
	<br> Favorite Language: ${student.favoriteLanguage}
	<br>
	<br> Operating Systems:
	<ul>
		<c:forEach var="temp" items="${student.operatingSystem}">
			<li>${temp}</li>
		</c:forEach>
	</ul>

	<br>
	<br>
	<a href="/spring-mvc-demo">Home</a>
</body>
</html>