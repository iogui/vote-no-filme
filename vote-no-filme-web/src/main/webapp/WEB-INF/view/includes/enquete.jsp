<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<div id="divEnquete">
	<table id="tblEnquete">
		<tr>
			<td colspan="2"><fmt:message key="vfn.enquete.descricao"/></td>
		</tr>
		<tr>
			<td>
				<img src="<c:url value="${filme1.imagePath}" />" alt="${filme1.nome}" /> <br />
				<input id="filme1" type="radio" name="filme" value="${filme1.id}" checked="checked"/> <label for="filme1">${filme1.nome}</label>
			</td>
			<td>
				<img src="<c:url value="${filme2.imagePath}" />" alt="${filme1.nome}" /> <br />
				<input id="filme2" type="radio" name="filme" value="${filme2.id}"/> <label for="filme2">${filme2.nome}</label>
			</td>
		</tr>
	</table>
	
	<input id="btnSubmeterEnquete" type="button" value="<fmt:message key="vfn.enquete.enviar"/>" />
</div>