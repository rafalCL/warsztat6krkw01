<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Twitter App - Register user</title>
</head>
<body>
    <form:form modelAttribute="user">
        <div>Register user</div>
        <div>
            <label for="email">Email</label>
            <form:input path="email" id="email" type="email"></form:input>
            <form:errors path="email"></form:errors>
        </div>
        <div>
            <label for="password">Password</label>
            <form:input path="password" id="password" type="password"></form:input>
            <form:errors path="password"></form:errors>
        </div>
        <div>
            <label for="repeatPassword">Repeat password</label>
            <form:input path="repeatPassword" id="repeatPassword" type="password"></form:input>
            <form:errors path="repeatPassword"></form:errors>
        </div>
        <div>
            <label for="firstName">First name</label>
            <form:input path="firstName" id="firstName" type="firstName"></form:input>
            <form:errors path="firstName"></form:errors>
        </div>
        <div>
            <label for="lastName">Last name</label>
            <form:input path="lastName" id="lastName" type="lastName"></form:input>
            <form:errors path="lastName"></form:errors>
        </div>
        <div>
            <input type="submit">
        </div>
    </form:form>
</body>
</html>
