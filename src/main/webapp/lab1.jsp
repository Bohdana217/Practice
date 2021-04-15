<%-- 
    Document   : lab1
    Created on : Apr 12, 2021, 10:49:37 AM
    Author     : admin
--%>

<%@page import="fit.knu.ist.TA.MtFirstJavaClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>  

        <h1>This my lab1</h1>

        <%!MtFirstJavaClass nFJC = new MtFirstJavaClass(5);%>

        <%
         int x = nFJC.getMyInt();
         
          x+=3;
          x%=3;
          
        %>
        
        <p>8mod3 = <%=x%></p>
        




        <a href="index.jsp">Home</a>

    </body>
</html>
