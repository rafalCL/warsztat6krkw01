<%--
  Created by IntelliJ IDEA.
  User: Edu
  Date: 31.03.2019
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="/WEB-INF/views/jspf/head_config.jspf"%>
    <title>Twitter App</title>
</head>
<body>
    <%@ include file="/WEB-INF/views/jspf/header.jspf"%>
    <%@ include file="/WEB-INF/views/jspf/main_menu.jspf"%>

    <div>You are at home. :)</div>
    <%@ include file="/WEB-INF/views/jspf/tweet/newest_tweets.jspf"%>

    <%@ include file="/WEB-INF/views/jspf/footer.jspf"%>
</body>
</html>
