package ejb;

import java.util.ArrayList;

import dto.CorsoDTO;

import javax.ejb.Local;

@Local
public interface Corso_ejbLocal {

	public ArrayList<CorsoDTO> mostraCorso();
	public CorsoDTO cercaIdcorso(int idcorso);
	public boolean aggiornaCorso(int idcorso, String descrizione);
	public boolean inserisciCorso(int idcorso, String descrizione);
	public boolean cancellaCorso(int idcorso);
	
}
