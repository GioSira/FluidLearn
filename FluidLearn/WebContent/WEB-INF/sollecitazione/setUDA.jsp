<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modifica Unita di Appartenenza del Compito</title>
</head>
<body>
 
	<!-- Anteprima post -->
	<!-- Aggiustare in modo tale da visualizzare solo l'unico elemento che viene ritornato -->
	<c:forEach items="${compito}" var="compito">
  		Titolo: <c:out value="${compito.titolo}" />
		<br />
		<br />
  		Testo: <c:out value="${compito.corpo.testo}" />
		<br />
		<br />
  		Data Scadenza: <c:out value="${compito.data_scadenza}" />
		<br />
		<br />
		Visibilita: <c:out value="${compito.visibilita}" />
		<br />
		<br />
		Unita' Didattica appartenente: <c:out value="${compito.unitaDAAppartenenza}" />
		<br />
		<br />
		<hr />
	</c:forEach>

	<br />
	<br />
	<br />

	<form method="post" action="/sollecitazione/modificaUDA">
		<!-- ritorno tutte le uda che possono essere selezionate dall'utente -->
		<c:forEach items="${uda}" var="uda">
			<fieldset>
				<legend>
					Aggiungi informazioni al compito				
				</legend>
					<section name="uda">
						<option value="<c:out value=\"${uda.titolo}" />\" /> </option>
					</section>
			</fieldset>
		</c:forEach>
	<form>
</body>
</html>