<%-- 
    Document   : indexFail
    Created on : Sep 15, 2023, 2:41:29 PM
    Author     : Yarman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      
 
        <link rel="stylesheet" type="text/css" href="styles/loginCss.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    <div class="login-form">
        <form action="login" method="post">
       <label for="user">User</label>
        <input type="text" id="user" name="user" required/><br>
        <label for="pass">Password</label>
        <input type="password" id="pass" name="pass" required/>
        <input type="submit" value="Login"/>
        </form> 
        <p>No te has loggeado</p>
        
    </div>
    </head>
    <body>
        
    </body>
</html>
