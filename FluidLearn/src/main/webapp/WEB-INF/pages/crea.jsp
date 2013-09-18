<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crea compito</title>
</head>
<body>
<form method="post" action="/sollecitaizione/new">
	<fieldset> 
		<legend>
			Scegli il corpo del Compito che vuoi creare
			<select name="isTesto">
				<option value="plugin"> tramite plugin </option>
				<option value="testo"> testuale <option>
			<select>
			<input type="submit" value="submit" />
		</legend>
	</fieldset>
<form>

</body>
</html>