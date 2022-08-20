<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Supplier Data</title>
</head>
<body>
  <table border="1" width="70%">	
	<c:forEach var="c" items="${suppliers}">
	  <tr>
	     <td>
	 	   <c:out value="${c.supId}"/>
	     </td>
	     <td>
	 	   <c:out value="${c.supName}"/>
	     </td>
	     <td>
	  	  <c:out value="${c.street}"/>
	     </td>
	     <td>
	    	<c:out value="${c.state}"/>
	     </td>
	     <td>
	    	<c:out value="${c.zip}"/>
	     </td>
	 </tr> 
	</c:forEach> 
  </table>	
</body>
</html>