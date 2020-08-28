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
    <title>MainPage</title>
</head>
<body>
<h3>Voting Information</h3>
<%
Integer yes = (Integer) request.getAttribute("YES");
Integer no = (Integer) request.getAttribute("NO");
out.println("YES - " + yes + " NO - " + no );
%><br>
<a href ="/ServletsTutorial/VoteListServlet">Check Vote List<a/><br>
<a href ="/ServletsTutorial/AddVoteServlet">Add Vote <a/>
</body>
</html>