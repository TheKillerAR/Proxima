<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>


<body>

<h2>Crea nuova frequenza</h2>

<form action="FrequenzaServlet" method="post">
	
	<input type='hidden' name="funzione" value="inserisci">
		
		<h4>Inserisci id edizione</h4>
		<input type="text" name="idedizione" /> <br>
		
		<h4>Inserisci id impiegato</h4>
		<input type="text" name="idimp" />
				
		<br><br><input type="submit"value="Conferma" /> <br>
		
---------------------------------------------------------------------------

<h2>Aggiorna frequenza</h2>
	
	<input type='hidden' name="funzione" value="aggiorna">
		
		<h4>Inserisci id edizione</h4>
		<input type="text" name="idedizione" /> <br>
		
		<h4>Inserisci id impiegato</h4>
		<input type="text" name="idimp" />
				
		<br><br><input type="submit"value="Conferma" /> <br>
		
---------------------------------------------------------------------------

<h2>Cerca frequenza</h2>
	
	<input type='hidden' name="funzione" value="cercaid">	
	
		<h4>Inserisci l' id della frequenza</h4>
		<input type="text" name="idfrequenza" />
		
		<br><br><input type="submit"value="Conferma" /> <br>
		
---------------------------------------------------------------------------

	

</form>
</body>
</html>