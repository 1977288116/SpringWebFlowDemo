<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head><title>Spizza</title></head>
<body>
<h2>Customer Registration</h2>
<form:form modelAttribute="customer">
    <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>
    <b>Phone number:</b><form:input path="phoneNumber"/><br/>
    <b>Name:</b><form:input path="name"/><br/>
    <b>Address:</b><form:input path="address"/><br/>
    <b>City:</b><form:input path="city"/><br/>
    <b>State:</b><form:input path="state"/><br/>
    <b>Zip Code:</b><form:input path="zipCode"/><br/>
    <input type="submit" name="_eventId_submit" value="Submit"/>
    <input type="submit" name="_eventId_cancel" value="Cancel"/>
</form:form>
</body>
</html>
