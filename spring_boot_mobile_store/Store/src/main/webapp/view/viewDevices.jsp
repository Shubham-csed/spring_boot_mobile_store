<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${devices.brandName} devices</title>
</head>
<body>
<h3>List of ${devices.brandName} devices</h3>
<hr>
<ul>
<c:forEach var="device" items="${devices.devices}">

<img width="300" src="<c:url value='${device.img}'/>"/>
<li> Name: ${device.name} <br> Category:${device.type} <br> Price:${device.price} </li>
<ul> Details
    <ul>Display :${device.display }</ul>
    <ul>Capacity :${device.capacity }</ul>
    <ul>In the Box :${device.box }</ul>
    <ul>Weight :${device.weight }</ul>
</ul>
<br/>

</c:forEach>
</ul>

</body>
</html>