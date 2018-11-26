<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>


<body>

<h2>Crea nuova sede</h2>

<form action="SedeServlet" method="post">
	
	<input type='hidden' name="funzione" value="inserisci">
		
		<h4>Inserisci il nome della sede</h4>
		<input type="text" name="nomesede" /> <br>
		
		<h4>Inserisci la via</h4>
		<input type="text" name="via" /> <br>
		
		<h4>Inserisci la citta</h4>
		<input type="text" name="citta" /> <br>
		
		<h4>Inserisci il cap</h4>
		<input type="text" name="cap" /> <br>
				
		<br><input type="submit"value="Conferma" /> <br>
		
---------------------------------------------------------------------------

<h2>Aggiorna sede</h2>
	
	<input type='hidden' name="funzione" value="aggiorna">
		
		<h4>Inserisci il nome della sede</h4>
		<input type="text" name="nomesede" /> <br>
		
		<h4>Inserisci la via</h4>
		<input type="text" name="via" /> <br>
		
		<h4>Inserisci la citta</h4>
		<input type="text" name="citta" /> <br>
		
		<h4>Inserisci il cap</h4>
		<input type="text" name="cap" /> <br>
				
		<br><input type="submit"value="Conferma" /> <br>		
		
		
---------------------------------------------------------------------------

<h2>Cerca sede</h2>
	
	<input type='hidden' name="funzione" value="cercaid">	
	
		<h4>Inserisci l' id della sede</h4>
		<input type="text" name="idsede" /> <br>
		
		<br><input type="submit"value="Conferma" /> <br>
		
---------------------------------------------------------------------------

	

</form>
</body>
</html>