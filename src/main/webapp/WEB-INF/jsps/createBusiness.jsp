<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Your Business</title>
</head>
<body>



	<form action="saveNewBusiness">
		Your Company Name : <input type="text" name="companyName">
		Your Company Domain : <input type="text" name="companyDomain">
		Date Of Establishment :<input type="date" name="companyStartDate">
		<input type="submit">
	</form>

</body>
</html>