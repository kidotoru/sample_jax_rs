<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:forEach var="message" items="${it}">
    <div><c:out value="${message}"></c:out></div>
</c:forEach>