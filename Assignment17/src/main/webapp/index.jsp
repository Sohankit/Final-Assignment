<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgreen">
<h1 style="text-align: center;">WELCOME TO INEURON BLOGS</h1>

	<c:if test="${! empty message }">
		<h1 style="text-align: center; color: red;">${message}</h1>
	</c:if>
	
	<form method="post" action="./view">
		<table align="center">
			<tr>
				<td>ENTER BLOG ID TO DISPLAY YOUR DETAILS</td>
				<td><input type="number" name="blogid" required="required"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit"></td>
			</tr>

		</table>
	</form>
	
	<h1 style="text-align: center;">PLEASE FILL FORM TO UPLOAD NEW BLOG</h1>

	<form method="post" action="./insertion">
		<table align="center">
			<tr>
				<td>ENTER BLOG TITLE</td>
				<td><input type="text" name="title"></td>

			</tr>

			<tr>
				<td>ENTER BLOG DESCRIPTION (max 100 words)</td>
				<td><textarea name="description" rows="2" cols="50"
						maxlength="100"></textarea></td>
			</tr>

			<tr>
				<td>ENTER CONTENT (max 250 words)</td>
				<td><textarea name="content" rows="4" cols="50" maxlength="250"></textarea></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit"></td>
			</tr>

		</table>
	</form>
</body>
</html>