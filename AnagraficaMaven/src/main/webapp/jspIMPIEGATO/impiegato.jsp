<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>


<body>

<h2>Crea nuovo impiegato</h2>

<form action="ImpiegatoServlet" method="post">
	
	<input type='hidden' name="funzione" value="inserisci">
		
		<h4>Inserisci codice fiscale</h4>
		<input type="text" name="cf" /> <br>
		
		<h4>Inserisci nome</h4>
		<input type="text" name="nome" /> <br>
		
		<h4>Inserisci cognome</h4>
		<input type="text" name="cognome" />
				
		<br><br><input type="submit"value="Conferma" /> <br>
		
---------------------------------------------------------------------------

<h2>Aggiorna impiegato</h2>
	
	<h4>Inserisci codice fiscale</h4>
		<input type="text" name="cf" /> <br>
		
		<h4>Inserisci nome</h4>
		<input type="text" name="nome" /> <br>
		
		<h4>Inserisci cognome</h4>
		<input type="text" name="cognome" />
				
		<br><br><input type="submit"value="Conferma" /> <br>
		
---------------------------------------------------------------------------

<h2>Cerca impiegato</h2>
	
	<input type='hidden' name="funzione" value="cercaid">	
	
		<h4>Inserisci l' id dell'impiegato</h4>
		<input type="text" name="idimpiegato" />
		
		<br><br><input type="submit"value="Conferma" /> <br>
		
---------------------------------------------------------------------------

	

</form>
</body>
</html>