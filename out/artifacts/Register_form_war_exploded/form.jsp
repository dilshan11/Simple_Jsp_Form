<%--
  Created by IntelliJ IDEA.
  User: Sachithra
  Date: 12/23/2018
  Time: 8:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form  action="/database" method="post">

  <table border="0">
    <tr>
      <td><lable>Frist Name:</lable></td>
      <td> <input type="text" value="john" name="fname"></td>
    </tr>
    <tr>
      <td><lable>Second Name:</lable></td>
      <td><input type="text" value="seana" name="sname"><br></td>
    </tr>
    <tr>
      <td><lable>Age:</lable></td>
      <td> <input type="text" value="29" name="age"></td>
    </tr>
    <tr>
      <td><lable>user name:</lable></td>
      <td><input type="text" value="Enything" name="userName"></td>

    </tr>
    <tr>
      <td> <lable>password:</lable></td>
      <td><input type="text" value="password" name="password"></td>
    </tr>
    <tr>
      <td><button type="submit">submit</button></td>

    </tr>
  </table>
  </form>
  </body>
</html>
