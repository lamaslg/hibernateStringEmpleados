

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Empleados de la compañia a dia 
        <fmt:formatDate value="${fecha}" />
        
        <table>
            <tr>
                <td>
                    Nombre
                </td>
                <td>
                    Salario
                </td>
            </tr>
            <c:forEach items="${empleados}" var="empleado">
                 <tr>
                <td>
                    ${empleado.nombre}
                </td>
                <td>
                    ${empleado.salario}
                </td>
            </tr>
                
            </c:forEach>
        </table>
        
    </body>
</html>










