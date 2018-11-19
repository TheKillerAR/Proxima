package ejb;

import java.util.ArrayList;

import javax.ejb.Local;

import dto.DocentiDTO;

@Local
public interface Docenti_ejbLocal {
	
	public ArrayList<DocentiDTO> mostraDocenti();

	public DocentiDTO cercaIddocente(int iddocente);

	public boolean aggiornaDocente(int iddocente, String nome, String cognome, String cf);

	public boolean inserisciDocente(int iddocente, String nome, String cognome, String cf);

	public boolean cancellaDocente(int iddocente);

}
