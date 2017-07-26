<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form name="login" action="UserServlet" method="post">
		email:<input type="text" name="email"><br><br>
		password:<input type="text" name="password"><br><br>
		first_name:<input type="text" name="first_name"><br><br>
		last_name:<input type="text" name="last_name"><br><br>
		mobile:<input type="text" name="mobile"><br><br>
		<input type="submit">
	</form>
</body>
</html>