<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aggiungi informazioni al compito</title>
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

	<form method="post" action="/sollecitazione/addInfo">
		<c:forEach items="${compito} var="compito">
			<fieldset>
				<legend>
					Aggiungi informazioni al compito				
				</legend>
				<p>
					<label for="titolo">Titolo</label>
					<input type="text" name="titolo" value="<c:out value=\"${compito.titolo}\" />" />
				</p>
				<p>
					<label for="testo">Testo</label>
					<input type="textarea" name="testo" value="<c:out value=\"${compito.corpo.testo}\" />"/>
				</p>
				<p>
					<legend>Data Consegna Compito</legend>
					<label for="giorno">Giorno</label>
					<input type="text"  name="giorno" size="2" value="<c:out value=\"${compito.data.giorno}\" />"/>
					<label for="mese">Mese</label>
					<input type="text"  name="mese" size="2" value="<c:out value=\"${compito.data.mese}\" />"/>
					<label for="anno">Anno</label>
					<input type="text"  name="anno" size="4" value="<c:out value=\"${compito.data.anno}\" />"/>
				</p>
				<p>
					<label for="visibilita"> Scelta visibilita' post</label>
					<select name="visibilita">
						<option value="0"> Solo Creatore </option>
						<option value="1"> Creatore e Studenti Corso </option>
						<option value="2"> Tutti gli Utenti </option>
					</select>
				</p>
			</fieldset>
		</c:forEach>
	<form>
</body>
</html>