package ejb;

import java.sql.Date;
import java.util.ArrayList;

import javax.ejb.Remote;

import dto.EdizioneDTO;

@Remote
public interface Edizione_ejbRemote {

	public ArrayList<EdizioneDTO> mostraEdizione();

	public EdizioneDTO cercaIdedizione(int idedizione);

	public boolean aggiornaEdizione(int idedizione, int numero, int idcorso, int idsede, int iddocente, Date datain,
			Date datafi);

	public boolean inserisciEdizione(int idedizione, int numero, int idcorso, int idsede, int iddocente, Date datain,
			Date datafi);

	public boolean cancellaCorso(int idedizione);

}
