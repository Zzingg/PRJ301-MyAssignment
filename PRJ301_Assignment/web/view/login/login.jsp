<%-- 
    Document   : home
    Created on : Jun 5, 2022, 2:29:47 PM
    Author     : vinht
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="login" method="POST">
            user <input type="text" name="user"/><br>
            pass <input type="password" name="pass"/><br>
            <input type="submit" value="login">
        </form>
        <h5>
            ${error}
        </h5>
    </body>
</html>
