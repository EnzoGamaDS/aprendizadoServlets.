<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="br.ucsal.Model"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Lista de empresas :
	<br>
	<ul>
		<c:forEach items="${modelo}" var="model">
			<li>${model.nome} - <fmt:formatDate value="${model.dataAbertura }"/></li>
		</c:forEach>
	</ul>
</body>
</html>