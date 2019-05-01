<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Customer Confirmation</title>
</head>

<body>

	The Customer is Confirmed: ${customer.firstName} ${customer.lastName }
	<br>
	<br> Free Passes:${customer.freePasses}
	<br>
	<br> Postal Code: ${customer.postalCode}
	<br>
	<br>Course Code: ${customer.courseCode}
	<br>
	<br>
	<a href="/spring-mvc-demo">Home</a>
</body>
</html>