<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
		<title><fmt:message key="vfn.index.title"/></title>
		<link rel="stylesheet" href="<c:url value="/resources/css/styles.css" />" />
		<script type="text/javascript" src="<c:url value="/resources/js/jquery-1.11.0.min.js" />"></script>
		<script type="text/javascript" src="<c:url value="/resources/js/vote-no-filme.js" />"></script>
	</head>
	<body>
		<div id="divContainer">
			<h1><fmt:message key="vfn.index.title"/></h1>
			<div id="divConteudo">
			</div>
		</div>
		
	</body>
</html>