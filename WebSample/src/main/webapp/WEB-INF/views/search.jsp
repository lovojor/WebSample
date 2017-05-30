<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><fmt:message key="title"/></title>
</head>
<body>
	<h1><fmt:message key="searchMovie.heading"/> </h1>
	<p><fmt:message key="searchMovie.intro"/></p>
	<form:form method="post" commandName="searchMovie">
	  <table width="95%" bgcolor="f8f8ff" border="0" cellspacing="0" cellpadding="5">
	    <tr>
	      <td align="right" width="10%"><fmt:message key="frmSearch.title"/> </td>
	        <td width="20%">
	          <form:input path="title"/>
	        </td>
	        <td width="70%">
	          <form:errors path="title" cssClass="error"/>
	        </td>
	    </tr>
	  </table>
	  <br>
	  <input type="submit" value="<fmt:message key="frmSearch.submit"/>">
	</form:form>
	<br/>
	<a href="<c:url value="hello.htm"/>"><fmt:message key="searchMovie.hello"/></a>
	<br/>
	<c:if test="${!empty dealers}">
		<h3><fmt:message key="searchMovie.dealers"/></h3>
		<ul>
		<c:forEach items="${dealers}" var="dealer">
			<li><c:out value="${dealer}"/></li>
		</c:forEach>
		</ul>	
	</c:if>
	
</body>
</html>