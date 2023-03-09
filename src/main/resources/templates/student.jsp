<%@ page contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Spring MVC</title>
</head>
<body>
<h2>Hello Form</h2>
<form:form action="student/update.html" modelAttribute="student">
    <div>Name:</div>
    <form:input path="name"/>

    <div>Mark:</div>
    <form:input path="mark"/>

    <div>Major:</div>
    <form:select path="major">
        <form:option value="APP">Ung dung phan mem</form:option>
        <form:option value="WEB">Thiet ke web</form:option>
    </form:select>

    <br>
    <button>Update</button>

</form:form>
</body>
</html>