<%-- 
    Document   : error
    Created on : Mar 15, 2025, 7:09:04 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body>
        <h1>Error Page!</h1>
         <%
        String name = pageContext.getServletContext().getInitParameter("comp_name");
        
        
        %>
        <%=name%> says :<br>
        You must have entered an invalid value or Entered a page that is not currently available.
        <br>
       
        Click <a href="index.html">here to </a>return 
    </body>
</html>
