<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="tags.jsp"  %>
<%@taglib uri="http://www.springframework.org/tags/form" 
          prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <form:form method="post" commandName="empleado"
                   
                   >
            <label>Nombre:</label>
            <br>
            <form:input path="nombre" />
            <form:errors path="nombre" />
            <br>
            <label>Salario</label>
            <form:input path="salario" />
            <form:errors path="salario" />
            
            <input type="submit" value="Ok">
            
        </form:form>
        
    </body>
</html>











