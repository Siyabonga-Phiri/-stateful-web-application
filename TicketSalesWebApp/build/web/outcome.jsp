<%-- 
    Document   : outcome
    Created on : Mar 15, 2025, 6:37:01 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <h1>Ticket Sales Outcome</h1>
        <%
        int num = (Integer)session.getAttribute("num");
        
        String message = " ";
        
        if(num > 0){
        message= "Congradulations you were able to secure a ticket";
        }
        else{
        num=0;    
        message="Sorry all out of tickets";
        }
        %>
        
        <b><%=message%></b><br>
        The number of ticket(s) is now : <%=num%>
        
        <br><br><br>
        <p>
            Click <a href="index.html">here to go</a> back
        </p>
    </body>
</html>
