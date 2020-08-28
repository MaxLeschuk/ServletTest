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
    <title>VOTE</title>
</head>
<body>
<h3>VOTE<h3/>
<form method="post">
    <label>Name:
        <input type="text" name="name"><br />
    </label>
     <p><input name="YesOrNo" type="radio" value="YES">YES</p>
     <p><input name="YesOrNo" type="radio" value="NO">NO</p>
     <p><input type="submit" value="Okey" ></p>
</form>
</body>
</html>