<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
    <head><title>Spizza</title></head>
    <body>
        <h2>Welcome to Spizza！！！</h2>
        <form:form>
            <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>
            <input type="text" name="phoneNumber"/><br/>
            <input type="submit" name="_eventId_phoneEntered" value="Lookup Customer"/>
        </form:form>
    </body>
</html>
