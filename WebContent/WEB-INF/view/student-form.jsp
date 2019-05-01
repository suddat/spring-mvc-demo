<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Student Registration</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
			First name: <form:input path="firstName" />
		<br>
			Last name : <form:input path="lastName" />
		<br>
		<br>
		<form:select path="country">
			<form:options items="${theCountryOptions}" />
		</form:select>
		<br>
		<br>
			
			Favorite Language:
			
			<%-- Java <form:radiobutton path="favoriteLanguage" value="Java" />
			C# <form:radiobutton path="favoriteLanguage" value="C#" />
			PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
			Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" /> --%>
		<form:radiobuttons path="favoriteLanguage"
			items="${student.favoriteLanguageOptions}" />
		<br>
		<br>
			Operating Systems:
			Linux <form:checkbox path="operatingSystem" value="Linux"/>
			Mac Os <form:checkbox path="operatingSystem" value="MacOs"/>
			Windows <form:checkbox path="operatingSystem" value="Windows"/>
		<br><br>
		<input type="submit" value=Submit />
	</form:form>

</body>
</html>