<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="/WEB-INF/views/jspf/head_config.jspf"%>

    <title>Twitter App - Register user</title>
</head>
<body>
<%@ include file="/WEB-INF/views/jspf/header.jspf"%>
<%@ include file="/WEB-INF/views/jspf/main_menu.jspf"%>

    <form:form modelAttribute="user">
        <div>Login user</div>
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
            <input type="submit">
        </div>
        <div>
            <c:out value="${msg}"></c:out>
        </div>
    </form:form>

<%@ include file="/WEB-INF/views/jspf/footer.jspf"%>
</body>
</html>
