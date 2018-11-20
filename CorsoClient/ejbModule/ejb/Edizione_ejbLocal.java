package ejb;

import java.util.Date;
import java.util.ArrayList;

import javax.ejb.Local;

import dto.EdizioneDTO;

@Local
public interface Edizione_ejbLocal {

	public ArrayList<EdizioneDTO> mostraEdizione();

	public EdizioneDTO cercaIdedizione(int idedizione);

	public boolean aggiornaEdizione(int idedizione, int numero, int idcorso, int idsede, int iddocente, Date datain,
			Date datafi);

	public boolean inserisciEdizione(int idedizione, int numero, int idcorso, int idsede, int iddocente, Date datain,
			Date datafi);

	public boolean cancellaEdizione(int idedizione);

}
