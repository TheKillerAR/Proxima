package ejb;

import java.util.ArrayList;

import javax.ejb.Remote;

import dto.DocentiDTO;

@Remote
public interface Docenti_ejbRemote {

	public ArrayList<DocentiDTO> mostraDocenti();

	public DocentiDTO cercaIddocente(int iddocente);

	public boolean aggiornaDocente(int iddocente, String nome, String cognome, String cf);

	public boolean inserisciDocente(int iddocente, String nome, String cognome, String cf);

	public boolean cancellaDocente(int iddocente);

}
