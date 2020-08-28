<%--
  Created by IntelliJ IDEA.
  User: promoscow
  Date: 17.07.17
  Time: 23:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Votes List</title>
</head>
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@ page import ="entities.User"%>
<body>
<h3> VOTE LIST <h3/>
<ul>
    <%
        List<User> names = (List<User>) request.getAttribute("userNames");
            for (User s : names) {
                out.println("<li>"+ s.name + " " + s.vote + " " + s.date + "</li>");
            }

    %>
</ul>
<button onclick="location.href='/ServletsTutorial/MainServlet'">Back to main</button>
</body>
</html>